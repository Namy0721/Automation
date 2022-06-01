import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumUtility.SeleniumUtility;

public class Vtiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SeleniumUtility s4 = new SeleniumUtility();
WebDriver driver = s4.setUp("chrome","https://demo.vtiger.com/vtigercrm/index.php");
	
WebElement Signin = driver.findElement(By.cssSelector(".button.buttonBlue"));
String Background = Signin.getCssValue("background-image");
String color = Signin.getCssValue("color");
String fontSize = Signin.getCssValue("font-size");

System.out.println("Background color : " +Background);
System.out.println("Color : "+color);
System.out.println("fontSize : " +fontSize);

WebElement ForgotPassword = driver.findElement(By.cssSelector("a[class='forgotPasswordLink']"));
String colorfp = ForgotPassword.getCssValue("color");
String Backgroundfp = ForgotPassword.getCssValue("background-color");

System.out.println("Background color : " +Backgroundfp);
System.out.println("Color : "+colorfp);

WebElement UserName = driver.findElement(By.id("username"));
Point Location = UserName.getLocation();
int UserName_X = Location.getX();
System.out.println("UserName x : " +UserName_X);
int UserName_Y = Location.getY();
System.out.println("UserName y : " +UserName_Y);

WebElement Password = driver.findElement(By.id("password"));
Point Location0 = Password.getLocation();
int Password_X = Location0.getX();
int Password_Y = Location0.getY();

System.out.println("Password x : " + Password_X);
System.out.println("Password x : " + Password_Y);
System.out.println("Password is below Username : " +(UserName_Y< Password_Y));
	}

}
