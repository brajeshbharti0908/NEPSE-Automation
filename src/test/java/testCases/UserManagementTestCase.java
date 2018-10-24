package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import context.TestContext;
import managers.FileReaderManager;

import utils.ExcelReader;
import utils.Log;

public class UserManagementTestCase extends BasePage {

	TestContext context = TestContext.getTestContextInstance();

	WebDriver driver = context.getWebDriverManager().getDriver();
	String sheetPath = FileReaderManager.getInstance().getConfigFileReader().getExcelSheetPath();
	String sheetName = "External_User_Registration";

	/*
	 * 
	 * Method Name:TC001_UserRegistration_CompanyRep_and_Approval Return Type: No
	 * Return type. Parameter Type:No Parameter. This method executes company
	 * registration till approval of company is nots application
	 * 
	 * 
	 */
	@Test
	public void TC001_UserRegistration_CompanyRep_and_Approval() throws InterruptedException {

		
		Log.info("Starting TC001_UserRegistration_CompanyRep_and_Approval");
		String company_Name = ExcelReader.readCellData(sheetPath, sheetName, 4, 0);
		String user_Name = ExcelReader.readCellData(sheetPath, sheetName, 4, 1);

		context.getPageObjectManager().getNotsApplicationHomePage().enterAdminCredentialsandLogin();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnGlobalAdministration();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserManagement();

		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnExternalUserRegistration();
		context.getPageObjectManager().getExternalUserRegistration().selectExternalUserType("Company Representative");
		context.getPageObjectManager().getExternalUserRegistration().enterCompanyUserDetails(company_Name, user_Name);
		context.getPageObjectManager().getExternalUserRegistration().enterAuthorizedPersonDetails();

		context.getPageObjectManager().getExternalUserRegistration().uploadDocumentsAndSignUp();

		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnGlobalAdministration();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserManagement();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserRegistrationApproval();
		context.getPageObjectManager().getUserRegistrationApproval()
				.approveRegistrationForCompanyRepresentative(user_Name);
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserRegistrationApproval();
		context.getPageObjectManager().getUserRegistrationApproval().verifyUserApprovedAndLogout(user_Name);
		
		Log.info("Ended - TC001_UserRegistration_CompanyRep_and_Approval");

	}
	/*
	 * 
	 * Method Name:TC002_UserRegistration_MemberRep_and_Approval Return Type: No
	 * Return type. Parameter Type:No Parameter. This method executes member
	 * registration till approval of member is nots application
	 * 
	 * 
	 */

	// @Test
	public void TC002_UserRegistration_MemberRep_and_Approval() throws InterruptedException {
		
		Log.info("Starting - TC002_UserRegistration_MemberRep_and_Approval");
		String member_Name = ExcelReader.readCellData(sheetPath, sheetName, 7, 0);
		String user_Name = ExcelReader.readCellData(sheetPath, sheetName, 7, 1);

		context.getPageObjectManager().getNotsApplicationHomePage().enterAdminCredentialsandLogin();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnGlobalAdministration();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserManagement();

		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnExternalUserRegistration();
		context.getPageObjectManager().getExternalUserRegistration().selectExternalUserType("Member Representative");
		context.getPageObjectManager().getExternalUserRegistration().enterMemberUserDetails(member_Name, user_Name);
		context.getPageObjectManager().getExternalUserRegistration().enterAuthorizedPersonDetails();

		context.getPageObjectManager().getExternalUserRegistration().uploadDocumentsAndSignUp();

		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnGlobalAdministration();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserManagement();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserRegistrationApproval();
		context.getPageObjectManager().getUserRegistrationApproval()
				.approveRegistrationForCompanyRepresentative(user_Name);
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserRegistrationApproval();
		context.getPageObjectManager().getUserRegistrationApproval().verifyUserApprovedAndLogout(user_Name);
		Log.info("Ended - TC002_UserRegistration_MemberRep_and_Approval");

	}

	public void TC087_UserRegistration_Market_Maker_Rep_and_Approval() {
		Log.info("Starting - TC087_UserRegistration_Market_Maker_Rep_and_Approval");
		
		String market_Maker_Name = ExcelReader.readCellData(sheetPath, sheetName, 10, 0);
		String user_Name = ExcelReader.readCellData(sheetPath, sheetName, 10, 1);

		context.getPageObjectManager().getNotsApplicationHomePage().enterAdminCredentialsandLogin();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnGlobalAdministration();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserManagement();

		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnExternalUserRegistration();
		context.getPageObjectManager().getExternalUserRegistration()
				.selectExternalUserType("Market Maker Representative");
		context.getPageObjectManager().getExternalUserRegistration().enterMarketMemberUserDetails(market_Maker_Name,
				user_Name);
		context.getPageObjectManager().getExternalUserRegistration().enterAuthorizedPersonDetails();

		context.getPageObjectManager().getExternalUserRegistration().uploadDocumentsAndSignUp();

		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnGlobalAdministration();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserManagement();
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserRegistrationApproval();
		context.getPageObjectManager().getUserRegistrationApproval()
				.approveRegistrationForCompanyRepresentative(user_Name);
		context.getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser().clickOnUserRegistrationApproval();
		context.getPageObjectManager().getUserRegistrationApproval().verifyUserApprovedAndLogout(user_Name);
		
		Log.info("Ended - TC087_UserRegistration_Market_Maker_Rep_and_Approval");

	}

}
