package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import context.TestContext;
import utils.Log;

public class NepseOnlineTradingSystemPageForAdminUser {

	WebDriver driver;

	public NepseOnlineTradingSystemPageForAdminUser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(.,'Membership Management')]")
	private WebElement membershipManagement;

	@FindBy(xpath = "//span[contains(.,'Member Registration Applications')]")
	private WebElement memberRegistrationApplications;

	@FindBy(xpath = "//a[contains(.,'Global Administration')]")
	private WebElement globalAdministration;

	@FindBy(xpath = "//a[contains(.,'User Management')]")
	private WebElement userManagement;

	@FindBy(xpath = "//span[contains(.,'User Registration Approval')]")
	private WebElement userRegistrationApproval;

	@FindBy(xpath = "//span[contains(.,'Company Management')]")
	private WebElement companyManagement;

	@FindBy(xpath = "//span[contains(.,'Manage Company Application')]")
	private WebElement manageCompanyApplication;

	@FindBy(xpath = "//ul[@class='menu__dropmenu']//ul[@class='menu__dropmenu']//li//span[contains(text(),'Company Application')]")
	private WebElement companyApplication;

	@FindBy(xpath = "//i[@class='nf-angledown']")
	private WebElement userNameArrow;

	@FindBy(xpath = "//span[contains(.,'Log Out')]")
	private WebElement logout;

	@FindBy(xpath = "//span[contains(.,'External User Registration')]")
	private WebElement externalUserRegistration;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/nots[1]/app-menubar[1]/aside[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]")
	private WebElement corporateActions;

	@FindBy(xpath = "//span[contains(text(),'Corporate Actions Management')]")
	private WebElement corporateActionsManagement;

	@FindBy(xpath = "//span[contains(text(),'Securities Corporate Actions Review')]")
	private WebElement securitiesCorporateActionsReview;

	@FindBy(xpath = "//span[contains(.,'Update Company  Details')]")
	private WebElement updateCompanyDetails;

	@FindBy(xpath = "//span[contains(.,'Update IPO Bidding Details')]")
	private WebElement updateIPOBiddingDetails;

	@FindBy(xpath = "//span[contains(.,'Update Symbol And Company Name')]")
	private WebElement updateSymbolAndCompanyName;

	@FindBy(xpath = "//li[@class='menu__dropdown open']//span[contains(text(),'Authorization Management')]")
	private WebElement authorizationManagement;
	
	@FindBy(xpath = "//span[contains(.,'Authorize Corporate Actions')]")
	private WebElement authorizeCorporateActions;

	@FindBy(xpath = "//span[contains(.,'Delist/Suspend/Revoke Management')]")
	private WebElement delist_suspend_revoke_management;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/nots[1]/app-menubar[1]/aside[1]/nav[1]/ul[1]/li[3]/ul[1]/li[4]/a[1]/span[1]")
	private WebElement shareGroups;

	@FindBy(xpath = "//span[contains(text(),'Symbol Creation')]")
	private WebElement symbolCreation;

	@FindBy(xpath = "//span[contains(.,'Securities Management')]")
	private WebElement securitesManagement;

	@FindBy(xpath = "//span[contains(.,'Sector Management')]")
	private WebElement sectorManagement;
	
	
	
	
	

	
	
	
	
	
	
	
	

	/*
	 * 
	 * Method Name:clickOnGlobalAdministration Return Type: No Return type.
	 * Parameter Type: No Parameter This method clicks on GlobalAdministration
	 * 
	 */

	public void clickOnGlobalAdministration() {
		try {

			TestContext.getTestContextInstance().getWait().waitForElement(globalAdministration);

			Log.info("waiting to click on global administartion");
			globalAdministration.click();
			Log.info("clicked on global administartion");
			Reporter.log("clicked on global administration successfully");
		}

		catch (Exception e) {

			Reporter.log("Failed to click on global administration");

		}

	}
	/*
	 * 
	 * Method Name:clickOnUserManagement Return Type: No Return type. Parameter
	 * Type: No Parameter This method clicks on User Management
	 * 
	 */

	public void clickOnUserManagement() {
		try {
			Log.info("waiting to click on user management");
			TestContext.getTestContextInstance().getWait().waitForElement(userManagement);
			userManagement.click();

			Log.info("clicked on user management");
			Reporter.log("Failed to click on user management");
		}

		catch (Exception e) {

			Reporter.log("Clicked on user management successfully");

		}
	}

	/*
	 * 
	 * Method Name:clickOnUserRegistrationApproval Return Type: No Return type.
	 * Parameter Type: No Parameter This method clicks on User Registration Approval
	 * 
	 */

	public void clickOnUserRegistrationApproval() {
		try {
			TestContext.getTestContextInstance().getWait().waitForElement(userRegistrationApproval);
			Log.info("waiting to click on user registration approval");
			userRegistrationApproval.click();

			Thread.sleep(10000);
			Reporter.log("Clicked on user registration approval successfully");

			Log.info("clicked on user registration approval");
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
		} catch (Exception e) {

			Reporter.log("Failed to click on user registraion");

		}

	}

	public void clickOnCompanyManagement() {
		try {
			TestContext.getTestContextInstance().getWait().waitForElement(companyManagement);
			companyManagement.click();
			Reporter.log("Clicked on CompanyManagent successfully");
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info(e.getMessage());
			Reporter.log("Failed to click on CompanyManagement.." + e.getMessage());

		}

	}

	public void clickOnManageCompanyApplication() {

		try {

			TestContext.getTestContextInstance().getWait().waitForElement(manageCompanyApplication);

			manageCompanyApplication.click();
			Reporter.log("Successfully clicked on Manage Company Application");
		}

		catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Failed to click on Manage Company Application " + e.getMessage());

		}
	}

	public void clickOnCompanyApplication() {

		try {
			TestContext.getTestContextInstance().getWait().waitForElement(companyApplication);
			companyApplication.click();
			Reporter.log("Clicked on Company Application");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Failed to click on Company Applicaion." + e.getMessage());
		}

	}

	public void clickOnUserNameArrow() {

		try {

			Log.info("waiting to click on username arrow");
			TestContext.getTestContextInstance().getWait().waitForElement(userNameArrow);
			userNameArrow.click();
			Thread.sleep(2000);

			Log.info("clicked on username arrow");
		}

		catch (Exception e) {

			Log.info("Exception caught while clicking on username arrow");
		}
	}

	public void clickOnLogout() {

		try {
			Log.info("waiting to click on logout");
			TestContext.getTestContextInstance().getWait().waitForElement(logout);
			logout.click();

			Log.info("clicked on logout");

			Thread.sleep(2000);
			Reporter.log("Successfully logout");
		}

		catch (Exception e) {

			Reporter.log("Failed to logout");
		}

	}

	public void clickOnExternalUserRegistration() {

		try {
			Log.info("Waiting to click on exter user registration");
			TestContext.getTestContextInstance().getWait().waitForElement(externalUserRegistration);
			externalUserRegistration.click();
			Thread.sleep(1000);
			Log.info("Clicked on external user registration");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on external user registration" + e.getMessage());
			Reporter.log("Failed to click on external user registration" + e.getMessage());
		}

	}

	public void clickOnCorporateActions() {

		try {
			Log.info("Waiting to click on corporate actions");
			TestContext.getTestContextInstance().getWait().waitForElement(corporateActions);
			corporateActions.click();
			Thread.sleep(1000);
			Log.info("Clicked on corporate actions");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on corporate actions" + e.getMessage());
			Reporter.log("Failed to click on corporate actions" + e.getMessage());

		}

	}

	public void clickOnSecuritesCorporateActionsReview() {

		try {
			Log.info("Waiting to click on securitiesCorporateActionsReview");
			TestContext.getTestContextInstance().getWait().waitForElement(securitiesCorporateActionsReview);
			securitiesCorporateActionsReview.click();

			Log.info("Clicked on securitiesCorporateActionsReview");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on securitiesCorporateActionsReview");
		}
	}

	public void clickOnCorporateActionsManagement() {
		try {
			Log.info("Corporate actions management");
			TestContext.getTestContextInstance().getWait().waitForElement(corporateActionsManagement);

			corporateActionsManagement.click();
			Log.info(" clicked on Corporate Actions Management");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on Corprate actions Management" + e.getMessage());
			Reporter.log("Failed to click on Corprate actions Management" + e.getMessage());

		}

	}

}
