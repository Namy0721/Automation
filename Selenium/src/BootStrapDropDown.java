import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootStrapDropDown {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		WebElement dropdown =driver.findElement(By.id("bsd1-button"));
		wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();;
		
		List<WebElement>list = driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println("Total number of Countiries : " +list.size());
		
		for(int i = 0; i<list.size();i++) {
			System.out.println("Country " +i+ ":" +list.get(i).getText());
			
			
		}
		list.get(5).click();
	}

//		String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
//		//step1: set driver executable path by using System.setProperty(String key,String value)
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		//step2: create an instance of Chrome Browser
//		WebDriver driver = new ChromeDriver();
//		//maximize browser
//		driver.manage().window().maximize();
//		//implicit wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
//		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement dropdown=driver.findElement(By.id("bsd1-button"));
//		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
//		//identify dropdown list and click on it
//		dropdown.click();
//		//identify all the options and store them into List<WebElement>
//		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
//		//use size() to get option count
//		System.out.println("option count: "+options.size());
//		//use for loop to print one by one option
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
//		options.get(2).click();
//	}

}

