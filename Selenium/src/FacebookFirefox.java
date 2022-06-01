import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String path1 = System.getProperty("user.dir")+ "\\Executable\\geckodriver.exe";
String path2 = System.getProperty("user.dir")+ "\\Executable\\chromedriver.exe";

openBrowser (path1,"Firefox");
openBrowser(path2,"Chrome");
	}

static void openBrowser(String path,String Browser) throws InterruptedException {
	
	if(Browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		System.out.println("Loging page title : " +driver.getTitle());
		System.out.println("Length of loging page : " +driver.getTitle().length());
		System.out.println("URL : " +driver.getCurrentUrl());
		
		String ExpectedUrl = "https://www.facebook.com/";
		if (driver.getCurrentUrl().equals(ExpectedUrl)) {
			System.out.println("Login page opened");
		}
		else {
			System.out.println("Loginpage Title changed or not opened");
		}
		
		driver.findElement(By.id("email")).sendKeys("Namy0721");
		driver.findElement(By.id("pass")).sendKeys("Maapaa@1001");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(9000);
		
		System.out.println("Title of home page : " +driver.getTitle());
		System.out.println("Length of home page : " +driver.getTitle().length());
		System.out.println("Source code length : " +driver.getPageSource().length());
		System.out.println("url : " +driver.getCurrentUrl());
		
		Thread.sleep(3000);
	
		driver.findElement((By.id("Account"))).click();
		
//	Thread.sleep(2000);
//WebElement LogOut=driver.findElement( By.partialLinkText("qzhwtbm6 knvmm38d"));
//	LogOut.click();
//	
		
		
}
	else if (Browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver",path);
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		//driver.findElement(By.id("nav-al-signin")).click();
		Thread.sleep(4000);
		System.out.println("Url : " +driver.getCurrentUrl());
		driver.findElement(By.id("ap_email")).sendKeys("8055557401");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Maapaa@1001");
		Thread.sleep(3000);
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
	}
		

	}

}
