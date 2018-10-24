package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvirnomentType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";

	/*
	 * Constructor Name: ConfigFileReader this constructor loads the config file
	 */
	public ConfigFileReader() {
		try {
			FileReader fr = new FileReader(propertyFilePath);
			BufferedReader br = new BufferedReader(fr);
			properties = new Properties();
			try {
				properties.load(br);
				br.close();
			}

			catch (IOException e) {

				e.printStackTrace();
			}
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();

		}

	}

	// This method returns the chromedriverpath
	public String getChromeDriverPath() {

		String driverpath = properties.getProperty("chromedriverPath");
		if (driverpath != null)
			return driverpath;
		else
			throw new RuntimeException("driver path not specifiec in cong propertity file");

	}

	// This method returns the firefoxdriverpath
	public String getFirefoxDriverPath() {

		String driverpath = properties.getProperty("firefoxdriverPath");
		if (driverpath != null)
			return driverpath;
		else
			throw new RuntimeException("driver path not specifiec in cong propertity file");

	}

	// this method returns the timeout period
	public long getImplicitlyWait() {

		String implicitlywait = properties.getProperty("Implicitlywait");
		if (implicitlywait != null)
			return Long.parseLong(implicitlywait);
		else
			throw new RuntimeException("implicitly wait not specified in cong file");
	}

	// this method returns the url from config file
	public String getUrl() {

		String Url = properties.getProperty("URL");
		if (Url != null)
			return Url;

		else
			throw new RuntimeException("url not specified in cong file");

	}

	// this method returns the browser
	public DriverType getBrowser() {

		String browserName = properties.getProperty("browser");
		if (browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;

		else if (browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if (browserName.equalsIgnoreCase("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException("browser not specified in cong file");
	}

	// this method returns the envirnoment
	public EnvirnomentType getEnvirnoment() {
		String envirnomentName = properties.getProperty("envirnoment");

		if (envirnomentName == null || envirnomentName.equals("local"))
			return EnvirnomentType.LOCAL;

		else if (envirnomentName.equalsIgnoreCase("remote"))
			return EnvirnomentType.REMOTE;
		else
			throw new RuntimeException("envirnoment not specified in cong file");
	}

	// this method returns is windowsize set
	public Boolean getWindowSize() {

		String windowSize = properties.getProperty("windowSizeMax");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	// this method returns the testdatasource path
	public String getTestDataResourcePath() {

		String testDataResourcePath = properties.getProperty("testDataResourcePath");
		if (testDataResourcePath != null)
			return testDataResourcePath;
		else
			throw new RuntimeException("Test Data Resouce path not specified in config file");

	}

	// this method returns the report config path
	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("report config path not specfied in path ");

	}

	// this method returns the nots application url
	public String getNotsApplicationUrl() {

		String notsApplicationUrl = properties.getProperty("NOTS_application_URL");
		if (notsApplicationUrl != null)
			return notsApplicationUrl;
		else
			throw new RuntimeException("nots application url not specified in config file");
	}

	// this method returns the companyuserregistrationurl
	public String getCompanyUserRegistrationUrl() {

		String CompanyUserRegistrationUrl = properties.getProperty("Company_user_registration_URL");
		if (CompanyUserRegistrationUrl != null)
			return CompanyUserRegistrationUrl;
		else
			throw new RuntimeException("Company UserRegistration Url not specified in config file ");

	}

	// this method returns the member user registration url
	public String getMemberUserRegistrationUrl() {

		String MemberUserRegistrationUrl = properties.getProperty("Member_user_registration_URL");
		if (MemberUserRegistrationUrl != null)
			return MemberUserRegistrationUrl;
		else
			throw new RuntimeException("Member_user_registration_URL not specified in config file");
	}

	// this method returns the maker member registration url
	public String getMakerMemberUserRegistrationUrl() {

		String MakerMemberUserRegistrationUrl = properties.getProperty("Maker_Member_user_registration_URL");
		if (MakerMemberUserRegistrationUrl != null)
			return MakerMemberUserRegistrationUrl;
		else
			throw new RuntimeException("MakerMemberUserRegistrationUrl not specifiec in config file");

	}

	public String getExcelSheetPath() {

		String excelSheetPath = properties.getProperty("excelsheetpath");
		if (excelSheetPath != null)
			return excelSheetPath;
		else
			throw new RuntimeException("excel sheet path not specified in config file");

	}

	public String getLog4jPropertiesPath() {

		String log4jPath = properties.getProperty("log4j_properties_path");
		if (log4jPath != null)
			return log4jPath;
		else
			throw new RuntimeException("log4jproperties path not specified in congf file");

	}

	public String getdbURL() {

		String dbURL = properties.getProperty("dbURL");
		if (dbURL != null)
			return dbURL;
		else
			throw new RuntimeException("db URL not specified in congf file");

	}

	public String getdbUserName() {

		String dbUserName = properties.getProperty("dbUserName");
		if (dbUserName != null)
			return dbUserName;
		else
			throw new RuntimeException("db User Name not specified in congf file");

	}

	public String getdbPassword() {

		String dbPassword = properties.getProperty("dbPassword");
		if (dbPassword != null)
			return dbPassword;
		else
			throw new RuntimeException("db Password not specified in congf file");

	}

	public String getNotsUserName() {
		String notsUserName = properties.getProperty("NotsUserName");

		if (notsUserName != null)
			return notsUserName;
		else

			throw new RuntimeException("Nots user name not specified in congf file");
	}

	
	
	public String getNotsPassword() {

		String notsPassword = properties.getProperty("NotsPassword");
		if (notsPassword != null)
			return notsPassword;
		else
			throw new RuntimeException("Nots password not specified in config file");
	}

}
