import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);

WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://www.gsmarena.com/");
String Expectedtitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";

if(driver.getTitle().equals(Expectedtitle)) {
	System.out.println("Correct url");
	
}
else {
	System.out.println("Incorrect url");
}

List<WebElement> phonefinder = driver.findElements(By.cssSelector(".brandmenu-v2>ul a"));
System.out.println("Total number ofphones : " +phonefinder.size());

for(int i = 0;i<phonefinder.size();i++) {
	
	WebElement phone = phonefinder.get(i);
	System.out.println("*****Name of the phone :  " +phone.getText()+ "******" );

	if (phone.equals("SAMSUNG"));
	phone.click();
	break;
}
	List <WebElement> samsung = driver.findElements(By.cssSelector(".makers>ul>li a"));
	System.out.println("total number of samsung : " +samsung.size());
	
	for (int a = 0; a<samsung.size();a++) {
	WebElement samsungphones = samsung.get(a);
	System.out.println("Name of samsung phone : " +samsungphones.getText());
	
	
	
	
}

	}

}

