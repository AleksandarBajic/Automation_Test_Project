package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.BusinessPage;
import utility.Constant;
import utility.ExcelUtils;

public class Busines_Page_Action {

	public static void SetUpExcel(String sheet) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, sheet);
	}

	public static void Execute(WebDriver driver) throws Exception {
		SetUpExcel("Business");
		Thread.sleep(3000);
		BusinessPage.getNewBusniess(driver).click();
		Thread.sleep(200);
		BusinessPage.getBusinessName(driver).click();
		Thread.sleep(3000);
		
		String BusinessName = ExcelUtils.getCellData(1, 1);
		String Countries = ExcelUtils.getCellData(1, 2);
		String City = ExcelUtils.getCellData(1, 3);
		String Street = ExcelUtils.getCellData(1, 4);
		Integer Zip = ExcelUtils.getCellData1(1, 5);
		Integer RegistryNumber = ExcelUtils.getCellData1(1, 6);
		

		Thread.sleep(3000);

		BusinessPage.addBusinessName(driver, BusinessName);
		BusinessPage.addCountry(driver, Countries);
		BusinessPage.addCity(driver, City);
		BusinessPage.addStreet(driver, Street);
		BusinessPage.addZip(driver, Zip);
		BusinessPage.addRegistryNumber(driver, RegistryNumber);
	}
		public static void Execute1(WebDriver driver) throws Exception {
		SetUpExcel("Bank");
		Thread.sleep(3000);
		
		BusinessPage.getAddBankAccount(driver).click();
		Thread.sleep(3000);
		
		BusinessPage.getBankName(driver).click();
		
		
		
		String BankName = ExcelUtils.getCellData(1, 1);
		String AccountNumber = ExcelUtils.getCellData(1, 2);
		String SwiftNumber = ExcelUtils.getCellData(1, 3);
		String PaymentInstruction = ExcelUtils.getCellData(1, 4);
		String Currency = ExcelUtils.getCellData(1, 5);

		Thread.sleep(3000);
		
		BusinessPage.addBankName(driver, BankName);
		BusinessPage.addAccountNumber(driver, AccountNumber);
		BusinessPage.addSwiftNumber(driver, SwiftNumber);
		BusinessPage.addPaymentInstruction(driver, PaymentInstruction);
		BusinessPage.addCurrency(driver);
		BusinessPage.addCurrencyClick(driver, Currency);
		BusinessPage.getSaveBtn(driver).click();
	}

}
