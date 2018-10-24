package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

import context.TestContext;
import utils.Log;

public class CompanyApplicationPage {

	WebDriver driver;

	public CompanyApplicationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(.,'Company Applications')]")
	private WebElement companyApplications;

	@FindBy(xpath = "//div[@id='nav-companyApplication']//div//input[@placeholder='Search...']")
	private WebElement search;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/nots[1]/main[1]/div[1]/div[1]/app-root[1]/app-application-listing[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/xtable[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/select[1]")
	private WebElement applicationsFilter_ListBox;

	@FindBy(xpath = "//tr[@id='row0']//td[@id='col3']")
	private WebElement companyName;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application-listing/div/div/div[2]/div/div[1]/div/xtable/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[5]/span")
	private WebElement applicationStatus;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application-listing/div/div/div[2]/div/div[1]/div/xtable/div/div/div/div[1]/div[2]/table/tbody/tr[1]/td[7]/span/i")
	private WebElement eyeSymbol;

	@FindBy(xpath = "//a[contains(.,'Application Details')]")
	private WebElement applicationDetails;

	@FindBy(xpath = "//h1[contains(.,'Company Details')]")
	private WebElement companyDetails;

	@FindBy(xpath = "//button[contains(.,'Next')]")
	private WebElement next;

	@FindBy(xpath = "//h1[contains(.,'Company Address Details')]")
	private WebElement companyAddressDetails;

	@FindBy(xpath = "//h1[contains(.,'Company Ownership Details')]")
	private WebElement companyOwnershipDetails;

	@FindBy(xpath = "//h1[contains(.,'Company Financial Details')]")
	private WebElement companyFinancialDetails;

	@FindBy(xpath = "//button[contains(.,'Approve')]")
	private WebElement approve_button;

	@FindBy(xpath = "//button[contains(.,'Reject')]")
	private WebElement rejrect_button;

	@FindBy(xpath = "//div[@class='modal-title'][contains(.,'Approve Application')]")
	private WebElement approveApplication_popup;

	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement comment_textbox;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application-details/app-details-loader/modal-component/div/div/div/div[3]/div/button[2]")
	private WebElement approveButton_approveApplicationPopUp;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application-details/app-details-loader/modal-component/div/div/div/div[3]/div/button[1]")
	private WebElement cancelButton_approveApplicationPopUp;
	
	
	
	
	
	/*

	Method Name:selectCompanyApplicationsFilterListBox
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method selects company Name from application filter list box

	*/

	public void selectCompanyApplicationsFilterListBox() {
		try {
			Log.info("Waiting to select company name from list box");
			TestContext.getTestContextInstance().getWait().waitForElement(applicationsFilter_ListBox);
			Select companyName = new Select(applicationsFilter_ListBox);
			companyName.selectByVisibleText("Company Name");
			Thread.sleep(3000);
			Log.info("Selected Company Name from Listbox");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Failed to select company name from list box for filtering applications by company name."
					+ e.getMessage());

			Log.info("Exception caught while selecting company name from list box" + e.getMessage());
		}

	}
	/*

	Method Name:enterCompanyNameInSearchField
	Return Type: No Return Type
	Parameter Type: String
	This method enters company name in search field

	*/
	

	public void enterCompanyNameInSearchField(String companyName) {

		try {
			Log.info("Waiting to enter company name in search field");
			TestContext.getTestContextInstance().getWait().waitForElement(applicationsFilter_ListBox);
			applicationsFilter_ListBox.sendKeys(companyName);
			Thread.sleep(4000);
			Log.info("Entered company name");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Failed to search company  " + e.getMessage());
			Log.info("Exception caught while entering company name" + e.getMessage());

		}

	}

	
	/*

	Method Name:verifyIsCompanyNameDisplayed
	Return Type: No Return Type
	Parameter Type:String 
	This method verifies is company name displayed

	*/
	
	
	public void verifyIsCompanyNameDisplayed(String CompanyName) {

		try {
			Log.info("searching for company name is displayed");
			TestContext.getTestContextInstance().getWait().waitForElement(companyName);
			Assert.assertEquals(companyName.getText(), CompanyName);
			Log.info("Company Name is displayed " + CompanyName);
			Reporter.log("Company Name is displayed: " + CompanyName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Failed to display company Name while Approving " + e.getMessage());
			Log.info("Exception caught while searching company name" + e.getMessage());
		}

	}
	
	
	
	
	/*

	Method Name:verifyApplicationStatus
	Return Type: No Return Type
	Parameter Type: String
	This method verifies is application status

	*/

	public void verifyApplicationStatus(String status) {

		try {
			Log.info("Verifying application status is:" + status);
			TestContext.getTestContextInstance().getWait().waitForElement(applicationStatus);
			Assert.assertEquals(applicationStatus.getText(), status);
			Reporter.log("Application status is :" + status);
			Log.info("Application status is :" + status);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Failed wile verifying application status is :" + status + ".." + e.getMessage());
			Log.info("Failed wile verifying application status is :\"+status+\"..\"+e.getMessage()");

		}

	}

	
	
	
	/*

	Method Name:clickOnEyeSymbol
	Return Type: No Return Type
	Parameter Type:No Parameter
	This method clicks on eyeSymbol

	*/
	
	
	
	public void clickOnEyeSymbol() {

		try {
			Log.info("Waiting to click on eye symbol");
			TestContext.getTestContextInstance().getWait().waitForElement(eyeSymbol);
			eyeSymbol.click();
			Log.info("Clicked on eye symbol");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Exception caught while clickin on eye symbol");
			Reporter.log("Failed to click on Actions(Eye symbol)");
		}

	}

	
	
	/*

	Method Name:clickONApplicationDetails
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method clicks on application details

	*/
	
	
	
	
	
	public void clickONApplicationDetails() {
		try {
			Log.info("Waiting to click on application details");
			TestContext.getTestContextInstance().getWait().waitForElement(applicationDetails);
			applicationDetails.click();
			Log.info("Clicked on Application Details");
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Exception caught while clicking on application details  " + e.getMessage());

		}

	}
	
	
	
	
	
	/*

	Method Name:verifyCompanyInformationAndApprove
	Return Type: No Return Type
	Parameter Type:No Parameter
	This method verifies company information and approves 
	*/
	
	

	public void verifyCompanyInformationAndApprove() {
		try {
			TestContext.getTestContextInstance().getWait().waitForElement(companyDetails);
			companyDetails.isDisplayed();
			next.click();
			Thread.sleep(1000);
			Log.info("Company details is displayed and clicked on next");

			TestContext.getTestContextInstance().getWait().waitForElement(companyAddressDetails);
			companyAddressDetails.isDisplayed();
			next.click();
			Thread.sleep(1000);
			Log.info("Company address details is displayed and clicked on next");
			TestContext.getTestContextInstance().getWait().waitForElement(companyOwnershipDetails);
			companyOwnershipDetails.isDisplayed();
			next.click();
			Thread.sleep(1000);
			Log.info("Company ownership details is displayed and clicked on next");
			TestContext.getTestContextInstance().getWait().waitForElement(companyFinancialDetails);
			companyFinancialDetails.isDisplayed();
			Log.info("Company Financial Details is displayed");
			TestContext.getTestContextInstance().getWait().waitForElement(approve_button);
			approve_button.click();
			Thread.sleep(1000);
			Log.info("Clicked on approve button");
			Reporter.log("Company Information is displayed and approved");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Reporter.log("Failed to display company information and approve.." + e.getMessage());
			Log.info("Failed to display company information and approve.." + e.getMessage());
		}

	}
	
	/*

	Method Name:enterCommentsAndApprove
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method enter comments in comments box and approves

	*/
	
	
	

	public void enterCommentsAndApprove() {

		try {
			TestContext.getTestContextInstance().getWait().waitForElement(approveApplication_popup);
			approveApplication_popup.isDisplayed();
			Log.info("approveApplication_popup is displayed");

			TestContext.getTestContextInstance().getWait().waitForElement(comment_textbox);
			comment_textbox.sendKeys("Approved");
			Thread.sleep(1000);
			approveButton_approveApplicationPopUp.click();
			Thread.sleep(3000);
			Log.info("Clicked on approved in approveApplication_popup");
			Reporter.log("Successfully clicked on approved in approveApplication_popup");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			Reporter.log("Failed to approve in approveApplication_popup");
			Log.info("Failed to approve in approveApplication_popup");
		}
	}

}