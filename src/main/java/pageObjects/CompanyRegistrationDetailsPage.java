package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
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


public class CompanyRegistrationDetailsPage {

	WebDriver driver;

	/*
	 * 
	 * Constructor Name:CompanyRegistrationDetailsPage Return Type: No Return type
	 * Parameter Type : WebDriver This Constructor is Used to initialize driver
	 * 
	 * 
	 */

	public CompanyRegistrationDetailsPage(WebDriver driver) {

		this.driver = driver;
		
		//initElements of PageFactory class is used to initialize web elements during runtime
		PageFactory.initElements(driver, this);
	}

	// Getting the the instance of TestContext
	TestContext context = TestContext.getTestContextInstance();

	String sheetPath = FileReaderManager.getInstance().getConfigFileReader().getExcelSheetPath();
	String sheetName = "TC_001_UserRegistration_Company";
	String company_Name = ExcelReader.readCellData(sheetPath, sheetName, 1, 0);
	String user_Name = ExcelReader.readCellData(sheetPath, sheetName, 1, 1);
	String first_Name = ExcelReader.readCellData(sheetPath, sheetName, 1, 2);
	String middle_Name = ExcelReader.readCellData(sheetPath, sheetName, 1, 3);
	String last_Name = ExcelReader.readCellData(sheetPath, sheetName, 1, 4);
	String date_Of_Birth = ExcelReader.readCellData(sheetPath, sheetName, 1, 5);
	String email_ID = ExcelReader.readCellData(sheetPath, sheetName, 1, 6);
	String mobile_Number = ExcelReader.readCellData(sheetPath, sheetName, 1, 7);
	String member_Gender = ExcelReader.readCellData(sheetPath, sheetName, 1, 8);
	String member_Address = ExcelReader.readCellData(sheetPath, sheetName, 1, 9);
	String member_Town = ExcelReader.readCellData(sheetPath, sheetName, 1, 10);
	String postal_Code = ExcelReader.readCellData(sheetPath, sheetName, 1, 11);

	@FindBy(xpath = "//input[contains(@placeholder,'Company Name ')]")
	WebElement companyName;

	@FindBy(xpath = "//input[contains(@formcontrolname,'userName')]")
	WebElement userName;

	@FindBy(xpath = "//input[contains(@formcontrolname,'firstName')]")
	WebElement firstName;

	@FindBy(xpath = "//input[contains(@placeholder,'Middle Name ')]")
	WebElement middleName;

	@FindBy(xpath = "//input[contains(@formcontrolname,'lastname')]")
	WebElement lastName;

	@FindBy(xpath = "//input[contains(@formcontrolname,'emailId')]")
	WebElement emailID;

	@FindBy(xpath = "//input[contains(@formcontrolname,'phoneNumber1')]")
	WebElement mobileNumber;

	@FindBy(xpath = "//input[contains(@aria-label,'Date input field')]")
	WebElement dateOfBirth;

	@FindBy(xpath = "//input[@value='M'][@type='radio']")
	WebElement male;

	@FindBy(xpath = "//input[@value='F'][@type='radio']")
	WebElement female;

	@FindBy(xpath = "//input[@value='Others'][@type='radio']")
	WebElement others;

	@FindBy(xpath = "//input[contains(@formcontrolname,'town')]")
	WebElement town;

	@FindBy(xpath = "//input[contains(@formcontrolname,'addressField1')]")
	WebElement address;

	@FindBy(xpath = "//input[contains(@formcontrolname,'postcode')]")
	WebElement postalCode;

