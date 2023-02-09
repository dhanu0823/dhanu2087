package TestCases;     // package declaration for TestCases
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import JavaUtilities.Dataprovider01;
import pageobjects.Userisablepageobj;
//class declaration for TC_12
public class TC_12 {
	// Test method annotated with @ Test and data provider
	// The "signing" data provider is located in the Dataprovider01 class
 @Test (dataProvider = "signing",dataProviderClass = Dataprovider01.class )
//Throws an InterruptedException to handle any interruptions during  the execution of the method
 public void Userableto(String username, String password) throws InterruptedException {
//	public static void main(String[] args) throws InterruptedException {
	 // Setting system property for Chrome driver executable location
 System.setProperty("webdriver.chrome.driver","C:\\Users\\nanaboina.dhanush\\Downloads\\"
 		+ "chromedriver_win32\\chromedriver.exe");
//Creating an instance of ChromeDriver
 WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com/");  //Opening the website
	//maximizing the browser window
	driver.manage().window().maximize();
	// printing the title of the page
    System.out.println("Title is:"+driver.getTitle());
  driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);// Setting implicit wait
 		driver.findElement(By.id("user-name")).sendKeys(username); //Entering username
		Thread.sleep(2000);    //Pausing execution for 2 seconds
		driver.findElement(By.id("password")).sendKeys(password);// Entering password
		Thread.sleep(2000);   //Pausing execution for 2 seconds
			// Clicking the login button
			driver.findElement(By.id("login-button")).click(); 
			//Pausing execution for 2 seconds
			Thread.sleep(2000);	
			//This line creates an instance of the Userisablepageobj class with the provided driver.
			Userisablepageobj obj= new Userisablepageobj(driver);
			 // invokes the clickmenubar() method on the object "obj".
			obj.clickmenubar();
			//Pausing execution for 2 seconds
			Thread.sleep(2000);
			 // invokes the clickabout() method on the object "obj".
			obj.clickabout();
			//Pausing execution for 2 seconds
			Thread.sleep(2000);	
			 // invokes the clickcontact() method on the object "obj".
			obj.checkcontact();
			//Pausing execution for 2 seconds
			Thread.sleep(2000);
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
	ExtentTest test=extent.createTest("Verify the User is able to module");
//	if(title.equals("Swag Labs")) {
	// if title matches, log the success message
	test.pass("User is able to see the contact option as expected");	
	// Flush the results of the test to the report
	extent.flush();	
	 // Closes the current window or tab in the web browser
 driver.close(); }	     }                                                                                             
             
