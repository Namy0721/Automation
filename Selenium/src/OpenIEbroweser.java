import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenIEbroweser {

public static void main(String[] args) {
		
		String geckoDriverPath=System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
		String chromeDriverPath=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		openBrowser(geckoDriverPath, "firefox");
		openBrowser(chromeDriverPath, "chrome");
	}
	static void openBrowser(String driverPath,String browserName) {
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			//step1: set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.chrome.driver", driverPath);
			//step2: create an instance of chrome Browser
			WebDriver driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			//step1: set driver executable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.gecko.driver", driverPath);
			//step2: create an instance of Firefox Browser
			WebDriver driver=new FirefoxDriver();
		}
	}
}