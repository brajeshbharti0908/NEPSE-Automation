package utils.ExtentReports;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

import managers.FileReaderManager;

public class ExtentManager {
	private static ExtentReports extent;
	/*

	Method Name: getReporter
	Return Type: ExtentReports
	Parameter Type: - 

	This Method is used to create extent report


	*/
	
	
    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            
            extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults.html", true);
           extent.loadConfig(new File(FileReaderManager.getInstance().getConfigFileReader().getReportConfigPath()));
            extent.addSystemInfo("User Name", System.getProperty("user.name"));
            extent.addSystemInfo("Time Zone", System.getProperty("user.timezone"));
            extent.addSystemInfo("Machine", "windows 10"+"64 Bit");
            extent.addSystemInfo("Selenium", "3.12.0");
            extent.addSystemInfo("Maven", "3.5.2");
            extent.addSystemInfo("Java Version", "1.8");
            extent.loadConfig(new File(FileReaderManager.getInstance().getConfigFileReader().getReportConfigPath()));
            	
            
        }
        return extent;
    }
	
	
}
