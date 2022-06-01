import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");

String ExpectedTitle = "Facebook – log in or sign up";
if(driver.getTitle().equals(ExpectedTitle)) {
	System.out.println("Correct url");
}
else {
	System.out.println("Incoorec url");
}
//List<WebElement> creatAccout =
//driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
driver.findElement(By.cssSelector("._6ltg>a")).click();
//driver.findElement(By.cl)

List<WebElement> Birthdate = driver.findElements(By.cssSelector("._5k_4>span>select"));
System.out.println("Elements on Birthdate : " +Birthdate.size());
for(int i = 0;i<Birthdate.size();i++) {
	System.out.println(i+ "Element : " +Birthdate.get(i).getText());
	System.out.println(Birthdate.get(i).isDisplayed());
	System.out.println(Birthdate.get(i).isEnabled());
}

WebElement dropdown = driver.findElement(By.id("day"));
Select html = new Select(dropdown);
System.out.println("Is Multiselect ? " +html.isMultiple());

List<WebElement> Count = html.getOptions();
System.out.println("Total count : " +Count.size());
for (int i=0;i<Count.size();i++) {
	System.out.println(i+ "Element Name : " +Count.get(i).getText());
	
}
System.out.println("Default value : " +html.getFirstSelectedOption().getText());
html.selectByIndex(0);

	}

}
