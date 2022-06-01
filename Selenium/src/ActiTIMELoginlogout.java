import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIMELoginlogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");

String ExpectedTitle = "actiTIME - Login";
String ActualTitle = driver.getTitle();

if (ActualTitle.equals(ExpectedTitle)) {
	System.out.println("login page opened");
}
else {
	System.out.println("Login page not opened or title got changed");

}
WebElement UserName = driver.findElement(By.id("username"));
UserName.sendKeys("admin123");
UserName.clear();
UserName.sendKeys("admin");

WebElement Password = driver.findElement(By.name("pwd"));
Password.sendKeys("manager");

WebElement LoginButton = driver.findElement(By.id("loginButton"));
LoginButton.click();

WebElement 	Logout = driver.findElement(By.linkText("Logout"));
Logout.click();
driver.close();

	}

}
