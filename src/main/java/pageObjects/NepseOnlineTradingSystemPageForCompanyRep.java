package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import context.TestContext;
import utils.Log;

public class NepseOnlineTradingSystemPageForCompanyRep {

	WebDriver driver;

	public NepseOnlineTradingSystemPageForCompanyRep(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body[contains(@class,'skin-blue sidebar-mini pace-done')]/app-root[@ng-version='5.0.2']/nots/app-menubar/aside[@class='menu']/nav[@class='menu__main']/ul/li[3]/a[1]")
	private WebElement companyManagement;

	@FindBy(xpath = "//span[contains(text(),'Manage Company Application')]")
	private WebElement manageCompanyApplication;

	@FindBy(xpath = "//span[contains(.,'Company Creation')]")
	private WebElement companyCreation;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/nots[1]/app-menubar[1]/aside[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]")
	private WebElement corporateActions;

	@FindBy(xpath = "//span[contains(.,'Corporate Actions Management')]")
	private WebElement corporateActionsManagement;

	@FindBy(xpath = "//span[contains(.,'Create Splits Application')]")
	private WebElement createSplitsApplication;

	public void clickOnCompanyManagement() {

		try {
			Log.info("Waiting to click on company management");
			TestContext.getTestContextInstance().getWait().waitForElement(companyManagement);

			companyManagement.click();
			Thread.sleep(2000);
			Log.info("Clicked on company Management");

		} catch (Exception e) {
			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to click on company Management");
		}

	}

	public void clickOnManageCompanyApplication() {
		try {
			Log.info("Waiting to click on manage company application");

			TestContext.getTestContextInstance().getWait().waitForElement(manageCompanyApplication);
			manageCompanyApplication.click();
			Thread.sleep(2000);
			Log.info("Clicked on manage company application");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to click on Manage company application");
		}

	}

	public void clickOnCompanyCreation() {
		try {

			Log.info("Waitint to click on company creation");
			TestContext.getTestContextInstance().getWait().waitForElement(companyCreation);

			companyCreation.click();
			Reporter.log("Successfully clicked on company creation");
			Log.info("clicked on comany creation");

		} catch (Exception e) {
			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to click on company creation");
			Reporter.log("Failed to click on company creation");
		}

	}

	public void clickOnCorporateActions() {

		try {
			Log.info("Waiting to click on corporate actions");
			TestContext.getTestContextInstance().getWait().waitForElement(corporateActions);
			corporateActions.click();
			Reporter.log("Successfully clicked on corporate actions");
			Log.info("clicked on corporation actions");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on corporate actions" + e.getMessage());
		}

	}

	public void clickOncorporateActionsManagement() {

		try {
			Log.info("Waiting to click on corporate actions management");
			TestContext.getTestContextInstance().getWait().waitForElement(corporateActionsManagement);
			corporateActionsManagement.click();
			Reporter.log("Successfully clicked on corporate actions");
			Log.info("clicked on corporation actions Management");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on corporate Actions Management");
			Reporter.log("Failed to click on corporate Actions Management");
		}

	}

	public void createSplitsApplication() {

		try {
			Log.info("Waiting to click on create splits application");
			TestContext.getTestContextInstance().getWait().waitForElement(createSplitsApplication);
			createSplitsApplication.click();
			Reporter.log("Successfully clicked on create Split sApplication");
			Log.info("clicked on corporation create Splits Application");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Log.info("Failed to click on create splits application");
			Reporter.log("Failed to click on create splits application");
		}

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}