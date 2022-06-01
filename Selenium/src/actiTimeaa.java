import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
 
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
System.out.println("Title of login Page : " +driver.getTitle());
System.out.println("Length of title : " +driver.getPageSource().length());
System.out.println("URL : " +driver.getCurrentUrl());

String ExpectedUrl = "https://demo.actitime.com/login.do";
String ActualUrl = driver.getCurrentUrl();

if(ActualUrl.equals(ExpectedUrl)) {
	System.out.println("Correct page opened");
}
else {
	System.out.println("Incorrect page or url not matched");
}
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();

Thread.sleep(2000);


System.out.println("Title of home page : " +driver.getTitle());
driver.close();
	}

}
