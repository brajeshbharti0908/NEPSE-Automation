package utils.Listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.LogStatus;

import context.TestContext;
import managers.WebDriverManager;
import testCases.BasePage;
import utils.ExtentReports.ExtentManager;
import utils.ExtentReports.ExtentTestManager;

public class TestListener extends BasePage implements ITestListener {
	private WebDriverManager webdrivermanager;
	String workingDir = System.getProperty("user.dir");
	
	TestContext context= TestContext.getTestContextInstance();
	WebDriver driver=context.getWebDriverManager().getDriver();
	private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
    
    //Before starting all tests, below method runs.
    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("I am in onStart method " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", this.driver);
    }
 
    //After ending all tests, below method runs.
    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("I am in onFinish method " + iTestContext.getName());
        //Do tier down operations for extentreports reporting!
        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
    }
 
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am in onTestStart method " +  getTestMethodName(iTestResult) + " start");
        //Start operation for extentreports.
        ExtentTestManager.startTest(iTestResult.getMethod().getMethodName(),"");
    }
 
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("I am in onTestSuccess method " +  getTestMethodName(iTestResult) + " succeed");
        //Extentreports log operation for passed tests.
        ExtentTestManager.getTest().log(LogStatus.PASS, "Test passed");
    }
 
    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("I am in onTestFailure method " +  getTestMethodName(iTestResult) + " failed");
 
        //Get driver from BaseTest and assign to local driver variable.
        Object testClass = iTestResult.getInstance();
       //driver = webdrivermanager.getDriver();
       
 
        //Take base64Screenshot screenshot.
       File sourcePath= ((TakesScreenshot)context.getWebDriverManager().getDriver()).getScreenshotAs(OutputType.FILE);
 
        //Extentreports log and screenshot operations for failed tests.
       String filename =  new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
        File destinationPath= new File(workingDir+"/ExtentReports/screenshots/"+getTestMethodName(iTestResult)+filename+".png");
        try {
			Files.copy(sourcePath,destinationPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       
       String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)driver).
               getScreenshotAs(OutputType.BASE64);

       //Extentreports log and screenshot operations for failed tests.
       ExtentTestManager.getTest().log(LogStatus.FAIL,"Test Failed",
               ExtentTestManager.getTest().addBase64ScreenShot(base64Screenshot));
       
    }
 
    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("I am in onTestSkipped method "+  getTestMethodName(iTestResult) + " skipped");
        //Extentreports log operation for skipped tests.
        ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
    }
 
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
    }
	

}
