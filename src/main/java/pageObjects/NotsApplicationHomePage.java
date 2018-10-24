package pageObjects;

import java.sql.SQLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import context.TestContext;
import managers.FileReaderManager;
import utils.Log;
import utils.MSSQLConnector;

public class NotsApplicationHomePage {
	WebDriver driver;
	// reading username and password from config file and stro
	String Nots_Admin_User_Name = FileReaderManager.getInstance().getConfigFileReader().getNotsUserName();
	String Nots_Admin_Password = FileReaderManager.getInstance().getConfigFileReader().getNotsPassword();

	public NotsApplicationHomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[contains(@name,'name')]")
	private WebElement userName;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//button[contains(.,'Submit')]")
	private WebElement submit;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter your one time password...')]")
	private WebElement otpField;

	@FindBy(xpath = "//button[contains(.,'Sign In')]")
	private WebElement signIN;

	/*
	 * 
	 * Method Name: openNotsRegistrationHomePage Return Type: No Return type.
	 * Parameter Type:No Parameter. This method is used to open nots application
	 * home page
	 * 
	 * 
	 */

	public void OpenNotsApplicationHomePage() {
		try {
		Log.info("opening nots application home page");
		driver.get(FileReaderManager.getInstance().getConfigFileReader().getNotsApplicationUrl());
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
		TestContext.getTestContextInstance().getWait().waitForElement(userName);
		Reporter.log("Failed to open NOTS Application home page");
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
			Reporter.log("Failed to open NOTS Application home page");
		}

	}

	/*
	 * 
	 * Method Name: enterUserName. Return Type: No Return type. Parameter Type:No
	 * Parameter. This method enters NOTS username
	 * 
	 * 
	 * 
	 */

	public void enterUserName(String notsUserName) {
		
		TestContext.getTestContextInstance().getWait().waitForElement(userName);
		Log.info("Entering User Name in Nots application");
		userName.clear();
		this.userName.sendKeys(notsUserName);
		Log.info("Entred User Name in Nots application");
	}

	/*
	 * 
	 * Method Name: enterPassword. Return Type: No Return type. Parameter Type:No
	 * Parameter. This method enters NOTS password
	 * 
	 * 
	 * 
	 */

	public void enterPassword(String notsPassword) {
		Log.info("Entering password in nots application");
		// this.password.clear();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", password);

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.password.sendKeys(notsPassword);

		Log.info("Entered Password");

	}

	/*
	 * 
	 * Method Name: clickOnSubmit. Return Type: No Return type. Parameter Type:No
	 * Parameter. This method clicks on submit button
	 * 
	 * 
	 * 
	 */

	public void clickOnSubmit()

	{

		Log.info(" Clicking on submit");
		this.submit.click();

		Log.info("clicked on submit");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);

	}

	/*
	 * 
	 * Method Name: clickOnSignIN. Return Type: No Return type. Parameter Type:No
	 * Parameter. This method clicks on SignIN button
	 * 
	 * 
	 * 
	 */

	public void clickOnSignIN()

	{

		Log.info(" Clicking on signin");
		this.signIN.click();
		Log.info("clicked on signin");
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);

	}

	/*
	 * 
	 * Method Name: enterOTP. Return Type: No Return type. Parameter Type:No
	 * Parameter. This method enters otp
	 * 
	 * 
	 * 
	 */

	public void enterOTP(String notsUserName)

	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", otpField);

		String latestOTP = MSSQLConnector.getOTP(notsUserName);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		otpField.sendKeys(latestOTP);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * 
	 * Method Name: enterCredentialsAndLogin. Return Type: No Return type. Parameter
	 * Type:No Parameter. This method enters login details,otp and clicks on signin
	 * 
	 * 
	 * 
	 */
	public void enterUserCredentialsAndLogin(String notsUserName,String notsPassword) {

		enterUserName(notsUserName);
		enterPassword(notsPassword);
		clickOnSubmit();

		enterOTP(notsUserName);
		clickOnSignIN();

	}

	/*
	 * 
	 * Method Name: NavigateToNotsApplicationHomePage. Return Type: No Return type.
	 * Parameter Type:No Parameter. This method navigates to nots home page from
	 * current page
	 * 
	 * 
	 * 
	 */

	public void NavigateToNotsApplicationHomePage() {

		driver.navigate().to(FileReaderManager.getInstance().getConfigFileReader().getNotsApplicationUrl());
		TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
		TestContext.getTestContextInstance().getWait().waitForElement(userName);
	}

	public void enterAdminCredentialsandLogin() {
		
		
		enterUserName(Nots_Admin_User_Name);
		enterPassword(Nots_Admin_Password);
		clickOnSubmit();

		enterOTP(Nots_Admin_User_Name);
		clickOnSignIN();
		
	}
	
	
	
	
}
