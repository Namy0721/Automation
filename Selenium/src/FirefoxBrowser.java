import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path1 = System.getProperty("user.dir")+"\\Executable\\geckodriver.exe";
String path2 = ".\\Executable\\geckodriver.exe";
String path3 = "C:\\Users\\Administrator\\.eclipse\\Selenium\\Executable\\geckodriver.exe";

System.setProperty("webdriver.gecko.driver", path2);

WebDriver driver = new FirefoxDriver();
	}

}
