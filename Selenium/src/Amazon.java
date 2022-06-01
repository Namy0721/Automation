import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path =  System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver.get("https://www.amazon.in/");
		
//driver.findElement(By.cssSelector("div#nav-xshop>*:nth-of-type(2)")).click();
//
//driver.navigate().back();

List<WebElement> alloptions = driver.findElements(By.cssSelector("#nav-xshop>a"));
System.out.println("Total number of elements : " +alloptions.size());

for(int i=0;i<alloptions.size();i++) {
	
	WebElement option =alloptions.get(i);
	String name = option.getText();
	System.out.println("Name of element : " +name);
	
	if (name.equals("New Releases")) {
		option.click();
		break;
	}
	else {
		System.out.println("Not matched");
	}
}
driver.navigate().back();
	}

}
