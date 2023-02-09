package pageobjects;  // Package declaration for the page objects package
// Import statement for Selenium libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
// Class definition for the Signing page Object
public class Signingpageobj {
// WebDriver instance variable to store the driver instance
	public WebDriver driver;
// By variables to store the locators for the user name, password, and login button	
	 By username = By.id("user-name");
	    By password = By.id("password");
	    By loginbutton = By.id("login-button");
	
	 // Constructor to initialize the driver instance
	public Signingpageobj  (WebDriver driver) {
	this.driver = driver;
	}
	// Method to enter username
	public void enterUsername(String standard_user) {
		Assert.assertTrue(driver.findElement(username).isDisplayed(), "\" Text\" Text is displayed");
		driver.findElement (username).sendKeys(standard_user);
	    }
	// Method to enter password
	public void enterPassword(String Text) {
		Assert.assertTrue(driver.findElement(password).isDisplayed(), "\" Text\" Text is displayed");
		driver.findElement (password).sendKeys(Text);
	    }
	// clickloginbutton method to click on the login button
	public void clickloginbutton() {
	Assert.assertTrue(driver.findElement(loginbutton).isDisplayed(), "\" loginbutton\" Button is displayed");
	driver.findElement (loginbutton).click();
		}
}


