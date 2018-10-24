package managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import enums.DriverType;
import enums.EnvirnomentType;




//This class creates driver
public class WebDriverManager {

	private WebDriver driver;
	private static DriverType driverType;
	private static EnvirnomentType envirnomentType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.gecko.driver";
	private static final String IEXPLORER_DRIVER_PROPERTY = "webdriver.iexplorer.driver";

	/**
	 * Constructor Name: WebDriverManager
	 * In this constructor we are reading the value of driverType and envirnomentType from config file
	 * 
	 * 
	 * 
	 */
	public WebDriverManager() {

		driverType = FileReaderManager.getInstance().getConfigFileReader().getBrowser();
		envirnomentType = FileReaderManager.getInstance().getConfigFileReader().getEnvirnoment();
	}

	/*
	 * Method Name: getDriver 
	 * Return Type: WebDriver 
	 * This method calls createDriver
	 * method if driver is null
	 * 
	 * 
	 */

	public WebDriver getDriver() {

		if (driver == null)
			driver = createDriver();
		return driver;
	}

	/*
	 * Method Name: Create Driver 
	 * Return Type: WebDriver 
	 * This method creates the
	 * respective driver based on envirnomentType
	 * 
	 * 
	 * 
	 */
	private WebDriver createDriver() {

		switch (envirnomentType) {
		case LOCAL:
			driver = createLocalDriver();
			break;

		case REMOTE:
			driver = createRemoteDriver();
			break;

		}
		return driver;
	}

	/*
	 * Method Name: createRemoteDriver 
	 * Return Type: WebDriver this method creates
	 * remote driver
	 */

	private WebDriver createRemoteDriver() {

		throw new RuntimeException(" remote webdriver not yet implemented");
	}

	/*
	 * Method Name: createLocalDriver 
	 * Return Type: WebDriver 
	 * This method creates
	 * driver based on driverType provided in config file
	 */

	private WebDriver createLocalDriver()

	{
		switch (driverType) {
		case FIREFOX:
			System.setProperty(FIREFOX_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigFileReader().getFirefoxDriverPath());
			driver = new FirefoxDriver();
		
			break;

		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigFileReader().getChromeDriverPath());
			driver = new ChromeDriver();
			
			break;

		}
		if (FileReaderManager.getInstance().getConfigFileReader().getWindowSize()) {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(
					FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait(), TimeUnit.SECONDS);
		}
		return driver;

	}

	/*
	 * Method Name: closeDriver This method closes the driver
	 */
	/*
	
	public void closeDriver() {

		driver.close();
		driver.quit();
	}
	*/

}
