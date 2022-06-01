import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String path1 = "C:\\Users\\Administrator\\.eclipse\\Selenium\\Executable\\geckodriver.exe";
//String path2 = ".\\Executable\\geckodriver.exe";
String path3 = System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
String path4 = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
//String path5 = "C:\\Users\\Administrator\\.eclipse\\Selenium\\Executable\\chromedriver.exe";	
openBrowser(path3,"firefox");
openBrowser(path4,"chrome");
	}
static void openBrowser(String driverPath,String browserName) {
	
	if (browserName.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
	}
	else if (browserName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", driverPath);
			
		WebDriver driver = new FirefoxDriver();
		driver.close();	
	}
}

}
