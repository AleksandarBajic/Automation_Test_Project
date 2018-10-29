package pageObjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class ClientsPage {

	public static WebElement element = null;

	public static WebElement GetNewClient(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//a[@class='primary mt-5 mr-5 v-btn v-btn--flat v-btn--router v-btn--small']//div[@class='v-btn__content']"));
		return element;

	}

	public static WebElement GetClientname(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[@class='v-label error--text']"));
		return element;

	}

	public static WebElement GetEmail(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs6 mr-2']//input[@type='text']"));
		return element;

	}

	public static WebElement GetClientCountries(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__slot']//input[@type='text']"));
		return element;

	}

	public static WebElement GetClientCity(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='flex xs3']//div[@class='v-input v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return element;

	}

	public static WebElement GetContactName(WebDriver driver) {
		element = driver.findElement(By.xpath("//label[contains(text(),'Contact Name')]"));
		return element;

	}

	public static WebElement GetRegistryNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//form[@class='ma-2 pa-3 text-xs-center']//div[2]//div[2]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;

	}

	public static WebElement GetClientStreet(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//body[@cz-shortcut-listen='true']/div[@id='app']/div[@class='application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='container']/div[@class='mt-1 white v-card']/div[@class='v-card__actions']/div[@class='layout column']/div[@class='layout']/div[@class='flex secondary xs12']/form[@class='ma-2 pa-3 text-xs-center']/div[@class='layout']/div[3]/div[1]/div[2]/div[1]/div[1]/input[1]"));
		return element;

	}

	public static WebElement GetClientZip(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='layout']//div[@class='layout']//div[4]//div[1]//div[2]//div[1]//div[1]//input[1]"));
		return element;

	}

	public static WebElement GetDateAdded(WebDriver driver) {
		element = driver.findElement(
				By.xpath("//div[@class='flex xs3']//div[@class='v-dialog__container']//input[@type='text']"));
		return element;

	}

	public static WebElement GetCode(WebDriver driver) {
		element = driver.findElement(By.xpath(
				"//div[@class='v-input code-field v-text-field v-input--has-state error--text warning--text']//input[@type='text']"));
		return element;
	}

	public static WebElement GetAgreementDate(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='flex xs3 ml-3']//input[@type='text']"));
		return element;
	}

	public static WebElement GetStatus(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-input--selection-controls__ripple']"));
		return element;
	}

}
