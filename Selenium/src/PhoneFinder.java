import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);

WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://www.gsmarena.com/");
String ExpectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";

if (driver.getTitle().equals(ExpectedTitle)) {
	System.out.println("Correct url");
	
}
else {
	System.out.println("Incorrect");
}
List<WebElement> Phonefinder = driver.findElements(By.cssSelector(".brandmenu-v2>ul>li a"));
System.out.println("Total number of phones : " +Phonefinder.size());

for(int i = 0; i<Phonefinder.size();i++) {
		WebElement name = Phonefinder.get(i);
		System.out.println("name : " +name.getText());
}

	}

}
