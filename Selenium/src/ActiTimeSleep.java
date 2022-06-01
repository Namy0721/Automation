import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeSleep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://demo.actitime.com/login.do");

String ExpectedTitle = "actiTIME - Login";
String ActualTitle = driver.getTitle();


if(ActualTitle.equals(ExpectedTitle)){
	System.out.println("Login page opened successfuly");
	
}
else { 
	System.out.println("Title changed or not on login page");
	
}
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();

Thread.sleep(2000);



String ExpectedHome = "actiTIME - Enter Time-Track";
String ActualHome = driver.getTitle();
System.out.println("Actual Home Title : " +ActualHome);

if (ActualHome.equals(ExpectedHome)) {
	System.out.println("Welcome to home page");
	
}
else {
	System.out.println("Not in home page or title changed");
}

	driver.findElement(By.id("logoutLink")).click();
	driver.close();
}

	}



