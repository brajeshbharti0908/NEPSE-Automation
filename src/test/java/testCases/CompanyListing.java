package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import context.TestContext;
import managers.FileReaderManager;
import utils.ExcelReader;
import utils.Log;

public class CompanyListing extends BasePage {
	@Test
	public void TC_004_companyreg_alreadycreatedaspartofusermanagementanditsapproval() {
		
		Log.info("Starting TC_004_companyreg_alreadycreatedaspartofusermanagementanditsapproval ");

		String sheetPath = FileReaderManager.getInstance().getConfigFileReader().getExcelSheetPath();
		String sheetName = "TC_004_companyreg";
		String companyName = ExcelReader.readCellData(sheetPath, sheetName, 4, 1);

		String notsUserName = ExcelReader.readCellData(sheetPath, sheetName, 1, 0);
		String notsPassword = ExcelReader.readCellData(sheetPath, sheetName, 1, 1);

		TestContext.getTestContextInstance().getPageObjectManager().getNotsApplicationHomePage()
				.enterUserCredentialsAndLogin(notsUserName, notsPassword);
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForCompanyRep()
				.clickOnCompanyManagement();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForCompanyRep()
				.clickOnManageCompanyApplication();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForCompanyRep()
				.clickOnCompanyCreation();
		TestContext.getTestContextInstance().getPageObjectManager().getCompanyCreationPage()
				.enterCompanyDetailsSaveAndClickNext();
		TestContext.getTestContextInstance().getPageObjectManager().getCompanyCreationPage()
				.enterCompanyAddressDetailsSaveAndClickNext();

		TestContext.getTestContextInstance().getPageObjectManager().getCompanyCreationPage()
				.enterCompanyOwnershipDetailsSaveAndClickNext();

		TestContext.getTestContextInstance().getPageObjectManager().getCompanyCreationPage()
				.enterFinancialInformationAndSave();
		TestContext.getTestContextInstance().getPageObjectManager().getCompanyCreationPage().submitAndLogout();

		TestContext.getTestContextInstance().getPageObjectManager().getNotsApplicationHomePage()
				.NavigateToNotsApplicationHomePage();

		TestContext.getTestContextInstance().getPageObjectManager().getNotsApplicationHomePage()
				.OpenNotsApplicationHomePage();
		TestContext.getTestContextInstance().getPageObjectManager().getNotsApplicationHomePage()
				.enterAdminCredentialsandLogin();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser()
				.clickOnCompanyManagement();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser()
				.clickOnManageCompanyApplication();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser()
				.clickOnCompanyApplication();

		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.selectCompanyApplicationsFilterListBox();
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.enterCompanyNameInSearchField(companyName);

		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.verifyIsCompanyNameDisplayed(companyName);
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.verifyApplicationStatus("NEW");

		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage().clickOnEyeSymbol();
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.clickONApplicationDetails();
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.verifyCompanyInformationAndApprove();
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.enterCommentsAndApprove();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser()
				.clickOnCompanyManagement();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser()
				.clickOnManageCompanyApplication();
		TestContext.getTestContextInstance().getPageObjectManager().getNepseOnlineTradingSystemPageForAdminUser()
				.clickOnCompanyApplication();

		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.selectCompanyApplicationsFilterListBox();
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.enterCompanyNameInSearchField(companyName);

		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.verifyIsCompanyNameDisplayed(companyName);
		TestContext.getTestContextInstance().getPageObjectManager().getcompanyApplicationPage()
				.verifyApplicationStatus("APPROVED");
		
		Log.info(" Ended TC_004_companyreg_alreadycreatedaspartofusermanagementanditsapproval ");

	}

	// @Test
	public void equityistingcreationandapproval() {

	}
}