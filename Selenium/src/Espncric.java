import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Espncric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String Path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",Path);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://www.espncricinfo.com/");

String ExpectedTitle = "";
if(driver.getTitle().equals(ExpectedTitle)) {
	System.out.println("Correct title");
}
else {
	System.out.println("Incorrect title");
}
List<WebElement> Espn = driver.findElements(By.cssSelector(".ds-flex.ds-items-center.ds-justify-between.ds-flex-1>div>div"));

System.out.println("Size : " +Espn.size());

for(int i = 0; i<Espn.size();i++) {
	WebElement name = Espn.get(i);
	System.out.println("Name : " +name.getText());
	System.out.println(name.isDisplayed());
	System.out.println(name.isEnabled());
}



	}

}
