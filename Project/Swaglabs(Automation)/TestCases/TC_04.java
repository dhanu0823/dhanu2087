package TestCases; // package declaration for TestCases
import static org.testng.Assert.assertTrue;
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
import pageobjects.Productcatologpageobj;
//class declaration for TC_04
public class TC_04 {	
	// Test method annotated with @ Test and data provider
	// The "signing" data provider is located in the Dataprovider01 class
 @Test (dataProvider = "signing",dataProviderClass = Dataprovider01.class )
//Throws an InterruptedException to handle any interruptions during  the execution of the method
public void Productcatolog1(String username, String password) throws InterruptedException {
	 // Setting system property for Chrome driver executable location
 System.setProperty("webdriver.chrome.driver","C:\\Users\\nanaboina.dhanush\\Downloads\\"
 		+ "chromedriver_win32\\chromedriver.exe");
//Creating an instance of ChromeDriver
 WebDriver driver=new ChromeDriver();
//Opening the website
driver.get("https://www.saucedemo.com");
//maximizing the browser window
driver.manage().window().maximize();
//printing the title of the page
 System.out.println("Title is:"+driver.getTitle());
//Setting implicit wait
driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
//Entering username
driver.findElement(By.id("user-name")).sendKeys(username);
//Pausing execution for 2 seconds
Thread.sleep(2000);
//Entering password
driver.findElement(By.id("password")).sendKeys(password);
//Pausing execution for 2 seconds
Thread.sleep(2000);
//Clicking the login button
driver.findElement(By.id("login-button")).click(); 
//Pausing execution for 2 seconds
Thread.sleep(2000);
// This line creates an instance of the Productcatologpageobj class with the provided driver.
Productcatologpageobj obj = new Productcatologpageobj(driver);
// This line invokes the clickproduct_sort_container method of the created object.
obj.clickproduct_sort_container();
//Pausing execution for 2 seconds
Thread.sleep(2000);
// invokes the clickoption1() method on the object "obj".
obj.clickoption1();
//Pausing execution for 2 seconds
Thread.sleep(2000);
//Get the title of the page
String title = driver.getTitle();
//Create an instance of the ExtentReports class
	ExtentReports extent=new ExtentReports();
	// Create an instance of ExtentHtmlReporter to specify the report file location
	ExtentHtmlReporter spark=new ExtentHtmlReporter("C:\\Users\\nanaboina.dhanush\\"
	+ "eclipse-workspace1\\SwaglabsAuto\\report1.html");
	// Attach the html report to the ExtentReports instance
	extent.attachReporter(spark);
	// Create a test for verifying the module
	ExtentTest test=extent.createTest("Verify the product catalog module");
	// Check if the title of the page matches "Swag Labs"
	if(title.equals("Swag Labs")) {
		// if title matches, log the success message
	test.pass("productcatalog Name A to Z");	}
	// if title does not match, log the failure message
	else	{ test.fail("process failed");			}
	// Flush the results of the test to the report
	extent.flush();
	// Closes the current window or tab in the web browser
  driver.close();	}   }

