package context;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;


import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import utils.SeleniumFunctions;
import utils.Wait;

//This class creates instance of webdrivermanger, pageobjectmanager,wait,selemiumfunctions
public class TestContext {
	private static TestContext context = new TestContext();
	private static WebDriverManager webdrivermanager;
	private static PageObjectManager pageobjectmanager;
	WebDriver driver;
	SeleniumFunctions seleniumfunctions;
	private static Logger log;
	private Wait wait;

	/*
	 * Constructor Name: TestContext Parameter Type: no Parameter This constructor
	 * creates the instance of webdrivermanager, pageobjectmanager,seleniumfunctions
	 * and Wait class
	 *
	 */
	public TestContext() {

		webdrivermanager = new WebDriverManager();
		pageobjectmanager = new PageObjectManager(webdrivermanager.getDriver());
		seleniumfunctions = new SeleniumFunctions(webdrivermanager.getDriver());
		wait = new Wait(webdrivermanager.getDriver());

	}

	// This method returs the instance of TestContext class
	public static TestContext getTestContextInstance() {

		return context;
	}

	/*
	 * Method Name: getWebDriverManager Return Type: WebDriver returns the object of
	 * WebDriverManager class
	 */

	public WebDriverManager getWebDriverManager() {
		return webdrivermanager;
	

	}
	/*
	 * MethodName: getPageObjectManager Return Type: PageObjectManager returns the
	 * object of PageObjectManager classs\
	 */

	public PageObjectManager getPageObjectManager() {
		return pageobjectmanager;
		

	}

	public Wait getWait() {

		return wait;

	}

	public SeleniumFunctions getSeleniumFunctions() {

		return seleniumfunctions;

	}
}