	@FindBy(xpath = "//button[text()='Sign Up']")
	WebElement signUpButton;

	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath = "//span[contains(.,'User Registered')]")
	WebElement userRegistrationSuccessful;

	/*
	 * 
	 * Method Name: enterCompanyName Return Type: No Return Type Parameter Type:
	 * String This method is used to enter company name
	 * 
	 * 
	 */

	public void enterCompanyName(String company__Name) {
		Log.info("Reading company name");
		context.getWait().waitForElement(companyName);
		Assert.assertTrue(companyName.isDisplayed(), "member name is not displayed");
		this.companyName.clear();
		this.companyName.sendKeys(company__Name);
		Assert.assertTrue(companyName.isEnabled(), "member name is not enabled");

		Log.info("Entered member name");
	}

	/*
	 * 
	 * Method Name: enterUserName Return Type: No Return Type Parameter Type: String
	 * This method is used to enter user name in the user name field
	 * 
	 * 
	 */

	public void enterUserName(String userName) {

		Log.info("Reading user member name");
		this.userName.clear();
		this.userName.sendKeys(userName);

		Log.info("entered user name");

	}

	public void enterFirstName(String firstName) {

		Log.info("entering first name");
		// this.firstName.clear();
		this.firstName.sendKeys(firstName);
		Log.info("entered  first name");
	}

	public void enterLastName(String LastName) {
		this.lastName.clear();
		this.lastName.sendKeys(LastName);
	}

	public void enterMiddleName(String MiddleName) {
		this.middleName.clear();
		this.middleName.sendKeys(MiddleName);
	}

	public void enterEmailID(String EmailID) {
		this.emailID.clear();
		this.emailID.sendKeys(EmailID);
	}

	public void enterMobileNumber(String Mobile_NO) {
		this.mobileNumber.clear();
		this.mobileNumber.sendKeys(Mobile_NO);

	}

	public void enterDateOfBirth(String DateOfBirth) {
		this.dateOfBirth.clear();
		this.dateOfBirth.sendKeys(DateOfBirth);
	}

	public void enterAddress(String Address) {
		this.address.clear();
		this.address.sendKeys(Address);
	}

	public void enterTown(String Town) {
		this.town.clear();

		this.town.sendKeys(Town);
	}

	public void enterPostalCode(String PostalCode) {
		this.postalCode.clear();
		this.postalCode.sendKeys(PostalCode);
	}

	/*
	 * 
	 * Method Name:clickonSignUp Return Type: No Return type Parameter Type:No
	 * Parameter This method is used to click on signup button
	 * 
	 * 
	 */

	public void clickOnSignUp() throws InterruptedException {
		signUpButton.click();
		Thread.sleep(5000);
	}

	public void clickOnCancel() throws InterruptedException {
		cancelButton.click();
		Thread.sleep(1000);
	}

	/*
	 * 
	 * Method Name:enterGender Return Type: No Return type Parameter Type: String
	 * This method is used to select the gender based on the input in excel sheet
	 * 
	 * 
	 */

	public void enterGender(String gender) {
		if (gender.equalsIgnoreCase("Male")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", male);

			// this.male.click();
		}

		else if (gender.equalsIgnoreCase("Female")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", female);
		}

		else if (gender.equalsIgnoreCase("Others")) {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", others);
		} else {

			Log.info("entered gender is incorrect in test data sheet");

		}

	}

	/*
	 * 
	 * Method Name:enterCompanyDetails Return Type: No Return type Parameter Type:
	 * No Parameter This method is used to enter all the company  details
	 * 
	 * 
	 */

	public void enterCompanyDetails() throws InterruptedException {

		try {
			Log.info("entering member name");
			enterCompanyName(company_Name);
			Log.info("entered member name");
			Thread.sleep(1000);
			Log.info("entering user name");
			enterUserName(user_Name);
			Log.info("entered user name");
			Thread.sleep(1000);
			Log.info("entering first name");
			enterFirstName(first_Name);
			Log.info("entered first name");
			Thread.sleep(1000);
			Log.info("entering middle name");
			enterMiddleName(middle_Name);
			Log.info("entered middle name");
			Thread.sleep(100);
			Log.info("entering last name");
			enterLastName(last_Name);
			Log.info("entered last name");
			Thread.sleep(100);
			Log.info("entering email id");
			enterEmailID(email_ID);
			Log.info("entered email id ");
			Thread.sleep(1000);
			Log.info("entering mobile no ");
			enterMobileNumber(mobile_Number);
			Log.info("entered mobile no ");
			Thread.sleep(2000);
			Log.info("enteting date of birth");
			enterDateOfBirth(date_Of_Birth);
			Log.info("entered date of birth");
			Thread.sleep(2000);
			Log.info("selecting gender ");
			enterGender(member_Gender);
			Log.info(" gender selected ");
			Thread.sleep(2000);
			Log.info("entering address ");

			enterAddress(member_Address);
			Log.info("entered member address ");
			Thread.sleep(1000);
			Log.info("entering town ");
			enterTown(member_Town);
			Log.info("entered town ");
			Thread.sleep(1000);
			Log.info("entering postal code");
			enterPostalCode(postal_Code);
			Log.info("entered postal code");
			Thread.sleep(5000);
			Log.info("enterd all the details successfully");
			Reporter.log("enterd all the details successfully");
		}

		catch (Exception e) {

			Log.info("Exception caught while entering details in details page");
			Reporter.log("Failed to enter company details");

		}
	}

}
