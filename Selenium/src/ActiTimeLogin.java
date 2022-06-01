import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();

driver.get("https://demo.actitime.com/login.do");
String expectedTitle = "actiTIME - Login";
String actualTitle = driver.getTitle();

if (actualTitle.equals(expectedTitle)) {
	System.out.println("Login page opened sucessfully");
	
}
else { System.out.println("login page not opened or title change");

}

WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("admin");

WebElement password = driver.findElement(By.name("pwd"));
password.sendKeys("manager");

WebElement loginButton = driver.findElement(By.id("loginButton"));
loginButton.click();

//driver.close();
	}

}
