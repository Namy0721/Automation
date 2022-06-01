import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VtigerExpicitImplict {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String path = System.getProperty ("user.dir")+ "\\Executable\\chromedriver.exe";
       System.setProperty("webdriver.chrome.driver", path);
        
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       driver.get("https://demo.vtiger.com/vtigercrm/index.php");
       
      // driver.findElement(By.id("username")).sendKeys("admin");
      // driver.findElement(By.id("password")).sendKeys("Test@123");
       driver.findElement(By.cssSelector(".button.buttonBlue")).click();
       driver.findElement(By.cssSelector(".userName.dropdown-toggle.pull-right")).click();
      
       WebElement signout = driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT"));
       WebDriverWait wait = new WebDriverWait(driver,20);
       wait.until(ExpectedConditions.elementToBeClickable(signout));
       
       String HomeTitle = driver.getTitle();
       String Expected = "Dashboard";
       
       if(HomeTitle.equalsIgnoreCase(Expected)) {
    	   System.out.println("We are on the dashbord");
       }
       else {
    	   System.out.println("Title changed or not on dashboard");
    	   
       }
       signout.click();
       
      // WebElement loging 
       String Actual = driver.getTitle();
       System.out.println (Actual);
       String Expected1 = "vtiger";
       
       if(Actual.equalsIgnoreCase(Expected1)){
    	   System.out.println("Logout done");
       }
       else {
    	   System.out.println("Not on the login page");
       }
       
       
       
       

	} 
}
