package pageObjects;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class BussinesPage {

	public static WebElement element = null;

	public static WebElement GetNewBusniess(WebDriver driver) {
		element = driver.findElement(By.id("add-new-business"));
		return element;

	}

	public static WebElement GetBusinessName(WebDriver driver) {
		element = driver.findElement(By.id("business-form-name"));
		return element;
	}

	public static WebElement GetCountries(WebDriver driver) {
		element = driver.findElement(By.id("business-form-country"));
		return element;
	}

	public static WebElement GetCity(WebDriver driver) {
		element = driver.findElement(By.id("business-form-city"));
		return element;
	}

	public static WebElement GetStreet(WebDriver driver) {
		element = driver.findElement(By.id("business-form-street"));
		return element;
	}

	public static WebElement GetZip(WebDriver driver) {
		element = driver.findElement(By.id("business-form-zip"));
		return element;
	}

	public static WebElement GetAddBankAccount(WebDriver driver) {
		element = driver.findElement(By.id("business-form-add-bank-btn"));
		return element;
	}

	public static WebElement GetBankName(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-name"));
		return element;

	}

	public static WebElement GetAccountNumber(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-num"));
		return element;
	}

	public static WebElement GetSwiftNumber(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-swf-num"));
		return element;
	}

	public static WebElement GetPaymentInstruction(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-pay-inst"));
		return element;
	}

	public static WebElement GetCurrency(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-select__selections']"));
		return element;
	}

	public static WebElement GetAddBankAccountBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Add bank account')]"));
		return element;
	}

	public static WebElement GetCancelBankAccountBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[contains(text(),'Cancel')]"));
		return element;
	}
	public static void WebElement AddBusinessName(WebDriver driver) {
		element = driver.findElement(By.id("business-form-name"));
		
	}

	public void addCountry() {

		Action country = builder.moveToElement(countriesField).click().sendKeys("serbia").build();
		country.perform();
		Action choose = builder.moveToElement(countryList.get(0)).click().build();
		choose.perform();
	}

	public static void AddCity(WebDriver driver) {
		element = driver.
		
	}

	public static void WebElement AddStreet(WebDriver driver) {
		element = driver.findElement(By.id("business-form-street"));
		
	}

	public static void WebElement AddZip(WebDriver driver) {
		element = driver.findElement(By.id("business-form-zip"));
		
	}

	public static void WebElement AddBankAccount(WebDriver driver) {
		element = driver.findElement(By.id("business-form-add-bank-btn"));
		
	}

	public static void WebElement AddBankName(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-name"));
		

	}

	public static void WebElement AddAccountNumber(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-num"));
		
	}

	public static void WebElement AddSwiftNumber(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-swf-num"));
		
	}

	public static void WebElement AddPaymentInstruction(WebDriver driver) {
		element = driver.findElement(By.id("bank-dialog-pay-inst"));
		
	}

	public void addCurrency() {
		Action currency = builder.moveToElement(currencyField).click().moveToElement(selectBankPage.get(0)).click()
				.build();
		currency.perform();
	}

}