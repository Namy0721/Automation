import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://omayo.blogspot.com/");
		WebElement multiselect = driver.findElement(By.id("multiselect1"));
		Select html = new Select(multiselect);
		System.out.println("Multi select dropdown? : " +html.isMultiple());
		
		List<WebElement> Car = html.getOptions();
		System.out.println("Total number of cars : " +Car.size());
		for(int i=0;i<Car.size();i++) {
			System.out.println(i+" Name of car: "+Car.get(i).getText());
		}
		html.selectByIndex(3);
		html.selectByValue("Hyundaix"); 
		html.selectByVisibleText("Swift");
		
		List<WebElement> ALLcar = html.getAllSelectedOptions();
		System.out.println("Total number of car selected : " +ALLcar.size());
		
		html.deselectByIndex(3);
		html.deselectByValue("Hyundaix");
		html.deselectByVisibleText("Swift");
		html.deselectAll();
		

	}

}
