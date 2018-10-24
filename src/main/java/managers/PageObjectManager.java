package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.AuthorizeCorporateActionsPage;
import pageObjects.CompanyApplicationPage;
import pageObjects.CompanyCreationPage;
import pageObjects.CompanyRegistrationDetailsPage;
import pageObjects.CompanyRegistrationHomePage;
import pageObjects.ConfigureUserType;
import pageObjects.CreateSplitsApplicationPage;
import pageObjects.ExternalUserRegistration;
import pageObjects.ManageUsers;
import pageObjects.MemberRegistrationDetailsPage;
import pageObjects.MemberRegistrationHomePage;
import pageObjects.NepseOnlineTradingSystemPageForCompanyRep;
import pageObjects.NotsApplicationHomePage;
import pageObjects.SecuritiesCorporateActionsReviewPage;
import pageObjects.UserRegistrationApproval;
import pageObjects.NepseOnlineTradingSystemPageForAdminUser;

public class PageObjectManager {
	private WebDriver driver;
	private MemberRegistrationDetailsPage memberRegistrationDetailsPage;
	private MemberRegistrationHomePage memberRegistrationHomePage;
	private NotsApplicationHomePage notsApplicationHomePage;

	private UserRegistrationApproval userRegistrationApproval;
	private CompanyRegistrationDetailsPage companyRegistrationDetailsPage;
	private CompanyRegistrationHomePage companyRegistrationHomePage;
	private ConfigureUserType configureUserType;
	private ManageUsers manageUsers1;
	private CompanyCreationPage companyCreationPage;
	private NepseOnlineTradingSystemPageForCompanyRep nepseOnlineTradingSystemPageForCompanyRep;
	private CompanyApplicationPage companyApplicationPage;
	private NepseOnlineTradingSystemPageForAdminUser nepseOnlineTradingSystemPageForAdminUser;
	private CreateSplitsApplicationPage createSplitsApplicationPage;
	private SecuritiesCorporateActionsReviewPage securitiesCorporateActionsReviewPage;

	private ExternalUserRegistration externalUserRegistration;
	private AuthorizeCorporateActionsPage authorizeCorporateActionsPage;

	/*
	 * Constructor Name: PageObjectManager Parameter Type: WebDriver
	 * 
	 */
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * 
	 * Method Name:getMemberRegistrationDetailsPage Return Type:
	 * MemberRegistrationDetailsPage This method is used to return the instance of
	 * class MemberRegistrationDetailsPage
	 * 
	 * 
	 */

	public MemberRegistrationDetailsPage getMemberRegistrationDetailsPage() {
		return (memberRegistrationDetailsPage == null)
				? memberRegistrationDetailsPage = new MemberRegistrationDetailsPage(driver)
				: memberRegistrationDetailsPage;

	}

	/*
	 * 
	 * Method Name:getMemberRegistrationHomePage Return Type:
	 * MemberRegistrationHomePage This method is used to create instance of class
	 * MemberRegistrationHomePage
	 * 
	 * 
	 */

	public MemberRegistrationHomePage getMemberRegistrationHomePage() {

		return (memberRegistrationHomePage == null)
				? memberRegistrationHomePage = new MemberRegistrationHomePage(driver)
				: memberRegistrationHomePage;

	}

	public NotsApplicationHomePage getNotsApplicationHomePage() {

		return (notsApplicationHomePage == null) ? notsApplicationHomePage = new NotsApplicationHomePage(driver)
				: notsApplicationHomePage;
	}

	public UserRegistrationApproval getUserRegistrationApproval() {

		return (userRegistrationApproval == null) ? userRegistrationApproval = new UserRegistrationApproval(driver)
				: userRegistrationApproval;
	}

	public CompanyRegistrationDetailsPage getCompanyRegistrationDetailsPage() {

		return (companyRegistrationDetailsPage == null)
				? companyRegistrationDetailsPage = new CompanyRegistrationDetailsPage(driver)
				: companyRegistrationDetailsPage;
	}

	public CompanyRegistrationHomePage getCompanyRegistrationHomePage() {

		return (companyRegistrationHomePage == null)
				? companyRegistrationHomePage = new CompanyRegistrationHomePage(driver)
				: companyRegistrationHomePage;
	}

	public ConfigureUserType getConfigureUserType() {

		return (configureUserType == null) ? configureUserType = new ConfigureUserType(driver) : configureUserType;
	}

	public ManageUsers getManageUsers() {

		return (manageUsers1 == null) ? manageUsers1 = new ManageUsers(driver) : manageUsers1;
	}

	public CompanyCreationPage getCompanyCreationPage() {

		return (companyCreationPage == null) ? companyCreationPage = new CompanyCreationPage(driver)
				: companyCreationPage;

	}

	public NepseOnlineTradingSystemPageForCompanyRep getNepseOnlineTradingSystemPageForCompanyRep() {

		return (nepseOnlineTradingSystemPageForCompanyRep == null)
				? nepseOnlineTradingSystemPageForCompanyRep = new NepseOnlineTradingSystemPageForCompanyRep(driver)
				: nepseOnlineTradingSystemPageForCompanyRep;
	}

	public CompanyApplicationPage getcompanyApplicationPage() {

		return (companyApplicationPage == null) ? companyApplicationPage = new CompanyApplicationPage(driver)
				: companyApplicationPage;
	}

	public NepseOnlineTradingSystemPageForAdminUser getNepseOnlineTradingSystemPageForAdminUser() {

		return (nepseOnlineTradingSystemPageForAdminUser == null)
				? nepseOnlineTradingSystemPageForAdminUser = new NepseOnlineTradingSystemPageForAdminUser(driver)
				: nepseOnlineTradingSystemPageForAdminUser;

	}

	public ExternalUserRegistration getExternalUserRegistration() {

		return (externalUserRegistration == null) ? externalUserRegistration = new ExternalUserRegistration(driver)
				: externalUserRegistration;
	}

	public CreateSplitsApplicationPage getCreateSplitsApplicationPage() {

		return (createSplitsApplicationPage == null)
				? createSplitsApplicationPage = new CreateSplitsApplicationPage(driver)
				: createSplitsApplicationPage;

	}

	public SecuritiesCorporateActionsReviewPage getSecuritiesCorporateActionsReviewPage() {

		return (securitiesCorporateActionsReviewPage == null)
				? securitiesCorporateActionsReviewPage = new SecuritiesCorporateActionsReviewPage(driver)
				: securitiesCorporateActionsReviewPage;

	}

	
	public AuthorizeCorporateActionsPage getAuthorizeCorporateActionsPage() {
		
		
		
		return(authorizeCorporateActionsPage==null)? authorizeCorporateActionsPage= new AuthorizeCorporateActionsPage(driver) : authorizeCorporateActionsPage;
	}
	
	
	
	
	
	
	
	
	
}
