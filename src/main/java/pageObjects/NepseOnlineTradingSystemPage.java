package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import context.TestContext;
import utils.Log;

public class NepseOnlineTradingSystemPage {

	WebDriver driver;

	public NepseOnlineTradingSystemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(.,'Membership Management')]")
	WebElement membershipManagement;

	@FindBy(xpath = "//span[contains(.,'Member Registration Applications')]")
	WebElement memberRegistrationApplications;

	@FindBy(xpath = "//a[contains(.,'Global Administration')]")
	WebElement globalAdministration;

	@FindBy(xpath = "//a[contains(.,'User Management')]")
	WebElement userManagement;

	@FindBy(xpath = "//span[contains(.,'User Registration Approval')]")
	WebElement userRegistrationApproval;
	
	@FindBy(xpath = "//span[contains(.,'Configure User Type')]")
	WebElement configureUserType;
	
	@FindBy(xpath = "/html/body/app-root/nots/app-menubar/aside/nav/ul/li[2]/ul/li[4]/ul/li[2]/a")
	WebElement manageUsers;
	
	
	
	
	/*

	Method Name:clickOnGlobalAdministration
	Return Type: No Return type.
	Parameter Type: No Parameter
	This method clicks on GlobalAdministration

	*/

	public void clickOnGlobalAdministration() {

		TestContext.getTestContextInstance().getWait().waitForElement(globalAdministration);

		Log.info("waiting to click on global administartion");
		globalAdministration.click();
		Log.info("clicked on global administartion");

	}
	/*

	Method Name:clickOnUserManagement
	Return Type: No Return type.
	Parameter Type: No Parameter
	This method clicks on User Management

	*/
	

	public void clickOnUserManagement() {

		Log.info("waiting to click on user management");
		TestContext.getTestContextInstance().getWait().waitForElement(userManagement);
		userManagement.click();

		Log.info("clicked on user management");
	}
	
	
	/*

	Method Name:clickOnUserRegistrationApproval
	Return Type: No Return type.
	Parameter Type: No Parameter
	This method clicks on User Registration Approval

	*/

	public void clickOnUserRegistrationApproval() {

		TestContext.getTestContextInstance().getWait().waitForElement(userRegistrationApproval);
		Log.info("waiting to click on user registration approval");
		userRegistrationApproval.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Log.info("clicked on user registration approval");
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);

	}
	
	public void clickOnUserTypeConfigure()
	{
		TestContext.getTestContextInstance().getWait().waitForElement(configureUserType);	
		Log.info("waiting to click on configure user type");
		configureUserType.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.info("clicked on configure user type");
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
	}
	
	public void clickOnManageUsers()
	{
		TestContext.getTestContextInstance().getWait().waitForElement(manageUsers);
		Log.info("Waiting to click on Manage users");
		manageUsers.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Log.info("Clicked on Manage Users");
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
		
	}

}
