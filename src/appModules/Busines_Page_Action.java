package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BussinesPage;
import utility.Constant;
import utility.ExcelUtils;

public class Busines_Page_Action {

	public static void SetUpExcel(String sheet) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, sheet);
	}

	public static void Execute(WebDriver driver) throws Exception {
		SetUpExcel("Business");
		Thread.sleep(3000);
		BussinesPage.getNewBusniess(driver).click();
		
		BussinesPage.getBusinessName(driver).click();
		Thread.sleep(3000);
		
		String BusinessName = ExcelUtils.getCellData(1, 1);
		String Countries = ExcelUtils.getCellData(1, 2);
		String City = ExcelUtils.getCellData(1, 3);
		String Street = ExcelUtils.getCellData(1, 4);
		Integer Zip = ExcelUtils.getCellData1(1, 5);
		System.out.println(Zip);
		Integer RegistryNumber = ExcelUtils.getCellData1(1, 6);
		System.out.println(RegistryNumber);

		Thread.sleep(3000);

		BussinesPage.addBusinessName(driver, BusinessName);
		BussinesPage.addCountry(driver, Countries);
		BussinesPage.addCity(driver, City);
		BussinesPage.addStreet(driver, Street);
		BussinesPage.addZip(driver, Zip);
		BussinesPage.addRegistryNumber(driver, RegistryNumber);
		
		SetUpExcel("Bank");
		
		BussinesPage.getAddBankAccount(driver);

		String addBankName = ExcelUtils.getCellData(1, 1);
		String addAccountNumber = ExcelUtils.getCellData(1, 2);
		String addSwiftNumber = ExcelUtils.getCellData(1, 3);
		String addPaymentInstruction = ExcelUtils.getCellData(1, 4);
		String addCurrency = ExcelUtils.getCellData(1, 5);

	}

}
