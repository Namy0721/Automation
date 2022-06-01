import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String path1 = "C:\\Users\\Administrator\\.eclipse\\Selenium\\Executable\\chromedriver.exe";
  String path2 = ".\\Executable\\chromedriver.exe";
  String path3 = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
  
  System.setProperty("webdriver.chrome.driver", path2);
  
  ChromeDriver cdriver = new ChromeDriver();
	}

}
