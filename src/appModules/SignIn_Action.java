package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;

import pageObjects.LogInPage;
import utility.Constant;
import utility.ExcelUtils;

public class SignIn_Action {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet2");
	}

	public static void Execute(WebDriver driver) throws Exception {

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);

		LogInPage.UserName(driver).sendKeys(sUserName);

		LogInPage.Password(driver).sendKeys(sPassword);

		LogInPage.LogInButton(driver).click();

		HomePage.FindBusinessBtn(driver).click();

	}

}
