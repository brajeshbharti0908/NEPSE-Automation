package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OutlookWebMailLoginPage {
	WebDriver driver;

	public OutlookWebMailLoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[contains(@name,'loginfmt')]")
	WebElement emailid;
	
	
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement next;
	
	@FindBy(xpath = "//input[contains(@name,'passwd')]")
	WebElement password;
	
	
	@FindBy(xpath = "//input[contains(@value,'Sign in')]")
	WebElement signIN;
	
	
	@FindBy(xpath = "//input[contains(@type,'checkbox')]")
	WebElement dontShowThisAgainCheckbox;
	
	@FindBy(xpath = "//input[@value='No']")
	WebElement noButton;
	
	@FindBy(xpath = "//input[contains(@value,'Yes')]")
	WebElement yesButton;

}



