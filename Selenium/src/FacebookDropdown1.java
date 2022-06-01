import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookDropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com/");

//Validtion of home page, by title.
String AcutalTitle = driver.getTitle();
String ExpectedTitle = "Facebook – log in or sign up";
if(AcutalTitle.equals(ExpectedTitle)) {
	System.out.println("we are in the home page");
}
else {
	System.out.println("Home page title changed or not in home page");
}
//Create Account to be clicked.
driver.findElement(By.cssSelector("._42ft._4jy0._6lti")).click();

//Explicit wait for DOB
WebElement DOB = driver.findElement(By.cssSelector("._5k_4"));
WebDriverWait wait = new WebDriverWait(driver,20);
wait.until(ExpectedConditions.elementToBeClickable(DOB));
//Select day
WebElement day = driver.findElement(By.cssSelector("#day"));
Select dropdown = new Select(day);
System.out.println("Day is visible : " +day.isDisplayed());
System.out.println("Day is Enable : " +day.isEnabled());
System.out.println("Day is multiselect: " +dropdown.isMultiple());
//Count of days and text
List<WebElement> count = dropdown.getOptions();
System.out.println("Day count : " +count.size());
for(int i=0;i<count.size();i++) {
	System.out.println("days : "+count.get(i).getText());
	
}
System.out.println("Default value : " +dropdown.getFirstSelectedOption());
dropdown.selectByValue("20");
dropdown.selectByIndex(20);
dropdown.selectByVisibleText("20");
System.out.println("***************** *****************");

//Select month
WebElement month = driver.findElement(By.cssSelector("#month"));
Select drop = new Select(month);
System.out.println("Month is visible : " +month.isDisplayed());
System.out.println("Month is Enable : " +month.isEnabled());
System.out.println("Month is Multiselected : " +drop.isMultiple());
//Count and text.
List<WebElement> name = drop.getOptions();
System.out.println("Total months : " +name.size());
for(int i =0;i<name.size();i++) {
	System.out.println("Months : " +name.get(i).getText());
}
System.out.println("Default value : " +drop.getFirstSelectedOption());
drop.selectByIndex(6);
System.out.println("***************** *****************");

//Select Year
//WebElement year = driver.findElement(By.cssSelector("#year"));
//Select drop1 = new Select(year);
//System.out.println("Year is visible : " +year.isDisplayed());
//System.out.println("Year is Enable : " +year.isEnabled());
//System.out.println("MutliSelected : " +drop1.isMultiple());
////Count and text
//List<WebElement> year1 = drop1.getOptions();
//System.out.println("Total years : " +year1.size());
//for(int i = 0;i<year1.size();i++) {
//	System.out.println("Years : " +year1.get(i).getText());
//}
//System.out.println("Default valut : " +drop1.getFirstSelectedOption());
//drop1.selectByIndex(5);
//System.out.println("***************** *****************");


WebElement year = driver.findElement(By.cssSelector("#year"));
//year.click();
Select years = new Select(year);

System.out.println("is Visible :"+year.isDisplayed());
System.out.println("is Enable:"+year.isEnabled());
System.out.println("is Multiuple :"+years.isMultiple());
    List<WebElement>  yearcount = years.getOptions();
    System.out.println("yearcount "+yearcount.size()); 
    
    for(int i =0;i<yearcount.size();i++) {
    	
    	System.out.println("names "+yearcount.get(i).getText());
    }
    
    System.out.println("Default value :"+years.getFirstSelectedOption());
    
    years.selectByIndex(0);

	}

}
