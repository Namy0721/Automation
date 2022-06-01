import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");

String ExpctedTitle = "actiTIME - Login";
String ActualTitle = driver.getTitle();

if (ActualTitle.equals(ExpctedTitle)) {
	System.out.println("Login page opened sucessfuly");
	
}
else {
	System.out.println("Title changed or not in login page");
}
driver.findElement(By.id("username")).sendKeys("admin");

driver.findElement(By.name("pwd")).sendKeys("manager");

WebElement LoginButton = driver.findElement(By.id("loginButton"));
LoginButton.click();
WebElement logoutButton = driver.findElement(By.id("logoutLink"));

WebDriverWait wait = new WebDriverWait(driver,20);
wait.until(ExpectedConditions.elementToBeClickable(logoutButton));


String ExpectedHomeTitle = "actiTIME - Enter Time-Track";
String ActualHomeTitle = driver.getTitle();
System.out.println("Actual HomeTitle : " +ActualHomeTitle);


if (ActualHomeTitle.equalsIgnoreCase(ExpectedHomeTitle)) {
	System.out.println("Home page opened successfuly");
}
else {
	System.out.println("Home page title changed or not in home page");
}

driver.findElement(By.id("logoutLink"));
logoutButton.click();
driver.close();

	}

}
