import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://demo.actitime.com/");

String sourceCode = driver.getPageSource();
System.out.println("Page title name : " +driver.getTitle());
System.out.println("Title length : " +driver.getTitle().length());
System.out.println("Current URL : " +driver.getCurrentUrl());
if (driver.getTitle().equalsIgnoreCase(" actiTIME - Login")) {
	System.out.println("Correct url");
}
else { System.out.println("Incorrect");
}
System.out.println("Page source : " +sourceCode);
System.out.println("Page source length : " +sourceCode.length());
//System.out.println("page length : " +pageSourceLenght());
driver.close();
}


	}

