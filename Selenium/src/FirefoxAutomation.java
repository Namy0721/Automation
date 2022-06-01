import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver", path);
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://demosite.executeautomation.com/Login.html");

System.out.println("Title of page : " +driver.getTitle());
System.out.println("Length of page :  " +driver.getTitle().length());
System.out.println("URL OF THE PAGE : " +driver.getCurrentUrl());

String ExpectedUrl = "https://demosite.executeautomation.com/Login.html";
String ActualUrl = driver.getCurrentUrl();

if (ActualUrl.equals(ExpectedUrl)) {
	System.out.println("Correct page");
}
else {
	System.out.println("Incorrect or URL changed");
}

driver.findElement(By.id("userName")).sendKeys("execution");
driver.findElement(By.name("Password")).sendKeys("admin");
driver.findElement(By.id("Login")).click();

Thread.sleep(2000);

System.out.println("current title : " +driver.getTitle());
System.out.println("Current Url : " +driver.getCurrentUrl());
driver.close();
	}

}
