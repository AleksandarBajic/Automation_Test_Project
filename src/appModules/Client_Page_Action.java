package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class Client_Page_Action {
	public static void SetUpExcel() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData1 + Constant.File_TestData1, "Client");
	}

	public static void Execute(WebDriver driver) throws Exception {
		//SetUpExcel("Client");
		SetUpExcel();
		Thread.sleep(3000);
		ClientsPage.getClientPageBtn(driver).click();
		Thread.sleep(3000);
		ClientsPage.getNewClient(driver).click();
		Thread.sleep(3000);

		String ClientName = ExcelUtils.getCellData(1, 1);
		String ContactName = ExcelUtils.getCellData(1, 2);
		Thread.sleep(2000);
		String Email = ExcelUtils.getCellData(1, 3);
		Integer RegistryNumber = ExcelUtils.getCellData1(1, 4);
		String Country = ExcelUtils.getCellData(1, 5);
		String City = ExcelUtils.getCellData(1, 6);
		String Street = ExcelUtils.getCellData(1, 7);
		Integer Zip = ExcelUtils.getCellData1(1, 8);
		String dateAdded = ExcelUtils.getCellData(1, 9);
		String Code = ExcelUtils.getCellData(1, 10);
		String agreementDay = ExcelUtils.getCellData(1, 11);
		String Status = ExcelUtils.getCellData(1, 12);

		ClientsPage.addClientName(driver, ClientName);
		ClientsPage.addContactName(driver, ContactName);
		ClientsPage.addEmail(driver, Email);
		ClientsPage.addRegistryNumber(driver, RegistryNumber);
		ClientsPage.addClientCountries(driver, Country);
		ClientsPage.addClientCity(driver, City);
		ClientsPage.addClientStreet(driver, Street);
		ClientsPage.addClientZip(driver, Zip);
		ClientsPage.addDateAdded(driver, dateAdded);
		ClientsPage.addCode(driver, Code);
		ClientsPage.addAgreementDay(driver, agreementDay);
		ClientsPage.addStatus(driver, Status);
		ClientsPage.getSaveBtn(driver).click();
	}
}
