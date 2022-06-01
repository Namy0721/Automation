import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String drivepath = System.getProperty("user.dir")+ "\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", drivepath);
WebDriver instance = new ChromeDriver();

instance.manage().window().maximize();

instance.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

instance.get("https://opensource-demo.orangehrmlive.com/");

String cred = instance.findElement(By.tagName("span")).getText();
System.out.println(cred);

//String cred2 = cred.replace("( Username :", " ");
//String cred3 = cred.replace(" | Password :", " ");
//String cred4 = cred.replace(")", " ");
//System.out.println(cred);

//String[] loginDetails = cred.split(" ");
//instance.findElement(By.id("txtUsername")).sendKeys(loginDetails[0]);
//instance.findElement(By.id("txtPassword")).sendKeys(loginDetails[1]);
//instance.findElement(By.id("btnLogin")).click();

String[] loginDetails = cred.split(" ");
System.out.println(loginDetails);

instance.findElement(By.id("txtUsername")).sendKeys(loginDetails[3]);
instance.findElement(By.id("txtPassword")).sendKeys(loginDetails[7]);
instance.findElement(By.id("btnLogin")).click();



	}

}
