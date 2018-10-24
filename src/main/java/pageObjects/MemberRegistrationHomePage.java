package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import context.TestContext;
import managers.FileReaderManager;
import utils.Log;

public class MemberRegistrationHomePage {

	WebDriver driver;
	
//Getting instance of TestContext class
	TestContext context = TestContext.getTestContextInstance();
	
	
	/*

	Constructor Name:MemberRegistrationHomePage
	Return Type: No Return type.
	Parameter Type: WebDriver.
	This initialized driver


	*/

	public MemberRegistrationHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='text-center'][contains(.,'Register Member Representative')]")
	private WebElement registerMemberRepresentative;

	/*

	Method Name:clickonRegisterMemberRepresentative
	Return Type: No Return type
	Parameter Type:No Parameter
	This method clicks on registerMemberRepresentative


	*/
	
	
	public void clickonRegisterMemberRepresentative() {
		try {
		Log.info("waiting to click on register member representative");
		context.getWait().waitForElement(registerMemberRepresentative);
		context.getWait().untilPageLoadComplete(driver);
		registerMemberRepresentative.click();
		Log.info("clicked on memberRepresentative");
		Reporter.log("clicked on memberRepresentative successfully");
		}
		
		catch(Exception e)
		{
			
			Log.info("exception caught while clicking on member representative");
			Reporter.log("Failed to click on member representative");
			
		}
	}
	
	
	/*
	 * 
	 * Method Name: openMemberRegistrationHomePage Return Type: No Return type.
	 * Parameter Type:No Parameter. This method is used to open member registration
	 * home page
	 * 
	 * 
	 */

	public void OpenMemberRegistrationHomePage() {
		try {
		Log.info("Opening homepage");
		String url = FileReaderManager.getInstance().getConfigFileReader().getMemberUserRegistrationUrl();
		driver.get(url);
		Log.info("HomePageopened");
		Reporter.log("member registration Home Page Opened successfully");
		}
		catch(Exception e){
			Log.info("Exception caught while opening home page : Unable to load home page");
			Reporter.log("Failed to open member registraion home page");
			
		}
	}

}
