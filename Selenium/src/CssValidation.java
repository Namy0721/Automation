import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumUtility.SeleniumUtility;

public class CssValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s4 = new SeleniumUtility();
WebDriver path = s4.setUp("Chrome","https://demo.vtiger.com/vtigercrm/index.php");
path.manage().window().maximize();
path.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

WebElement Signin = path.findElement(By.cssSelector(".button.buttonBlue"));
String Signinbutton = Signin.getCssValue("color");
String 	Fontsize = Signin.getCssValue("font-size");
String Background = Signin.getCssValue("background-image");
System.out.println("Signintext color : " +Signinbutton);
System.out.println("FontSize : " +Fontsize);
System.out.println("Background : " +Background);

path.findElement(By.cssSelector(".forgotPasswordLink")).getCssValue("color");

WebElement Username = path.findElement(By.id("username"));
Point location = Username.getLocation();
int coordinates = location.getX();
int coordinates1 = location.getY();

System.out.println("Username x value : "+coordinates+ " Username y value : " +coordinates1);
 WebElement Password = path.findElement(By.id("password"));
 Point pwd = Password.getLocation();
 int pwd1 = pwd.getX();
 int pwd2 = pwd.getY();
 
 System.out.println(" Password x value : " +pwd1+ " Password y value : " +pwd2);
 System.out.println(" Password is below username : " +(coordinates1<pwd2));
		 
	}

}
