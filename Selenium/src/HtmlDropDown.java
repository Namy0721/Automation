import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("http://demo.automationtesting.in/Register.html");

WebElement Dropdown = driver.findElement(By.id("Skills"));
Select html = new Select(Dropdown);

System.out.println("Dropdown is multiselect : " +html.isMultiple());
System.out.println("Default or already selected element : " +html.getFirstSelectedOption().getTagName());

//List<WebElement> Skills = driver.findElements(By.cssSelector(".form-control.ng-pristine.ng-valid.ng-touched>option"));
//System.out.println("Total number of skills : " +Skills.size());
//for(int i =0;i<Skills.size();i++) {
//	System.out.println("Skill " +i+ ": " +Skills.get(i).getText());
List<WebElement> Skills = html.getOptions();
System.out.println("Total number of skills : " +Skills.size());
for(int i=0;i<Skills.size();i++) {
	System.out.println("Skill : " +i+ ": " +Skills.get(i).getText());

}
html.selectByIndex(4);
html.selectByValue("APIs");
html.selectByVisibleText("C");

}
	}


