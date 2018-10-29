package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HomePage {
	
	public static WebElement element = null;

	public static WebElement FindBusinessBtn(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[@id='nav-bar-business']//div[@class='v-btn__content']"));
		return element;

	}
	
}
