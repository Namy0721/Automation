import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method s
String path = System.getProperty("user.dir")+ "\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://www.flipkart.com/");


driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
String Expectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
System.out.println("Actula title : " +driver.getTitle());

if (driver.getTitle().equals(Expectedtitle)) {
	System.out.println("Correct page is open");
}
else {
	System.out.println("Title of the page has changed or url is incorrect");
	
}
List<WebElement> menu = driver.findElements(By.cssSelector("div._37M3Pb>*"));
System.out.println("Main menu option count : " +menu.size());
//List<WebElement> close = driver.findElements(By.cssSelector("._2QfC02>*:first-child"));
//((WebElement) close).click();

List<String> menulist = new ArrayList<String>();
menulist.add("Top Offer");
menulist.add("Grocery");
menulist.add("Mobiles");
menulist.add("Fashion");
menulist.add("Electronics");
menulist.add("Home");
menulist.add("Appliances");
menulist.add("Travel");
menulist.add("Travel");
menulist.add("Beauty,Toys & More");

for (int i =0;i<menu.size();i++) {
WebElement name = menu.get(i);
System.out.println("Element name : " +name.getText());
System.out.println("Is Displayed : " +name.isDisplayed());
System.out.println("Is Enabled : "+name.isEnabled());

System.out.println("If Equals : "+name.getText().equals(menulist.get(i)));

	}
driver.manage().window();
}
}