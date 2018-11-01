package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement element = null;

	public static WebElement FindBusinessBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
		return element;

	}

	public static WebElement LogOut(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='v-btn__content'][contains(text(),'Logout')]"));
		return element;
	}
}
