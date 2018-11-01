package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.ClientsPage;
import utility.Constant;
import utility.ExcelUtils;

public class Client_Page_Action {
	public static void SetUpExcel(String sheet) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Sheet");
	}

	public static String AddNewClientTest(WebDriver driver) throws Exception {
		SetUpExcel("Client");
		String clientName = ExcelUtils.getCellData(1, 1);
		String contactName = ExcelUtils.getCellData(1, 2);
		String email = ExcelUtils.getCellData(1, 3);
		Integer registryNumber = ExcelUtils.getCellData1(1, 4);
		String country = ExcelUtils.getCellData(1, 5);
		String city = ExcelUtils.getCellData(1, 6);
		String street = ExcelUtils.getCellData(1, 7);
		Integer zip = ExcelUtils.getCellData1(1, 8);
		//String dateAdded = ExcelUtils.getCellData(1, 9);
		String code = ExcelUtils.getCellData(1, 10);
		//String agreementDay = ExcelUtils.getCellData(1, 11);
		String status = ExcelUtils.getCellData(1, 12);

		ClientsPage.addClientName(driver, clientName);
		ClientsPage.addContactName(driver, contactName);
		ClientsPage.addEmail(driver, email);
		ClientsPage.addRegistryNumber(driver, registryNumber);
		ClientsPage.addClientCountries(driver, country);
		ClientsPage.addClientCity(driver, city);
		ClientsPage.addClientStreet(driver, street);
		ClientsPage.addClientZip(driver, zip);
		// ClientsPage.addDateAdded(driver, dateAdded);
		ClientsPage.addCode(driver, code);
		// ClientsPage.addAgreementDay(driver, agreementDay);
		ClientsPage.addStatus(driver, status);
		ClientsPage.getSaveBtn(driver);
		return "Pass";
	}
}
