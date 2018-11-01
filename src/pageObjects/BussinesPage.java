package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BussinesPage {

	public static WebElement element = null;

	public static WebElement getNewBusniess(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"add-new-business\"]/div"));
		return element;

	}

	public static WebElement getBusinessName(WebDriver driver) {
		element = driver.findElement(By.id("business-form-name"));
		return element;
	}

	public static WebElement getCountries(WebDriver driver) {
		element = driver.findElement(By.id("business-form-country"));
		return element;
	}

	public static WebElement getCity(WebDriver driver) {
		element = driver.findElement(By.id("business-form-city"));
		return element;
	}

	public static WebElement getStreet(WebDriver driver) {
		element = driver.findElement(By.id("business-form-street"));
		return element;
	}

	public static WebElement getZip(WebDriver driver) {
		element = driver.findElement(By.id("business-form-zip"));
		return element;
	}

	public static WebElement getRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.id("business-form-zip"));
		return element;
	}

	public static WebElement getAddBankAccount(WebDriver driver) {
		element = driver.findElement(By.id("business-form-add-bank-btn"));
		return element;
	}

	public static WebElement getBankName(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-name"));
		return element;

	}

	public static WebElement getAccountNumber(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-num"));
		return element;
	}

	public static WebElement getSwiftNumber(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-swf-num"));
		return element;
	}

	public static WebElement getPaymentInstruction(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-pay-inst"));
		return element;
	}

	public static WebElement getCurrency(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__selections']"));
		return element;
	}

	public static WebElement getAddBankAccountBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return element;
	}

	public static WebElement getCancelBankAccountBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		return element;
	}

	public static void addBusinessName(WebDriver driver, String input) {
		getBusinessName(driver).sendKeys(input);
	}

	public static void addCountry(WebDriver driver, String countryName) {
		Actions builder = new Actions(driver);
		Actions country = builder.moveToElement(getCountries(driver)).click().sendKeys(countryName);
		country.sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
		country.perform();
	}

	public static void addCity(WebDriver driver, String input) {
		getCity(driver).sendKeys(input);

	}

	public static void addStreet(WebDriver driver, String input) {
		getStreet(driver).sendKeys(input);
	}

	public static void addZip(WebDriver driver, Integer input) {
		getZip(driver).sendKeys(input.toString());
	}

	public static void addRegistryNumber(WebDriver driver, Integer input) {
		getRegistryNumber(driver).sendKeys(input.toString());
	}

	public static void addAddBankAccount(WebDriver driver, String input) {
		getAddBankAccount(driver).sendKeys(input);
	}

	public static void addBankName(WebDriver driver, String input) {
		getBankName(driver).sendKeys(input);
	}

	public static void addAccountNumber(WebDriver driver, String input) {
		getAccountNumber(driver).sendKeys(input);
	}

	public static void addSwiftNumber(WebDriver driver, String input) {
		getSwiftNumber(driver).sendKeys(input);
	}

	public static void addPaymentInstruction(WebDriver driver, String input) {
		getPaymentInstruction(driver).sendKeys(input);
	}

	public void addCurrency(WebDriver driver) {
		Actions builder = new Actions(driver);
		Action currency = builder.moveToElement(getCurrency(driver)).click().moveToElement(getAddBankAccount(driver))
				.click().build();
		currency.perform();
	}

	public static void addAddBankAccountBtn(WebDriver driver, String input) {
		getAddBankAccountBtn(driver).sendKeys(input);
	}

	public static void addCancelBankAccountBtn(WebDriver driver, String input) {
		getCancelBankAccountBtn(driver).sendKeys(input);
	}
}