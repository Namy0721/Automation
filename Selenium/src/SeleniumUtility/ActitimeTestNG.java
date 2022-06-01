package SeleniumUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeTestNG {
  @Test(enabled=true,description="Open Url")
  public void Browser() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  
 driver.get("https://demo.actitime.com/login.do");
	  Assert.assertEquals(driver.getTitle(), "actiTIME - Login","Either not in login page or title changed");

	  WebElement Username1 = driver.findElement(By.cssSelector("input[placeholder='Username']"));
	  Username1.sendKeys("admin");
	  Assert.assertTrue(Username1.isDisplayed(),"Visible");
	  Assert.assertTrue(Username1.isEnabled(),"Enabled");
//	  Assert.assertTrue(Username1.isSelected(),"Selected");
	  Assert.assertEquals(Username1.getAttribute("placeholder"),"Username","Username placeholder has changed");
	  
	  WebElement Password =driver.findElement(By.cssSelector(".textField.pwdfield"));
	  Password.click();
	  Password.sendKeys("manager");
	  Assert.assertTrue(Password.isDisplayed());
	  Assert.assertTrue(Password.isEnabled());
	  Assert.assertEquals(Password.getAttribute("class"),"textField pwdfield");
	  
	  WebElement checkbox = driver.findElement(By.cssSelector("#keepLoggedInCheckBox"));
	Assert.assertFalse(checkbox.isSelected());
	
	
	  
  }

}
