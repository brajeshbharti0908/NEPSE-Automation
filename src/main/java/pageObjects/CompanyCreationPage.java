package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import context.TestContext;
import managers.FileReaderManager;
import utils.ExcelReader;
import utils.Log;

public class CompanyCreationPage {

	WebDriver driver;

	public CompanyCreationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	String sheetPath = FileReaderManager.getInstance().getConfigFileReader().getExcelSheetPath();
	String sheetName = "TC_004_companyreg";

	// Company details test data
	String company_Name_Data = ExcelReader.readCellData(sheetPath, sheetName, 4, 1);

	String company_Short_Name_Data = ExcelReader.readCellData(sheetPath, sheetName, 5, 1);

	String company_Email_Data = ExcelReader.readCellData(sheetPath, sheetName, 6, 1);

	String company_Registration_Number_Data = ExcelReader.readCellData(sheetPath, sheetName, 7, 1);
	String inCorporation_Date_Data = ExcelReader.readCellData(sheetPath, sheetName, 8, 1);
	String Web_Site_Data = ExcelReader.readCellData(sheetPath, sheetName, 9, 1);
	String contact_Person_Data = ExcelReader.readCellData(sheetPath, sheetName, 10, 1);
	String sector_List_Box_Data = ExcelReader.readCellData(sheetPath, sheetName, 11, 1);

