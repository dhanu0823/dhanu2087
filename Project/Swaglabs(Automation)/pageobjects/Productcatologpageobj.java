package pageobjects; // package declaration for pageobjects
// imported the required statement
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class Productcatologpageobj {
public WebDriver driver;
// Declering WebDriver instance vairable
  By product_sort_container = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
  By option1 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[1]");
  By option2 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[2]");
  By option3 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[3]");
  By option4 = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select/option[4]"); 
  // Xpath locators for sorting options
  // constructor to initialize the WebDriver instance variable 
	public Productcatologpageobj (WebDriver driver) {
	this.driver = driver;
	}
	// method to click on the product sort container
	public void clickproduct_sort_container() {
Assert.assertTrue(driver.findElement(product_sort_container).isDisplayed(),
		"\" product_sort_container\" container is displayed");
		driver.findElement (product_sort_container).click();
	    }	
	// method to click on option 1
	public void clickoption1() {
		Assert.assertTrue(driver.findElement(option1).isDisplayed(), "\" option1\" option1 is displayed");
		driver.findElement (option1).click();
	    }
	// method to click on option 2
	public void clickoption2() {
		Assert.assertTrue(driver.findElement(option2).isDisplayed(), "\" option2\" option2 is displayed");
		driver.findElement (option2).click();
	    }
	// method to click on option 3
	public void clickoption3() {
		Assert.assertTrue(driver.findElement(option3).isDisplayed(), "\" option3\" option3 is displayed");
		driver.findElement (option3).click();
	    }
	// method to click on option 4
	public void clickoption4() {
		Assert.assertTrue(driver.findElement(option4).isDisplayed(), "\" option4\" option4 is displayed");
		driver.findElement (option4).click();
	    }	
}

