package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import context.TestContext;
import managers.FileReaderManager;
import utils.ExcelReader;
import utils.Log;

public class UserRegistrationApproval {
	WebDriver driver;

	public UserRegistrationApproval(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//th[contains(.,'User Name')]")
	WebElement userName_Column;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-nots-payment/app-application-listing/div/div/xtable/div/div/div/div[1]/div[1]/div[2]/input")
	WebElement search;

	@FindBy(xpath = "//th[contains(.,'SN.')]")
	WebElement sn;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-nots-payment/app-application-listing/div/div/xtable/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[6]/span/i")
	WebElement eyeSymbol;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-nots-payment/app-application-listing/div/div/xtable/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[5]/span")
	WebElement applicationStatus;

	@FindBy(xpath = "//a[contains(.,'Application Details')]")
	WebElement applicationDetails;

	@FindBy(xpath = "//li[contains(.,'Member Representative Registration')]")
	WebElement memberRepresentativeRegistration;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	WebElement approve1;

	@FindBy(xpath = "//button[contains(.,'Reject')]")
	WebElement reject;

	@FindBy(xpath = "//textarea[contains(@maxlength,'500')]")
	WebElement comment;

	@FindBy(xpath = "(//button[@class='btn btn-success'][contains(.,'Approve')])[2]")
	WebElement approve2;

	WebElement cancel;

	@FindBy(xpath = "//i[@class='nf-angledown']")
	WebElement userNameArrow;

	@FindBy(xpath = "//span[contains(.,'Log Out')]")
	WebElement logout;

	@FindBy(xpath = "//*[@id='col1'][1]")
	private WebElement userNameDisplayed;

	@FindBy(xpath = "//li[@class='list-group-item'][contains(.,'User Registration')]")
	private WebElement userRegistration;

	@FindBy(xpath = "//li[contains(.,'Company Representative Registration')]")
	private WebElement companyRepresentativeRegistration;

	@FindBy(xpath = "//button[contains(.,'Done')]")
	private WebElement done;

	@FindBy(xpath = "//span[contains(.,'APPROVED')]")
	private WebElement approved;

	/*
	 * 
	 * Method Name:enterSearch Return Type: No Return type. Parameter Type: String
	 * This method enters the username entered in the member registration page or
	 * company registration page in search box
	 * 
	 * 
	 */

	public void enterSearch(String searchUserName) {
		try {

			Log.info("searching user name");

			TestContext.getTestContextInstance().getWait().waitForElement(search);
			search.click();

			search.sendKeys(searchUserName);

			Log.info("Username entered to search");

			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to search user name");
		}

	}

	public void verifyUserNameIsDisplayed(String userName) {

		try {
			Log.info("Verifying is username displayed");

			TestContext.getTestContextInstance().getWait().waitForElement(userNameDisplayed);
			Assert.assertEquals(userNameDisplayed.getText(), userName);
			Log.info("Username is displayed ");

			Reporter.log("userName " + userName + "Successfully displayed");
		}

		catch (Exception e) {

			Reporter.log("Failed to display UserName " + userName);
		}

	}

	/*
	 * 
	 * Method Name:checkIsApplicationStatusNew Return Type: No Return type.
	 * Parameter Type:No Parameter. This method checks is the application status is
	 * NEW
	 * 
	 * 
	 */

	public void checkIsApplicationStatusNew() {

		try {

			TestContext.getTestContextInstance().getWait().waitForElement(applicationStatus);
			Assert.assertEquals(applicationStatus.getText(), "NEW");

			Log.info("Application status is new");
			Reporter.log("Application status is new");

		}

		catch (Exception e) {

			Reporter.log("Failed to display application status as new");
		}
	}

	/*
	 * 
	 * Method Name: waitForTableToGenerate Return Type: No Return type. Parameter
	 * Type:No Parameter. This method waits for the table of users to generate after
	 * clicking on user registration and approval
	 * 
	 * 
	 */

	public void waitForTableToGenerate() {
		try {
			Thread.sleep(8000);

			TestContext.getTestContextInstance().getWait().waitForElement(sn);
			TestContext.getTestContextInstance().getWait().waitForTextToAppear("SN.", sn);
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * Method Name:clickOnEyeSymbol Return Type: No Return type. Parameter Type:No
	 * Parameter. This method clicks on eye symbol button
	 * 
	 * 
	 */

	public void clickOnEyeSymbol() {
		TestContext.getTestContextInstance().getWait().waitForElement(eyeSymbol);
		Log.info("waiting to click on eye symbol");
		eyeSymbol.click();

		Log.info("clicked on eye symbol");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * 
	 * Method Name:clickonApplicationDetails Return Type: No Return type. Parameter
	 * Type:No Parameter. This method clicks on ApplicationDetails
	 * 
	 * 
	 */

	public void clickonApplicationDetails() {
		try {
			TestContext.getTestContextInstance().getWait().waitForElement(applicationDetails);
			Log.info("waiting to click on application details");
			applicationDetails.click();
			Log.info("clicked on application details");

			Thread.sleep(2000);
			Reporter.log("Successfully clicked on application details");
		}

		catch (Exception e) {

			Reporter.log("Failed to click on application details");
		}

	}

	public void userRegistrationDetails() {
		TestContext.getTestContextInstance().getWait().waitForElement(userRegistration);
		userRegistration.click();
		done.click();

	}

	public void member_Representative_Registration() {

		TestContext.getTestContextInstance().getWait().waitForElement(memberRepresentativeRegistration);
		memberRepresentativeRegistration.click();
		TestContext.getTestContextInstance().getWait().waitForElement(done);
		done.click();

	}

	public void company_Representative_Registration() {

		TestContext.getTestContextInstance().getWait().waitForElement(companyRepresentativeRegistration);
		companyRepresentativeRegistration.click();
		TestContext.getTestContextInstance().getWait().waitForElement(done);
		done.click();

	}

	/*
	 * 
	 * Method Name:clickOnApprove1 Return Type: No Return type. Parameter Type:No
	 * Parameter. This method clicks on first approval button
	 * 
	 * 
	 */

	public void clickOnApprove1() {
		TestContext.getTestContextInstance().getWait().waitForElement(approve1);
		Log.info("waiting to click on approval 1 ");

		approve1.click();

		Log.info("clicked on approval 1 ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * 
	 * Method Name:enterComment Return Type: No Return type. Parameter Type:No
	 * Parameter. This method enters comment
	 * 
	 * 
	 */

	public void enterComment() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestContext.getTestContextInstance().getWait().waitForElement(comment);
		Log.info("waiting to enter comments");
		comment.sendKeys("Approved");

		Log.info("entered comments");
	}

	/*
	 * 
	 * Method Name:clickOnApprove1 Return Type: No Return type. Parameter Type:No
	 * Parameter. This method clicks on second approval button
	 * 
	 * 
	 */

	public void clickonApprove2() {

		try {
			TestContext.getTestContextInstance().getWait().waitForElement(approve2);
			Log.info("waiting to click on approve 2");
			approve2.click();
			Log.info("clicked on approve 2");
			Log.info("User successfully registered and approved");
			Reporter.log("User successfully registred and approved");
		}

		catch (Exception e) {

			Reporter.log("Failed to click on apporve in the popup");
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

	/*
	 * 
	 * Method Name:approveRegistration Return Type: No Return type. Parameter Type:
	 * String This method searches user name and approves the user
	 * 
	 * 
	 */

	public void approveRegistrationForCompanyRepresentative(String userName) {
		try {

			waitForTableToGenerate();
			enterSearch(userName);
			verifyUserNameIsDisplayed(userName);
			checkIsApplicationStatusNew();

			clickOnEyeSymbol();
			clickonApplicationDetails();
			userRegistrationDetails();
			company_Representative_Registration();

			clickOnApprove1();
			enterComment();
			clickonApprove2();
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to approve registration for company rep");
		}
	}

	public void approveRegistrationForMemberRepresentative(String userName) {

		try {
			waitForTableToGenerate();
			Thread.sleep(2000);
			enterSearch(userName);
			verifyUserNameIsDisplayed(userName);
			checkIsApplicationStatusNew();

			clickOnEyeSymbol();
			clickonApplicationDetails();
			userRegistrationDetails();
			member_Representative_Registration();

			clickOnApprove1();
			enterComment();
			clickonApprove2();
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to approve registration for member rep");
		}

	}

	public void verifyUserApprovedAndLogout(String userName) {

		try {
			waitForTableToGenerate();
			Thread.sleep(2000);
			enterSearch(userName);
			verifyUserNameIsDisplayed(userName);
			verifyIsApplicationStatusApproved();
			clickOnUserNameArrow();
			clickOnLogout();

		}

		catch (Exception e) {
			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to verify approve and logout");

		}
	}

	public void verifyIsApplicationStatusApproved() {

		try {
		Assert.assertEquals(applicationStatus.getText(),"APPROVED");
		Reporter.log("Application  status is displayed as approved");
		}
		
		catch(Exception e)
		{
Reporter.log("Failed to display application status as approved");
	}

}
}