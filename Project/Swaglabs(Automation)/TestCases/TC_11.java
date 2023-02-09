package TestCases;      // package declaration for TestCases
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import JavaUtilities.Dataprovider01;
import pageobjects.Purchasepageobj;
//class declaration for TC_11
public class TC_11 {
	// Test method annotated with @ Test and data provider
	// The "purchase1" data provider is located in the Dataprovider01 class
	@Test (dataProvider = "purchase1",dataProviderClass = Dataprovider01.class )
// This method performs the process of purchasing items with given user name, password, first name, last name, postal code.
//Throws an InterruptedException to handle any interruptions during  the execution of the method
	public void purchase2(String username, String password, String firstname, 
	String lastname, String postalcode) throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {
		 // Setting system property for Chrome driver executable location
 System.setProperty("webdriver.chrome.driver","C:\\Users\\nanaboina.dhanush\\Downloads"
 		+ "\\chromedriver_win32\\chromedriver.exe");
//Creating an instance of ChromeDriver
	WebDriver driver=new ChromeDriver();
	// Opening the website
	      driver.get("https://www.saucedemo.com/");
	    //maximizing the browser window
	      driver.manage().window().maximize();
	   // printing the title of the page
	      System.out.println("Title is:"+driver.getTitle());
	   // Setting implicit wait
		  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		//Entering username
		  driver.findElement(By.id("user-name")).sendKeys(username);
		//Pausing execution for 2 seconds
		  Thread.sleep(2000);
		// Entering password
		  driver.findElement(By.id("password")).sendKeys(password);
		//Pausing execution for 2 seconds
			Thread.sleep(2000);
			// Clicking the login button
		  driver.findElement(By.id("login-button")).click(); 
		//Pausing execution for 2 seconds
			Thread.sleep(2000);
			//This line creates an instance of the Purchasepageobj class with the provided driver.
			Purchasepageobj obj = new Purchasepageobj(driver);
			// invokes the clickItem() method on the object "obj".
		       obj.clickItem();
		     //Pausing execution for 2 seconds
		       Thread.sleep(2000);
				// invokes the clickAddtocart() method on the object "obj".
		       obj.clickAddtocart();
		     //Pausing execution for 2 seconds
		       Thread.sleep(2000);
				// invokes the clickContainer() method on the object "obj".
		       obj.clickContainer();
		     //Pausing execution for 2 seconds
		       Thread.sleep(2000);
				// invokes the clickCheckout() method on the object "obj".
		       obj.clickCheckout();
		     //Pausing execution for 2 seconds
		       Thread.sleep(2000);
				// invokes the setTextInfirstname() method on the object "obj".
		       obj.setTextInfirstname(firstname);
		     //Pausing execution for 2 seconds
		       Thread.sleep(2000);
		    // invokes the setTextInlastname() method on the object "obj".
		       obj.setTextInlastname(lastname);
/*Pausing execution for 2 seconds*/ Thread.sleep(2000);
		    // invokes the setTextInpostalcode() method on the object "obj".
		       obj.setTextInpostalcode(postalcode);
		       Thread.sleep(2000); //Pausing execution for 2 seconds     
		    // invokes the clickContinuebutton() method on the object "obj".
		       obj.clickContinuebutton();
		       Thread.sleep(2000); //Pausing execution for 2 seconds  
		       // invokes the clickfinish() method on the object "obj".
		       obj.clickfinish();
		       Thread.sleep(2000);  //Pausing execution for 2 seconds 	      
		       // invokes the clickBacktoproducts1() method on the object "obj".
             obj.clickBacktoproducts1();
             Thread.sleep(2000);  //Pausing execution for 2 seconds	     
		    // causes the test case to fail and gives a message
	  Assert.fail("System should not accept invalid checkout information");
	// Get the title of the page
		 String title = driver.getTitle();
		// Create an instance of the ExtentReports class
    ExtentReports extent=new ExtentReports();
 // Create an instance of ExtentHtmlReporter to specify the report file location
	ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\nanaboina.dhanush\\eclipse-workspace1\\"
			+ "SwaglabsAuto\\report1.html");
	// Attach the html report to the ExtentReports instance
		extent.attachReporter(spark);
		// Create a test for verifying the module
	    ExtentTest test=extent.createTest("Verify the purchase module");
	  if(title.equals("Swag Labs")) {    // Check if the title of the page matches "Swag Labs"
	    	// if title matches, log the success message
		test.pass("Invalid Checkout info is given "); 		  		}
	 // if title does not match, log the failure message
		else {     test.fail("Valid Checkout info");}	   			  					  		
	 // Flush the results of the test to the report
			  	extent.flush();
			  	   driver.close();      }}// Closes the current window or tab in the web browser                      	
