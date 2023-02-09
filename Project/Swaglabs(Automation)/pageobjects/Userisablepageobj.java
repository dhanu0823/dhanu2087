package pageobjects; // package declaration for pageobjects
//Importing the required packages
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Userisablepageobj {
	// WebDriver object  to perform actions on the web page
public WebDriver driver;
	// Locators for the web elements
 By menubar = By.id("react-burger-menu-btn");
 By about = By.id("about_sidebar_link");
 By contact = By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[1]/ul[1]/li[6]/div[1]/div");
 // Constructor to initialize the driver
public Userisablepageobj (WebDriver driver) {
 this.driver = driver;                            }
// method to click on the menu bar element
public void clickmenubar()                  {
	Assert.assertTrue(driver.findElement(menubar).isDisplayed(), "\" menubar\" menubar is displayed");
 driver.findElement (menubar).click();            }
// method to click the about element
public void clickabout()                    {
	Assert.assertTrue(driver.findElement(about).isDisplayed(), "\" about\" about is displayed");
 driver.findElement (about).click();              }
// method to check the contact element by moving the mouse pointer over it
public void  checkcontact()                 {	
	Assert.assertTrue(driver.findElement(contact).isDisplayed(), "\" contact\" contact is displayed");
	driver.findElement(contact).isDisplayed();
}      }


