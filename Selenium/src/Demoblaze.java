import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty ("user.dir")+ "\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://demoblaze.com/");

List<WebElement> list = driver.findElements(By.cssSelector(".list-group>a"));
System.out.println("Size of Elements : " +list.size());

List<String> l1 = new ArrayList<String>();
l1.add("CATEGORIES");
l1.add("Phones");
l1.add("Laptops");
l1.add("Monitors");

for(int i=0;i<list.size();i++) {
	WebElement element = list.get(i);
	System.out.println("**********Element name: " +element.getText() + "************");
	System.out.println(element.isDisplayed());
	System.out.println(element.isEnabled());
	System.out.println(element.getText().equals(l1.get(i)));
	
	
	
}
driver.navigate().back();
	}

}
