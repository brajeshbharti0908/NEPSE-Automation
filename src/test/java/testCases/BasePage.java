package testCases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import context.TestContext;
import managers.FileReaderManager;
import utils.Log;
import org.apache.log4j.xml.DOMConfigurator;

//@Listeners(utils.Listeners.TestListener.class)
public class BasePage {

	WebDriver driver = TestContext.getTestContextInstance().getWebDriverManager().getDriver();

	/*
	 * 
	 * Method Name:ConfigureLog4j Return Type: No Return type. Parameter Type:No
	 * Parameter. This method loads log4j.xml before every @Test method. This method
	 * is executed before every @Test method
	 * 
	 * 
	 */
	@BeforeMethod
	public void ConfigureLog4j() {
		DOMConfigurator.configure("log4j.xml");
		Log.info("domconfigured");

	}

	@BeforeMethod
	public void openNotsApplicationUrl() {
		try {
			Log.info("opening nots application home page");
			driver.get(FileReaderManager.getInstance().getConfigFileReader().getNotsApplicationUrl());
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);

			Reporter.log("Failed to open NOTS Application home page");
		}

		catch (Exception e) {

			e.printStackTrace();
			Reporter.log("Failed to open NOTS Application home page");
		}

	}

	/*
	 * 
	 * Method Name:closeDriver Return Type: No Return type. Parameter Type:No
	 * Parameter. This method logs out from nots application and closed the browser
	 * This method is executed after every @Test method
	 * 
	 * 
	 */
	@AfterMethod
	public void closeDriver() {

		driver.close();
		driver.quit();

		Log.info("All the browsers closed");
	}
}
