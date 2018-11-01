package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ClientsPage {

	public static WebElement element = null;

	public static WebElement getNewClient(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return element;

	}

	public static WebElement getClientName(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[@class='v-label error--text']"));
		return element;

	}

	public static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return element;

	}

	public static WebElement getClientCountries(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return element;

	}

	public static WebElement getClientCity(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='flex xs3']//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return element;

	}

	public static WebElement getContactName(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Contact Name')]"));
		return element;

	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;

	}

	public static WebElement getClientStreet(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//body[@cz-shortcut-listen='true']/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return element;

	}

	public static WebElement getClientZip(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;

	}

	public static WebElement getDateAdded(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
		return element;

	}

	public static WebElement getCode(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='v-input code-field v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return element;
	}

	public static WebElement getAgreementDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
		return element;
	}

	public static WebElement getStatus(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
		return element;
	}

	public static WebElement getStatusLabel(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Status: Active')]"));
		return element;
	}

	public static WebElement getSaveBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Save')]"));
		return element;
	}

	public static void addNewClient(WebDriver driver, String input) {
		getNewClient(driver).sendKeys(input);
	}

	public static void addClientName(WebDriver driver, String input) {
		getClientName(driver).sendKeys(input);
	}

	public static void addEmail(WebDriver driver, String input) {
		getEmail(driver).sendKeys(input);
	}

	public static void addClientCountries(WebDriver driver, String countryName) {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getClientCountries(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	public static void addClientCity(WebDriver driver, String input) {
		getClientCity(driver).sendKeys(input);
	}

	public static void addContactName(WebDriver driver, String input) {
		getContactName(driver).sendKeys(input);
	}

	public static void addRegistryNumber(WebDriver driver, Integer input) {
		getRegistryNumber(driver).sendKeys(input.toString());
	}

	public static void addClientStreet(WebDriver driver, String input) {
		getClientStreet(driver).sendKeys(input);
	}

	public static void addClientZip(WebDriver driver, Integer input) {
		getClientZip(driver).sendKeys(input.toString());
	}

	public static void addCode(WebDriver driver, String input) {
		getCode(driver).sendKeys(input);
	}

	public static void addStatus(WebDriver driver, String status) throws InterruptedException {
		String currentStatus = getStatus(driver).getText();
		String cs = currentStatus.split(":")[1].trim();
		if (!status.equals(cs)) {
			getStatus(driver).click();
		}
	}

	public static void addSaveBtn(WebDriver driver) {
		getSaveBtn(driver);
	}

}
