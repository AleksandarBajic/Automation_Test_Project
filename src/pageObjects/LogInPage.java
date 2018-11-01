package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	public static WebElement element = null;

	public static WebElement UserName(WebDriver driver) {
		element = driver.findElement(By.id("login-form-email"));
		return element;
	}

	public static WebElement Password(WebDriver driver) {
		element = driver.findElement(By.id("login-pass"));
		return element;
	}

	public static WebElement LogInButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-btn__content']"));
		return element;
	}
}
