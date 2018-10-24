package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import context.TestContext;
import managers.FileReaderManager;
import utils.Log;

public class CompanyRegistrationHomePage {

	WebDriver driver;
	TestContext context = TestContext.getTestContextInstance();

	/*
	 * 
	 * Constructor Name:CompanyRegistrationHomePage Return Type: No Return type
	 * Parameter Type : WebDriver This Constructor is Used to initialize driver
	 * 
	 * 
	 */

	public CompanyRegistrationHomePage(WebDriver driver)

	{

		this.driver = driver;
		//initElements of PageFactory class is used to initialize web elements during runtime
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='text-center'][contains(.,'Register Company Representative')]")
	private WebElement registerCompanyRepresentative;

	private WebElement userName;

	private WebElement password;

	/*
	 * 
	 * Method Name: openCompanyRegistrationHomePage Return Type: No Return type
	 * Parameter Type:No Parameter This method is used to open company registration
	 * home page
	 * 
	 * 
	 */

	public void openCompanyRegistrationHomePage() {
		try {
		Log.info("Trying to opoen company registration url");
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getCompanyUserRegistrationUrl());
		Log.info("opened company registration url");
		Reporter.log("Successfully opened company registration URL");
		}
		
		catch(Exception e) {
			
			
			e.printStackTrace();
			Reporter.log("Failed to open company registration URL");
		}
	}

	/*

	Method Name:clickonCompanyMemberRepresentative
	Return Type: No Return type
	Parameter Type:No Parameter
	This method clicks on registerCompanyRepresentative


	*/
	
	
	public void clickonCompanyMemberRepresentative() {
		try {
			Log.info("waiting to click on company member representative");
			TestContext.getTestContextInstance().getWait().waitForElement(registerCompanyRepresentative);
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			registerCompanyRepresentative.click();
			Log.info("clicked on companyRepresentative");
			Reporter.log("Clicked on company member rep successfully");

		}

		catch (Exception e) {

			Log.info("exception caught while clicking on company representative");
			Reporter.log("Failed to click on company representative");

		}
	}

}
