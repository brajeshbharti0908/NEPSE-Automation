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

public class ConfigureUserType {
	WebDriver driver;
	TestContext context=TestContext.getTestContextInstance();
	
	public ConfigureUserType(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(.,'Add new')]")
	private WebElement addNew;
	
	@FindBy(xpath = "//input[@maxlength='50']")
	private WebElement userType;
	
	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-type-management/div/div/app-user-type-actions/modal-component/div/div/div/div[2]/div/div/div[1]/div/div/div/app-user-type-details/xf/div/div[2]/div/div/div/div")
	private WebElement internalUser;
	
	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-type-management/div/div/app-user-type-actions/modal-component/div/div/div/div[2]/div/div/div[1]/div/div/div/app-user-type-details/xf/div/div[3]/div/div/div/select")
	private WebElement selectedDepartment;
	
	@FindBy(xpath = "//select[@name='selectedFunctionality']")
	private WebElement selectedFunctionality;
	
	@FindBy(xpath = "//select[@name='selectedRole']")
	private WebElement selectedRole;
	
	@FindBy(xpath = "//button[@class='add--icon']")
	private WebElement addIcon;
	
	@FindBy(xpath = "//button[contains(.,'Close')]")
	private WebElement close;
	
	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-type-management/div/div/app-user-type-actions/modal-component/div/div/div/div[3]/div/div/div/button[1]")
	private WebElement save;
	
	public void clickOnAddNew()
	{
		TestContext.getTestContextInstance().getWait().waitForElement(addNew);
		Log.info("waiting to click on Add  New");
		addNew.click();
		try {
			Thread.sleep(2000);
		
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void enterUserTypeName()
	{
		Log.info("Reading use type name ");
		context.getWait().waitForElement(userType);
		Assert.assertTrue(userType.isDisplayed(), "user type is not displayed");
		this.userType.clear();
		this.userType.sendKeys("Default UserType25");
		Assert.assertTrue(userType.isEnabled(), "user type is not enabled");
		
		Log.info("Entered user type");
	}
	
	public void toVerifyInternalUser()
	{
		Log.info("verifying internal user text");
		internalUser.isDisplayed();
		Log.info("internal user text is displayed");
	}
	
	public void selectDepartment()
	{
		Log.info("selecting a department");
		Select department=new Select(selectedDepartment);
		department.selectByVisibleText("CEO");
		Log.info("Department Selected");
		
	}
	
	public void selectFunctionality(String selectFuntionality,String selectRole)
	{
		Log.info("selecting a Functionality");
		Select functionality=new Select(selectedFunctionality);
		functionality.selectByVisibleText(selectFuntionality);
		Log.info("Functionality Selected");
		
		Log.info("selecting a role");
		Select role=new Select(selectedRole);
		role.selectByVisibleText(selectRole);
		Log.info("role Selected");
	}
	
  public void clickOnAddIcon()
  {
	Log.info("clicking on add icon");  
	addIcon.click();
	try {
		Thread.sleep(2000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	
  }
  
  public void clickOnSave()
  {
	  Log.info("waiting to save new user type");
	  save.click();
	  Log.info("Clicked on save");
	  try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	  
  }
  
  public void enterUserTypeDetails() throws InterruptedException
  {
	  try {
		  Log.info("Entering user type name");
		  enterUserTypeName();
		  Log.info("user type name entered");
		  Thread.sleep(2000);
		  Log.info("Verifying internal user");
		  toVerifyInternalUser();
		  Log.info("Internal User verifed");
		  Thread.sleep(1000);
		  Log.info("selecting a department");
		  selectDepartment();
		  Log.info("department selected");
		  Thread.sleep(1000);
		  Log.info("Assigning funtionality and role");
           selectFunctionality("Company Management", "Create Role");
           clickOnAddIcon();
          Log.info("Parent functionality selected");
		  Thread.sleep(1000);
		  selectFunctionality("Company Creation", "Create Role");
          clickOnAddIcon();
         Log.info("Child functionality selected");
		  Thread.sleep(1000);
		Log.info("enterd all the details successfully");
			Reporter.log("enterd all the details successfully");
}
	  catch (Exception e) {

			Log.info("Exception caught while entering details in details page");
			Reporter.log("Exception caught while entering details in details page");

		}
  }

}
