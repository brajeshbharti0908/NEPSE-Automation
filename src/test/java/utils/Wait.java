package utils;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import managers.FileReaderManager;

public class Wait {
	protected WebDriver driver;

	public Wait(final WebDriver driver) {

		this.driver = driver;
	}

	private static final int ELEMENT_WAIT_TIMEOUT_IN_SECONDS = 10;

	private static final int PAGE_WAIT_TIMEOUT_IN_SECONDS = 60;

	public void untilJqueryIsDone(WebDriver driver) {
		untilJqueryIsDone(driver, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());

	}

	public void untilJqueryIsDone(WebDriver driver, Long timeoutInSeconds) {

		until(driver, (d) -> {

			Boolean isJqueryCallDone = (Boolean) ((JavascriptExecutor) driver).executeScript("return jQuery.active==0");
			if (!isJqueryCallDone)
				System.out.println("Jquery call is in progress");
			return isJqueryCallDone;
		}, timeoutInSeconds);

	}

	public void untilPageLoadComplete(WebDriver driver) {

		untilPageLoadComplete(driver, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());

	}

	public void untilPageLoadComplete(WebDriver driver, Long timeOutSeconds) {

		until(driver, (d) -> {
			Boolean isPageLoaded = (Boolean) ((JavascriptExecutor) driver).executeScript("return document.readyState")
					.equals("complete");
			if (!isPageLoaded)
				System.out.println("Document is loading");
			return isPageLoaded;

		}, timeOutSeconds);

	}

	public void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition) {

		until(driver, waitCondition, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());

	}

	private void until(WebDriver driver, Function<WebDriver, Boolean> waitCondition, Long timeoutInSeconds) {

		WebDriverWait webdriverwait = new WebDriverWait(driver, timeoutInSeconds);
		webdriverwait.withTimeout(timeoutInSeconds, TimeUnit.SECONDS);
		try {
			webdriverwait.until(waitCondition);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

	public void waitForElement(WebElement element) {
		waitForElement(element, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());
	}

	public void waitForElement(WebElement element, Long timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitForTextToAppear(final String textToAppear, final WebElement element) {
		final WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
		wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
		
	}

	public void waitForUrlPart(final String urlPart) {
		final WebDriverWait wait = new WebDriverWait(this.driver, ELEMENT_WAIT_TIMEOUT_IN_SECONDS);
		wait.until(ExpectedConditions.urlContains(urlPart));
	}
	
	
	
	public void waitUntilElementIsClickable(WebElement element) {
		
		waitUntilElementIsClickable(element, FileReaderManager.getInstance().getConfigFileReader().getImplicitlyWait());
		
	}
	
	public void waitUntilElementIsClickable(WebElement element,Long timeoutInSeconds)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	
	

}
