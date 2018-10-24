package pageObjects;

import utils.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import context.TestContext;
import org.testng.Assert;
import org.testng.Reporter;

import managers.FileReaderManager;
import utils.ExcelReader;

public class ManageUsers {
WebDriver driver;
TestContext context=TestContext.getTestContextInstance();

public ManageUsers(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}

String sheetPath = FileReaderManager.getInstance().getConfigFileReader().getExcelSheetPath();
String sheetName="TC_003_InternalUser";
String user_Name=ExcelReader.readCellData(sheetPath, sheetName, 1, 0);
String first_Name=ExcelReader.readCellData(sheetPath, sheetName, 1, 1);
String middle_Name=ExcelReader.readCellData(sheetPath, sheetName, 1, 2);
String last_Name=ExcelReader.readCellData(sheetPath, sheetName, 1, 3);
String email_ID=ExcelReader.readCellData(sheetPath, sheetName, 1, 4);
String phone_Number=ExcelReader.readCellData(sheetPath, sheetName, 1, 5);
String date_of_birth=ExcelReader.readCellData(sheetPath, sheetName, 1, 6);
String gender1=ExcelReader.readCellData(sheetPath, sheetName, 1, 7);
String user_Town=ExcelReader.readCellData(sheetPath, sheetName, 1, 8);
String user_Address=ExcelReader.readCellData(sheetPath, sheetName, 1, 9);
String postal_Code=ExcelReader.readCellData(sheetPath, sheetName, 1, 10);
String depart_ment=ExcelReader.readCellData(sheetPath, sheetName, 1, 11);
String user_Type=ExcelReader.readCellData(sheetPath, sheetName, 1, 12);
String from_Date=ExcelReader.readCellData(sheetPath, sheetName, 1, 13);
String to_Date=ExcelReader.readCellData(sheetPath, sheetName, 1, 14);




@FindBy(xpath = "//a[contains(.,'Add new')]")
WebElement addNew;

@FindBy(xpath = "//input[@placeholder='Username']")
WebElement userName;

@FindBy(xpath = "//input[@placeholder='First Name']")
WebElement firstName;

@FindBy(xpath = "//input[@placeholder='Middle Name ']")
WebElement middleName;

@FindBy(xpath = "//input[@placeholder='Last Name ']")
WebElement lastName;

@FindBy(xpath = "//input[@placeholder='Email ID ']")
WebElement emailID;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[2]/div/input")
WebElement phoneNumber;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[3]/div/div/div/input")
WebElement dateOfBirth;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[4]/div/select")
WebElement gender;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[6]/div/input")
WebElement town;

@FindBy(xpath = "//input[contains(@formcontrolname,'addressField1')]")
WebElement address;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[2]/div[2]/div[8]/div/input")
WebElement postalCode;

@FindBy(xpath= "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[3]/select")
WebElement department;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[4]/div/app-assign-user-user-type/div/div/table/thead/tr/th[2]/div/select")
WebElement selectUserType;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[4]/div/app-assign-user-user-type/div/div/table/thead/tr/th[3]/div/div/div/input")
WebElement fromDate;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[2]/div/div/form/div[4]/div/app-assign-user-user-type/div/div/table/thead/tr/th[4]/div/div/div/input")
WebElement toDate;

@FindBy(xpath = "//button[@class='add--icon']")
WebElement addIcon;

@FindBy(xpath = "/html/body/app-root/nots/main/div/div/nots-administration/app-user-management/div/modal-component/div/div/div/div[3]/div/button[1]")
WebElement save;

@FindBy(xpath = "//button[contains(.,'Close')]")
WebElement close;






public void clickOnAddNew()
{
	TestContext.getTestContextInstance().getWait().waitForElement(addNew);
	Log.info("waiting to click on add new");
	addNew.click();
	Log.info("Add new clicked");
	try {
		Thread.sleep(2000);
	
	}
	catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void enterUserName(String userName1)
{
	Log.info("Reading user name");
TestContext.getTestContextInstance().getWait().waitForElement(userName);
//Assert.assertTrue(userName.isDisplayed(), "user name is not displayed");
this.userName.clear();
this.userName.sendKeys(userName1);
//Assert.assertTrue(userName.isEnabled(), "user name is not enabled");
Log.info("user name entered");
}

public void enterFirstName(String firstName1)
{
	Log.info("Reading First name");
	this.firstName.clear();
	this.firstName.sendKeys(firstName1);
	Log.info("first name entered");
}
public void enterMiddleName(String middleName1)
{
	Log.info("Reading middle name");
	this.middleName.clear();
	this.middleName.sendKeys(middleName1);
	Log.info("middle name entered");
}

public void enterLastName(String lastName1)
{
	Log.info("Reading last name");
	this.lastName.clear();
	this.lastName.sendKeys(lastName1);
	Log.info("last name entered");
}

public void enterEmailID(String emailID1)
{
	Log.info("Reading email Id");
	this.emailID.clear();
	this.emailID.sendKeys(emailID1);
	Log.info("email Id entered");
}

public void enterPhoneNumber(String phoneNumber1)
{
	Log.info("Reading phone number");
	this.phoneNumber.clear();
	this.phoneNumber.sendKeys(phoneNumber1);
	Log.info("phone number entered");
}

public void enterDateofBirth(String dateOfBirth1)
{
	Log.info("Reading date of birth");
	this.dateOfBirth.clear();
	this.dateOfBirth.sendKeys(dateOfBirth1);
	Log.info("date of birth is entered");
}

public void enterGender(String gender3)
{
	Log.info("Reading gender");
	Select gender2=new Select(gender);
	gender2.selectByVisibleText(gender3);
	Log.info("gender is entered");

}

public void enterTown(String Town)
{

	Log.info("Reading town");
	this.town.clear();
	this.town.sendKeys(Town);
	Log.info("town is entered");

}

public void enterAddress(String Address)
{

	Log.info("Reading address");
	this.address.clear();
	this.address.sendKeys(Address);
	Log.info("address is entered");

}

public void enterPostalCode(String postalCode1)
{

	Log.info("Reading postal code");
	this.postalCode.clear();
	this.postalCode.sendKeys(postalCode1);
	Log.info("postal code is entered");
}

public void enterDepartment(String department1)
{

	Log.info("Reading department");
	Select department2=new Select(department);
	department2.selectByVisibleText(department1);
	Log.info("department is entered");
}

public void enteruserType(String userType1)
{

	Log.info("Reading user type");
	Select userType2=new Select(selectUserType);
	userType2.selectByVisibleText(userType1);
	Log.info("user type is entered");
}

public void enterFromDate(String fromDate1)
{

	Log.info("Reading from date");
	this.fromDate.clear();
	this.fromDate.sendKeys(fromDate1);
	Log.info("from date is entered");
}

public void enterToDate(String toDate1)
{

	Log.info("Reading to date");
	this.toDate.clear();
	this.toDate.sendKeys(toDate1);
	Log.info("to date is entered");
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
		Log.info("Clicked on Add Icon");
	  }
		
public void clickOnSave()
{
	  Log.info("waiting to save new user");
	  save.click();
	  try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
Log.info("New User saved");	  
}

public void enterUserDetails() throws InterruptedException
{
	try {
		Log.info("entering user name");
		enterUserName(user_Name);
		Log.info("user name entered");
		Thread.sleep(2000);
		Log.info("entering first name");
		enterFirstName(first_Name);
		Log.info("first name entered");
		Thread.sleep(2000);
		Log.info("entering middle name");
		enterMiddleName(middle_Name);
		Log.info("middle name entered");
		Thread.sleep(2000);
		Log.info("entering last name");
		enterLastName(last_Name);
		Log.info("last name entered");
		Thread.sleep(2000);
		Log.info("entering email ID");
		enterEmailID(email_ID);
		Log.info("email ID entered");
		Thread.sleep(2000);
		Log.info("entering phone number");
		enterPhoneNumber(phone_Number);
		Log.info("phone number entered");
		Thread.sleep(2000);
		Log.info("entering date of birth");
		enterDateofBirth(date_of_birth);
		Log.info("date of birth entered");
		Thread.sleep(2000);
		Log.info("entering gender");
		enterGender(gender1);
		Log.info("gender entered");
		Thread.sleep(2000);
		Log.info("entering town");
		enterTown(user_Town);
		Log.info("town entered");
		Thread.sleep(2000);
		Log.info("entering address");
		enterAddress(user_Address);
		Log.info("address entered");
		Thread.sleep(2000);
		Log.info("entering postal code");
		enterPostalCode(postal_Code);
		Log.info("postal code entered");
		Thread.sleep(2000);
		Log.info("entering department");
		enterDepartment(depart_ment);
		Log.info("department entered");
		Thread.sleep(2000);
		Log.info("entering user type");
		enteruserType(user_Type);
		Log.info("user type entered");
		Thread.sleep(2000);
		Log.info("entering from date");
		enterFromDate(from_Date);
		Log.info("from date entered");
		Thread.sleep(2000);
		Log.info("Entering to date");
		enterToDate(to_Date);
		Log.info("to date entered");
		Log.info("About to Click on AddIcon");
		clickOnAddIcon();
		Log.info("User type successfully assigned");
		Thread.sleep(5000);
		Log.info("enterd all the details successfully");
		Reporter.log("enterd all the details successfully");
		
		}
	catch (Exception e) {

		Log.info("Exception caught while entering details in details page");
		Reporter.log("Exception caught while entering details in details page");

	}
	  
}






	
}
