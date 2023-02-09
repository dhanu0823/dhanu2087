package pageobjects; // package declaration for pageobjects
// Importing the required packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class Purchasepageobj { 
	//WebDriver instance
 public WebDriver driver;
 // Locators for the elements on the purchase page
 By username = By.id("user-name");
 By password = By.id("password");
 By loginbutton = By.id("login-button");
 By item = By.xpath("//*[@id=\"item_4_img_link\"]/img");		
 By addtocart= By.id("add-to-cart-sauce-labs-backpack");
 By container= By.xpath("//*[@id=\"shopping_cart_container\"]/a");
 By checkout = By.id("checkout");
 By firstname = By.id("first-name");
 By lastname = By.id("last-name");
 By postalcode = By.id("postal-code");
 By continuebutton = By.id("continue");
 By finish = By.id("finish");
 By backtoproducts1 = By.id("back-to-products");
 // Constructor to initialize the driver instance
public Purchasepageobj(WebDriver driver) {
 this.driver = driver;                                           }
// Method to enter username
    public void enterUsername(String standard_user){
    	Assert.assertTrue(driver.findElement(username).isDisplayed(), "\" Text\" Text is displayed");
   	driver.findElement (username).sendKeys(standard_user); }	
    // method to enter password
	public void enterPassword(String Text)     {
		Assert.assertTrue(driver.findElement(password).isDisplayed(), "\" Text\" Text is displayed");
	driver.findElement (password).sendKeys(Text);		   }
	// method to click the login button
	public void clickloginbutton()             {
		Assert.assertTrue(driver.findElement(loginbutton).isDisplayed(), "\" loginbutton\" Button is displayed");
	driver.findElement (loginbutton).click();			   }
	// method to click the item 
    public void clickItem()                    {
    	Assert.assertTrue(driver.findElement(item).isDisplayed(), "\" loginbutton\" item is displayed");
   	driver.findElement (item).click(); 	    	           }    	
    // method to click the add to cart button
	public void clickAddtocart()               {
		Assert.assertTrue(driver.findElement(addtocart).isDisplayed(), "\" addtocart\" Button is displayed");
	driver.findElement (addtocart).click();			       }	
	// method to click the container
	public void clickContainer()               {
		Assert.assertTrue(driver.findElement(container).isDisplayed(), "\" Container\" container is displayed");
	driver.findElement (container).click();		           }
	// method to click the checkout button
	public void clickCheckout()                {
		Assert.assertTrue(driver.findElement(checkout).isDisplayed(), "\" Checkout\" Button is displayed");
	driver.findElement(checkout).click();		           }
	// setTextInfirstname method to set text in the first name field
	public void setTextInfirstname(String Text){
		Assert.assertTrue(driver.findElement(firstname).isDisplayed(), "\" Text\" Text is displayed");
	driver.findElement (firstname).sendKeys(Text);  	   }
	// setTextInlastname method to set text last in the name field
	public void setTextInlastname(String Text) {
		Assert.assertTrue(driver.findElement(lastname).isDisplayed(), "\" Text\" Text is displayed");
	driver.findElement (lastname).sendKeys(Text);	       }
	// setTextInpostalcode method to set text in the postal code field
	public void setTextInpostalcode(String Text){
		Assert.assertTrue(driver.findElement(postalcode).isDisplayed(), "\" Text\" Text is displayed");
	driver.findElement (postalcode).sendKeys(Text);		   }
	// clickContinuebutton method to click on the continue button
	public void clickContinuebutton()          {
		Assert.assertTrue(driver.findElement(continuebutton).isDisplayed(), "\" continuebutton\" Button is displayed");
	driver.findElement (continuebutton).click();		   }
	// clickfinish method to click on the finish button
	public void clickfinish()                  {
		Assert.assertTrue(driver.findElement(finish).isDisplayed(), "\" finish\" Button is displayed");
	driver.findElement (finish).click();		           }
	// clickBacktoproducts1 method to click on the back to products button
	public void clickBacktoproducts1()         {
		Assert.assertTrue(driver.findElement(backtoproducts1).isDisplayed(), "\" backtoproducts1\" Button is displayed");
	driver.findElement (backtoproducts1).click();	  }	   }


