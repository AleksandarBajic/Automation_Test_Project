package automationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import appModules.Busines_Page_Action;
import appModules.SignIn_Action;
import pageObjects.HomePage;

import utility.ExcelUtils;
import utility.Constant;

public class Apache_POI_TC {

	private static WebDriver driver = null;

	public static void main(String[] args) throws Exception {

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "LogIn");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(Constant.URL);

		SignIn_Action.Execute(driver);

		System.out.println("Login Successfully.");
		Busines_Page_Action.Execute(driver);
		//HomePage.LogOut(driver).click();
		System.out.println("Logout Successfully");

		driver.quit();

		ExcelUtils.setCellData("Pass", 1, 3);

	}

}