	// Company address test data
	String company_addressType_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 14, 1);

	String company_addressLine_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 15, 1);
	String company_addressLine_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 16, 1);

	String company_addressLine_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 17, 1);
	String company_province_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 18, 1);
	String company_district_List_Box_Data = ExcelReader.readCellData(sheetPath, sheetName, 19, 1);
	String company_muncipality_List_Box_Data = ExcelReader.readCellData(sheetPath, sheetName, 20, 1);
	String company_town_Data = ExcelReader.readCellData(sheetPath, sheetName, 21, 1);
	String company_postalCode_Data = ExcelReader.readCellData(sheetPath, sheetName, 22, 1);
	String company_phoneNumber1_Data = ExcelReader.readCellData(sheetPath, sheetName, 23, 1);
	String company_phoneNumber2_Data = ExcelReader.readCellData(sheetPath, sheetName, 24, 1);
	String company_fax_Data = ExcelReader.readCellData(sheetPath, sheetName, 25, 1);

	// Company owner test data

	String companyOwner_designation_Data = ExcelReader.readCellData(sheetPath, sheetName, 28, 1);
	String companyOwner_directorType_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 29, 1);
	String companyOwner_firstName_Data = ExcelReader.readCellData(sheetPath, sheetName, 30, 1);
	String companyOwner_middleName_Data = ExcelReader.readCellData(sheetPath, sheetName, 31, 1);
	String companyOwner_lastName_Data = ExcelReader.readCellData(sheetPath, sheetName, 32, 1);
	String companyOwner_panNumber_Data = ExcelReader.readCellData(sheetPath, sheetName, 33, 1);
	String companyOwner_EmailID_Data = ExcelReader.readCellData(sheetPath, sheetName, 34, 1);
	String companyOwner_addressType_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 35, 1);
	String companyOwner_addressLine_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 36, 1);
	String companyOwner_addressLine_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 37, 1);
	String companyOwner_addressLine_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 38, 1);
	String companyOwner_province_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 39, 1);
	String companyOwner_district_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 40, 1);
	String companyOwner_muncipality_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 41, 1);
	String companyOwner_town_Data = ExcelReader.readCellData(sheetPath, sheetName, 42, 1);
	String companyOwner_postalCode_Data = ExcelReader.readCellData(sheetPath, sheetName, 43, 1);
	String companyOwner_phoneNumber1_Data = ExcelReader.readCellData(sheetPath, sheetName, 44, 1);
	String companyOwner_phoneNumber2_Data = ExcelReader.readCellData(sheetPath, sheetName, 45, 1);
	String companyOwner_educationQualification_ListBox_Data = ExcelReader.readCellData(sheetPath, sheetName, 46, 1);
	String companyOwner_citizenshipNumber_Data = ExcelReader.readCellData(sheetPath, sheetName, 47, 1);
	String companyOwner_citizenshipIssueDistrict_Data = ExcelReader.readCellData(sheetPath, sheetName, 48, 1);
	String companyOwner_citizenshipIssueDate_Data = ExcelReader.readCellData(sheetPath, sheetName, 49, 1);
	String companyOwner_totalExperience_Data = ExcelReader.readCellData(sheetPath, sheetName, 50, 1);

	// Finalcial year 1 test data
	String financialYear_ListBox_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 53, 1);
	String resultType_ListBox_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 54, 1);
	String description_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 55, 1);
	String revenue_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 56, 1);
	String totalExpenditure_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 57, 1);
	String grossProfit_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 58, 1);
	String taxPaid_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 59, 1);
	String netProfit_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 60, 1);
	String dividend_1_Data = ExcelReader.readCellData(sheetPath, sheetName, 61, 1);

	// Financial year 2 test data

	String financialYear_ListBox_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 63, 1);
	String resultType_ListBox_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 64, 1);
	String description_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 65, 1);
	String revenue_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 66, 1);
	String totalExpenditure_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 67, 1);
	String grossProfit_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 68, 1);
	String taxPaid_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 69, 1);
	String netProfit_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 70, 1);
	String dividend_2_Data = ExcelReader.readCellData(sheetPath, sheetName, 71, 1);

	// Financial year 3 test data
	String financialYear_ListBox_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 73, 1);
	String resultType_ListBox_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 74, 1);
	String description_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 75, 1);
	String revenue_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 76, 1);
	String totalExpenditure_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 77, 1);
	String grossProfit_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 78, 1);
	String taxPaid_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 79, 1);
	String netProfit_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 80, 1);
	String dividend_3_Data = ExcelReader.readCellData(sheetPath, sheetName, 81, 1);

	@FindBy(xpath = "//input[contains(@placeholder,'Company Name')]")
	private WebElement companyName;

	@FindBy(xpath = "//input[contains(@placeholder,'Company Short Name')]")
	private WebElement companyShortName;

	@FindBy(xpath = "//input[contains(@placeholder,'Company Email')]")
	private WebElement companyEmail;

	@FindBy(xpath = "//input[contains(@placeholder,'Company Registration Number')]")
	private WebElement companyRegistrationNumber;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-details/xf/div/div[2]/div[1]/div/div/my-date-picker/div/div[1]/div/button/span")
	private WebElement companyInCorporationTable;

	@FindBy(xpath = "//tr//td[3]//div[1]//div[1]//button[1]")
	private WebElement company_Calender_PreviousYear;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-details/xf/div/div[2]/div[1]/div/div/my-date-picker/div/div[2]/table[2]/tbody//tr//td/div/span")
	private List<WebElement> companyInCorporationDate;

	@FindBy(xpath = "//input[contains(@placeholder,'Website')]")
	private WebElement WebSite;

	@FindBy(xpath = "//input[contains(@placeholder,'Contact Person')]")
	private WebElement contactPerson;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/nots[1]/main[1]/div[1]/div[1]/app-root[1]/app-application[1]/xloader[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-company-details[1]/xf[1]/div[1]/div[2]/div[4]/div[1]/div[1]/select[1]")
	private WebElement sector_ListBox;

	@FindBy(xpath = "//button[contains(.,'Next')]")
	private WebElement next;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[1]//div[1]//div[1]//div[1]//div[1]//select[1]")
	private WebElement company_addressType_ListBox;

	@FindBy(xpath = "//input[contains(@placeholder,'Address Line 1')]")
	private WebElement company_addressLine_1;

	@FindBy(xpath = "//input[contains(@placeholder,'Address Line 2')]")
	private WebElement company_addressLine_2;

	@FindBy(xpath = "//input[contains(@placeholder,'Address Line 3')]")
	private WebElement company_addressLine_3;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-address/xf/div/div/div[2]/div[3]/div[2]/div/div/div/select")
	private WebElement company_province_ListBox;

	@FindBy(xpath = "//div[contains(@class,'row')]//div[3]//div[1]//div[1]//div[1]//select[1]")
	private WebElement company_district_ListBox;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[4]//div[1]//div[1]//div[1]//div[1]//select[1]")
	private WebElement company_muncipality_ListBox;

	@FindBy(xpath = "//input[contains(@placeholder,'Town')]")
	private WebElement company_town;

	@FindBy(xpath = "//input[contains(@placeholder,'Postal Code')]")
	private WebElement company_postalCode;

	@FindBy(xpath = "//input[contains(@placeholder,'Phone Number 1')]")
	private WebElement company_phoneNumber1;

	@FindBy(xpath = "//input[contains(@placeholder,'Phone Number 2')]")
	private WebElement company_phoneNumber2;

	@FindBy(xpath = "//input[contains(@placeholder,'Fax')]")
	private WebElement company_fax;

	@FindBy(xpath = "//button[contains(.,'Back')]")
	private WebElement back;

	@FindBy(xpath = "//a[contains(.,'+ Add another address')]")
	private WebElement addAnotherAddress;

	@FindBy(xpath = "//input[contains(@placeholder,'Designation')]")
	private WebElement companyOwner_designation;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-ownership-details/xf/div/div/div[2]/div[1]/div[2]/div/div/div/div/select")
	private WebElement companyOwner_directorType_ListBox;

	@FindBy(xpath = "//input[contains(@placeholder,'First Name')]")
	private WebElement companyOwner_firstName;

	@FindBy(xpath = "//input[contains(@placeholder,'Middle Name')]")
	private WebElement companyOwner_middleName;

	@FindBy(xpath = "//input[contains(@placeholder,'Last Name')]")
	private WebElement companyOwner_lastName;

	@FindBy(xpath = "//input[contains(@placeholder,'PAN')]")
	private WebElement companyOwner_panNumber;

	@FindBy(xpath = "//input[contains(@placeholder,'Email Id')]")
	private WebElement companyOwner_EmailID;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[3]//div[3]//div[1]//div[1]//div[1]//select[1]")
	private WebElement companyOwner_addressType_ListBox;

	@FindBy(xpath = "//input[contains(@placeholder,'Address Line 1')]")
	private WebElement companyOwner_addressLine_1;

	@FindBy(xpath = "//input[contains(@placeholder,'Address Line 2')]")
	private WebElement companyOwner_addressLine_2;

	@FindBy(xpath = "//input[contains(@placeholder,'Address Line 3')]")
	private WebElement companyOwner_addressLine_3;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-ownership-details/xf/div/div/div[2]/div[5]/div[2]/div/div/div/select")
	private WebElement companyOwner_province_ListBox;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[5]//div[3]//div[1]//div[1]//div[1]//select[1]")
	private WebElement companyOwner_district_ListBox;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[6]//div[1]//div[1]//div[1]//div[1]//select[1]")
	private WebElement companyOwner_muncipality_ListBox;

	@FindBy(xpath = "//input[contains(@placeholder,'Town')]")
	private WebElement companyOwner_town;

	@FindBy(xpath = "//input[contains(@placeholder,'Postal Code')]")
	private WebElement companyOwner_postalCode;

	@FindBy(xpath = "//div[@class='card-block']//div[7]//div[1]//div[1]//div[1]//div[1]//input[1]")
	private WebElement companyOwner_phoneNumber1;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[7]//div[2]//div[1]//div[1]//div[1]//input[1]")
	private WebElement companyOwner_phoneNumber2;

	@FindBy(xpath = "//div[contains(@class,'card-block')]//div[7]//div[3]//div[1]//div[1]//div[1]//select[1]")
	private WebElement companyOwner_educationQualification_ListBox;

	@FindBy(xpath = "//input[contains(@placeholder,'Citizenship Number')]")
	private WebElement companyOwner_citizenshipNumber;

	@FindBy(xpath = "//input[contains(@placeholder,'Citizenship Issue District')]")
	private WebElement companyOwner_citizenshipIssueDistrict;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-ownership-details/xf/div/div/div[2]/div[8]/div/div[3]/div/div/div/my-date-picker/div/div/div/button/span")
	private WebElement companyOwner_citizenshipIssueTable;

	@FindBy(xpath = "//tr//td[3]//div[1]//div[1]//button[1]")
	private WebElement companyOwner_Calender_PreviousYear;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-ownership-details/xf/div/div/div[2]/div[8]/div/div[3]/div/div/div/my-date-picker/div/div[2]/table[2]/tbody//tr//td/div/span")
	private List<WebElement> companyOwner_citizenshipIssueSelectDate;

	@FindBy(xpath = "//input[contains(@placeholder,'Total Experience (In Years)')]")
	private WebElement companyOwner_totalExperience;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/div/div/div[2]/div[1]/app-company-financial-details/xf/div[1]/div[1]/span[2]")
	private WebElement financialInformation_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[2]//div[1]//div[1]//div[1]//select[1]")
	private WebElement financialYear_ListBox_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[2]//div[2]//div[1]//div[1]//select[1]")
	private WebElement resultType_ListBox_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[2]//div[3]//div[1]//div[1]//textarea[1]")
	private WebElement description_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[2]//div[4]//div[1]//div[1]//input[1]")
	private WebElement revenue_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[3]//div[1]//div[1]//div[1]//input[1]")
	private WebElement totalExpenditure_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[3]//div[2]//div[1]//div[1]//input[1]")
	private WebElement grossProfit_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[3]//div[3]//div[1]//div[1]//input[1]")
	private WebElement taxPaid_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[3]//div[4]//div[1]//div[1]//input[1]")
	private WebElement netProfit_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[1]//div[4]//div[1]//div[1]//div[1]//input[1]")
	private WebElement dividend_1;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[2]//div[1]//div[1]//div[1]//select[1]")
	private WebElement financialYear_ListBox_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[2]//div[2]//div[1]//div[1]//select[1]")
	private WebElement resultType_ListBox_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[2]//div[3]//div[1]//div[1]//textarea[1]")
	private WebElement description_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[2]//div[4]//div[1]//div[1]//input[1]")
	private WebElement revenue_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[3]//div[1]//div[1]//div[1]//input[1]")
	private WebElement totalExpenditure_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[3]//div[2]//div[1]//div[1]//input[1]")
	private WebElement grossProfit_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[3]//div[3]//div[1]//div[1]//input[1]")
	private WebElement taxPaid_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[3]//div[4]//div[1]//div[1]//input[1]")
	private WebElement netProfit_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[2]//div[4]//div[1]//div[1]//div[1]//input[1]")
	private WebElement dividend_2;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[2]//div[1]//div[1]//div[1]//select[1]")
	private WebElement financialYear_ListBox_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[2]//div[2]//div[1]//div[1]//select[1]")
	private WebElement resultType_ListBox_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[2]//div[3]//div[1]//div[1]//textarea[1]")
	private WebElement description_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[2]//div[4]//div[1]//div[1]//input[1]")
	private WebElement revenue_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[3]//div[1]//div[1]//div[1]//input[1]")
	private WebElement totalExpenditure_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[3]//div[2]//div[1]//div[1]//input[1]")
	private WebElement grossProfit_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[3]//div[3]//div[1]//div[1]//input[1]")
	private WebElement taxPaid_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[3]//div[4]//div[1]//div[1]//input[1]")
	private WebElement netProfit_3;

	@FindBy(xpath = "//app-company-financial-details//xf[contains(@ng-reflect-model,'[object Object]')]//div[3]//div[4]//div[1]//div[1]//div[1]//input[1]")
	private WebElement dividend_3;

	@FindBy(xpath = "//button[contains(.,'Submit Application')]")
	private WebElement submitApplication;

	@FindBy(xpath = "//button[contains(.,'Save')]")
	private WebElement save;

	@FindBy(xpath = "//button[contains(.,'Cancel')]")
	private WebElement cancel;

	@FindBy(xpath = "/html/body/app-root/nots/main/div/div/app-root/app-application/xloader/div/modal-component/div/div/div/div[3]/div/button[1]")
	private WebElement submitPopUp;

	@FindBy(xpath = "//i[@class='nf-angledown']")
	WebElement userNameArrow;

	@FindBy(xpath = "//span[contains(.,'Log Out')]")
	WebElement logout;
	
	/*

	Method Name:enterCompanyDetailsSaveAndClickNext
	Return Type: No Return Type
	Parameter Type: No Parameter 
	This method enters company Details and saves

	*/
	

	public void enterCompanyDetailsSaveAndClickNext() {

		try {
			Thread.sleep(2000);
			Log.info("waiting to enter company name");
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			TestContext.getTestContextInstance().getWait().waitForElement(companyName);
			companyName.clear();
			companyName.sendKeys(company_Name_Data);
			Log.info("Entered company Name");
			Log.info("Clearing and entering comp short name");
			companyShortName.clear();

			companyShortName.sendKeys(company_Short_Name_Data);
			Log.info("Entered comp short name ");

			Log.info("Clearing and entering comp email id");
			companyEmail.clear();
			companyEmail.sendKeys(company_Email_Data);

			Log.info("Entred company email id ");
			companyRegistrationNumber.clear();
			companyRegistrationNumber.sendKeys(company_Registration_Number_Data);
			Log.info("Entering incorporation data ");

			selectIncorporationDate();

			// inCorporationDate.sendKeys(inCorporation_Date_Data);
			Log.info("Entered incorporation data ");

			Log.info("Clearing and entering website");

			WebSite.clear();
			WebSite.sendKeys(Web_Site_Data);
			Log.info("entered website");
			contactPerson.clear();

			contactPerson.sendKeys(contact_Person_Data);

			Select sector = new Select(sector_ListBox);
			sector.selectByVisibleText(sector_List_Box_Data);
			save.click();
			Thread.sleep(2000);
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			Reporter.log("Entered company details successfully");
			next.click();

		}

		catch (Exception e) {
			e.printStackTrace();
			Log.info("Exception caugh while entering company details under company details");
			Reporter.log("Failed to enter company details under Company details");

		}

	}

	/*

	Method Name:enterCompanAddressDetailsSaveAndClickNext
	Return Type: No Return Type
	Parameter Type: No Parameter 
	This method enters company address Details and saves

	*/
	
	
	public void enterCompanyAddressDetailsSaveAndClickNext() {

		try {

			TestContext.getTestContextInstance().getWait().waitForElement(company_addressType_ListBox);

			Select addressType = new Select(company_addressType_ListBox);
			addressType.selectByVisibleText(company_addressType_ListBox_Data);
			company_addressLine_1.clear();
			company_addressLine_2.clear();
			company_addressLine_3.clear();
			company_addressLine_1.sendKeys(company_addressLine_1_Data);
			company_addressLine_2.sendKeys(company_addressLine_2_Data);
			company_addressLine_3.sendKeys(company_addressLine_3_Data);
			Thread.sleep(1000);
			Select province = new Select(company_province_ListBox);

			province.selectByVisibleText(company_province_ListBox_Data);
			Thread.sleep(1000);
			Select district = new Select(company_district_ListBox);

			district.selectByVisibleText(company_district_List_Box_Data);

			Thread.sleep(1000);
			Select muncipality = new Select(company_muncipality_ListBox);

			muncipality.selectByVisibleText(company_muncipality_List_Box_Data);

			company_town.clear();

			company_town.sendKeys(company_town_Data);
			company_postalCode.clear();
			company_postalCode.sendKeys(company_postalCode_Data);
			company_phoneNumber1.clear();
			company_phoneNumber1.sendKeys(company_phoneNumber1_Data);
			company_phoneNumber2.clear();
			company_phoneNumber2.sendKeys(company_phoneNumber2_Data);
			company_fax.clear();
			company_fax.sendKeys(company_fax_Data);
			save.click();
			Thread.sleep(2000);
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			Reporter.log("Entered company address details successfully");
			next.click();
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info("Exception caught while entering company address details");
			Reporter.log("Failed to enter company address details");

		}

	}

	/*

	Method Name:enterCompanyOwnershipDetails
	Return Type: No Return Type
	Parameter Type: No Parameter 
	This method enters company ownership details and saves

	*/
	
	
	public void enterCompanyOwnershipDetailsSaveAndClickNext() {

		try {
			Log.info("Waiting for company owner designation to display");

			TestContext.getTestContextInstance().getWait().waitForElement(companyOwner_designation);
			companyOwner_designation.clear();
			companyOwner_designation.sendKeys(companyOwner_designation_Data);
			Log.info("Company ownder designation entered");
			Log.info("Waitint to select director type");
			Select directorType = new Select(companyOwner_directorType_ListBox);
			directorType.selectByVisibleText(companyOwner_directorType_ListBox_Data);
			Log.info("director type selected");

			Log.info("clearing and  trying to entering company owner first name ");
			companyOwner_firstName.clear();
			companyOwner_firstName.sendKeys(companyOwner_firstName_Data);

			Log.info("company owner firest name entered");
			Log.info("Clearing and trying to entering company owner middle name");

			companyOwner_middleName.clear();

			companyOwner_middleName.sendKeys(companyOwner_middleName_Data);
			Log.info("Entered middle name of company owner  ");
			Log.info("Clearing and trying to enter entering last name of company owner");
			companyOwner_lastName.clear();
			companyOwner_lastName.sendKeys(companyOwner_lastName_Data);

			Log.info("entered compay owner last name");
			Log.info("Clearing and trying to enter pan number");

			companyOwner_panNumber.clear();
			companyOwner_panNumber.sendKeys(companyOwner_panNumber_Data);

			Log.info("Pan number entered");
			Log.info("Trying to clear and enter company owner email id ");

			companyOwner_EmailID.clear();
			companyOwner_EmailID.sendKeys(companyOwner_EmailID_Data);

			Log.info("Entered company owner email id ");
			Log.info("Trying to select company owner address type");

			Select addressType = new Select(companyOwner_addressType_ListBox);
			addressType.selectByVisibleText(companyOwner_addressType_ListBox_Data);

			Log.info("companyowner address type selected");

			Log.info("trying to clear and enter company owner address line 1");

			companyOwner_addressLine_1.clear();
			companyOwner_addressLine_1.sendKeys(companyOwner_addressLine_1_Data);
			Log.info("Company ower address line 1 entered");
			Log.info("trying to clear and enter company owner address line 2");
			companyOwner_addressLine_2.clear();
			companyOwner_addressLine_2.sendKeys(companyOwner_addressLine_2_Data);
			Log.info("Company ower address line 2 entered");

			Log.info("trying to clear and enter company owner address line 3");
			companyOwner_addressLine_3.clear();
			companyOwner_addressLine_3.sendKeys(companyOwner_addressLine_3_Data);
			Log.info("Company ower address line 3 entered");
			Thread.sleep(1000);
			Select province = new Select(companyOwner_province_ListBox);
			province.selectByVisibleText(companyOwner_province_ListBox_Data);
			Thread.sleep(1000);
			Select district = new Select(companyOwner_district_ListBox);
			district.selectByVisibleText(companyOwner_district_ListBox_Data);
			Thread.sleep(1000);
			Select muncipality = new Select(companyOwner_muncipality_ListBox);
			muncipality.selectByVisibleText(companyOwner_muncipality_ListBox_Data);

			companyOwner_town.clear();
			companyOwner_town.sendKeys(companyOwner_town_Data);
			companyOwner_postalCode.clear();
			companyOwner_postalCode.sendKeys(companyOwner_postalCode_Data);

			companyOwner_phoneNumber1.clear();
			companyOwner_phoneNumber1.sendKeys(companyOwner_phoneNumber1_Data);

			companyOwner_phoneNumber2.clear();
			companyOwner_phoneNumber2.sendKeys(companyOwner_phoneNumber2_Data);
			Thread.sleep(1000);
			Select educationQualification = new Select(companyOwner_educationQualification_ListBox);
			educationQualification.selectByVisibleText(companyOwner_educationQualification_ListBox_Data);

			companyOwner_citizenshipNumber.clear();
			companyOwner_citizenshipNumber.sendKeys(companyOwner_citizenshipNumber_Data);

			companyOwner_citizenshipIssueDistrict.clear();
			companyOwner_citizenshipIssueDistrict.sendKeys(companyOwner_citizenshipIssueDistrict_Data);

			selectCitizenshipIssueDate();
			companyOwner_totalExperience.clear();
			companyOwner_totalExperience.sendKeys(companyOwner_totalExperience_Data);

			save.click();
			Thread.sleep(2000);
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			Reporter.log("Entered company ownership details successfully");
			next.click();
		}

		catch (Exception e) {
			e.printStackTrace();
			Log.info("exception caught while entering company owner details");
			Reporter.log("Failed to enter company ownership details");

		}

	}
	
	/*

	Method Name:enterFinancialInformationAndSave
	Return Type: No Return Type
	Parameter Type: No Parameter 
	This method enters Financial information 1,2 and 3.

	*/

	public void enterFinancialInformationAndSave() {
		try {
			enterFinancialInformation_1();
			enterFinancialInformation_2();
			enterFinancialInformation_3();
			save.click();
			Thread.sleep(2000);
			Reporter.log("Successfully entered financial informatin 1,2 and 3");

		}

		catch (InterruptedException ex) {
			ex.printStackTrace();
			Reporter.log("Failed to enter finalcial information");

		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info("Failed to enter financial information and save");
			Log.info(e.getMessage());
			Reporter.log("Failed to enter finalcial information");
		}
	}

	
	/*

	Method Name:submitAndLogout
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method Submits and log's out

	*/
	
	
	public void submitAndLogout() {
		try {
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			submitApplication.click();
			Thread.sleep(2000);
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			TestContext.getTestContextInstance().getWait().waitForElement(submitPopUp);
			submitPopUp.click();
			Thread.sleep(5000);
			TestContext.getTestContextInstance().getWait().untilPageLoadComplete(driver);
			clickOnUserNameArrow();
			clickOnLogout();
			Thread.sleep(2000);
Reporter.log("submitted and logged out successfully");
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Failed to submit and logout");
			Reporter.log("Failed to submit and logout");
		}

	}
	
	
	
	/*

	Method Name:enterFinancialInformation_1
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method enters Financial Information 1

	*/

	public void enterFinancialInformation_1() {

		try {
			Thread.sleep(1000);
			TestContext.getTestContextInstance().getWait().waitForElement(financialYear_ListBox_1);
			Select finalcialYear_1 = new Select(financialYear_ListBox_1);
			finalcialYear_1.selectByVisibleText(financialYear_ListBox_1_Data);
			Thread.sleep(1000);

			Select resultType_1 = new Select(resultType_ListBox_1);
			resultType_1.selectByVisibleText(resultType_ListBox_1_Data);
			description_1.clear();
			description_1.sendKeys(description_1_Data);
			revenue_1.clear();
			revenue_1.sendKeys(revenue_1_Data);
			totalExpenditure_1.clear();
			totalExpenditure_1.sendKeys(totalExpenditure_1_Data);
			grossProfit_1.clear();
			grossProfit_1.sendKeys(grossProfit_1_Data);
			taxPaid_1.clear();
			taxPaid_1.sendKeys(taxPaid_1_Data);
			netProfit_1.clear();
			netProfit_1.sendKeys(netProfit_1_Data);
			dividend_1.clear();
			dividend_1.sendKeys(dividend_1_Data);
			Reporter.log("Entered financial information 1 successfully");

		}

		catch (InterruptedException ex) {

			ex.printStackTrace();
			Reporter.log("Failed to enter financial 1 information");

		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info("exception caught while entering finalcial informaiton 1");
			Reporter.log("Failed to enter financial 1 information");
		}

	}
	
	/*

	Method Name:enterFinancialInformation_2
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method enters Financial Information 2

	*/
	

	public void enterFinancialInformation_2() {
		try {
			Thread.sleep(1000);
			TestContext.getTestContextInstance().getWait().waitForElement(financialYear_ListBox_2);
			Select finalcialYear_2 = new Select(financialYear_ListBox_2);
			finalcialYear_2.selectByVisibleText(financialYear_ListBox_2_Data);
			Thread.sleep(1000);

			Select resultType_2 = new Select(resultType_ListBox_2);
			resultType_2.selectByVisibleText(resultType_ListBox_2_Data);
			description_2.clear();
			description_2.sendKeys(description_2_Data);
			revenue_2.clear();
			revenue_2.sendKeys(revenue_2_Data);
			totalExpenditure_2.clear();
			totalExpenditure_2.sendKeys(totalExpenditure_2_Data);
			grossProfit_2.clear();
			grossProfit_2.sendKeys(grossProfit_2_Data);
			taxPaid_2.clear();
			taxPaid_2.sendKeys(taxPaid_2_Data);
			netProfit_2.clear();
			netProfit_2.sendKeys(netProfit_2_Data);
			dividend_2.clear();
			dividend_2.sendKeys(dividend_2_Data);
			Reporter.log("Entered financial information 2 successfully");
		}

		catch (InterruptedException ex) {

			ex.printStackTrace();
			Reporter.log("Failed to enter financial 2 information");
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info("exception caught while entering finalcial informaiton 2");
			Reporter.log("Failed to enter financial 2 information");
		}

	}
	/*

	Method Name:enterFinancialInformation_3
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method enters Financial Information 3
	*/
	public void enterFinancialInformation_3() {
		try {
			Thread.sleep(1000);
			TestContext.getTestContextInstance().getWait().waitForElement(financialYear_ListBox_3);
			Select finalcialYear_3 = new Select(financialYear_ListBox_3);
			finalcialYear_3.selectByVisibleText(financialYear_ListBox_3_Data);
			Thread.sleep(1000);

			Select resultType_3 = new Select(resultType_ListBox_3);
			resultType_3.selectByVisibleText(resultType_ListBox_3_Data);
			description_3.clear();
			description_3.sendKeys(description_3_Data);
			revenue_3.clear();
			revenue_3.sendKeys(revenue_3_Data);
			totalExpenditure_3.clear();
			totalExpenditure_3.sendKeys(totalExpenditure_3_Data);
			grossProfit_3.clear();
			grossProfit_3.sendKeys(grossProfit_3_Data);
			taxPaid_3.clear();
			taxPaid_3.sendKeys(taxPaid_3_Data);
			netProfit_3.clear();
			netProfit_3.sendKeys(netProfit_3_Data);
			dividend_3.clear();
			dividend_3.sendKeys(dividend_3_Data);
			Reporter.log("Entered financial information 1 successfully");

		}

		catch (InterruptedException ex) {

			ex.printStackTrace();
			Reporter.log("Failed to enter financial 3 information");
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info("exception caught while entering finalcial informaiton 3");
			Reporter.log("Failed to enter financial 3 information");
		}

	}
	
	
	/*

	Method Name:selectIncorporationDate
	Return Type: No Return Type
	Parameter Type:No Parameter
	This method selects In corporation Date

	*/
	

	public void selectIncorporationDate()

	{
		Log.info("Waiting to click on date table");

		try {

			TestContext.getTestContextInstance().getWait().waitForElement(companyInCorporationTable);
			TestContext.getTestContextInstance().getSeleniumFunctions().mouseover(companyInCorporationTable);
			Log.info("mouse hovered over calender symbol");

			try {
				companyInCorporationTable.click();
				Thread.sleep(3000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				Log.info(e2.getMessage());
				Log.info("Failed to click on Company incorporation calender");
			}

			Log.info("Clicked on calender symbol");

			TestContext.getTestContextInstance().getWait().waitForElement(company_Calender_PreviousYear);
			TestContext.getTestContextInstance().getSeleniumFunctions().mouseover(company_Calender_PreviousYear);

			try {
				company_Calender_PreviousYear.click();
			}

			catch (Exception e3) {

				Log.info(e3.getMessage());
				Log.info("Failed to click on previous year arrow");
			}

			Log.info("Clicked on previous year symbol");

			Thread.sleep(2000);

			try {

				for (WebElement ele : companyInCorporationDate) {

					String date = ele.getText();

					if (date.equalsIgnoreCase(inCorporation_Date_Data)) {
						TestContext.getTestContextInstance().getSeleniumFunctions().mouseover(ele);
						ele.click();

					}
					Log.info("date Selected is " + inCorporation_Date_Data);
					break;
				}

			}

			catch (Exception e) {

				Log.info("Exception caught while selection incorporation date");
				Log.info(e.getMessage());
			}
		}

		catch (Exception e) {

			e.printStackTrace();
			Log.info(e.getMessage());
			Log.info("Exception caught in method select incorporation data ");
		}

	}
	
	
	/*

	Method Name:selectCitizenshipIssueDate
	Return Type: No Return Type
	Parameter Type: No Parameter
	This method selects Citizenship Issue date

	*/

	public void selectCitizenshipIssueDate() {

		Log.info("Waiting to click on date table");

		try {
			TestContext.getTestContextInstance().getWait().waitForElement(companyOwner_citizenshipIssueTable);
			Log.info("Waiting to click on issue table");
			TestContext.getTestContextInstance().getSeleniumFunctions().mouseover(companyOwner_citizenshipIssueTable);
			Log.info("mouse hovered over calender symbol");

			try {

				companyOwner_citizenshipIssueTable.click();
			}

			catch (Exception e1) {

				e1.printStackTrace();
				Log.info(e1.getMessage());
				Log.info("Failed to click on citizenship issue table");

			}

			Thread.sleep(3000);

			Log.info("Clicked on calender symbol");

			Log.info("waiting to click on previous year");

			TestContext.getTestContextInstance().getWait().waitForElement(companyOwner_Calender_PreviousYear);
			TestContext.getTestContextInstance().getSeleniumFunctions().mouseover(companyOwner_Calender_PreviousYear);

			companyOwner_Calender_PreviousYear.click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			Log.info("clicked on previous year");
			Log.info("Waiting to click on date");

			for (WebElement ele : companyOwner_citizenshipIssueSelectDate) {

				String date = ele.getText();

				if (date.equalsIgnoreCase(companyOwner_citizenshipIssueDate_Data)) {
					TestContext.getTestContextInstance().getSeleniumFunctions().mouseover(ele);
					ele.click();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					Log.info("Clicked on date");
					Log.info("date Selected is " + companyOwner_citizenshipIssueDate_Data);
					break;
				}

			}

		}

		catch (Exception e) {

			Log.info("Exception caught while selecting citizenship issue date");
			Log.info(e.getMessage());
		}

	}
	
	

/*

Method Name:clickOnUserNameArrow
Return Type: No Return Type
Parameter Type:No Parameter
This method clicks on userName arrow

*/

	public void clickOnUserNameArrow() {

		Log.info("waiting to click on username arrow");
		TestContext.getTestContextInstance().getWait().waitForElement(userNameArrow);
		userNameArrow.click();

		Log.info("clicked on username arrow");
	}
	
	
	/*

	Method Name:clickOnLogout
	Return Type: No Return Type
	Parameter Type:No Parameter
	This method clicks on Logout

	*/
	

	public void clickOnLogout() {
		Log.info("waiting to click on logout");
		TestContext.getTestContextInstance().getWait().waitForElement(logout);
		logout.click();

		Log.info("clicked on logout");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}