import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1 = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path1);
		//System.setProperty("webdriver.chrome.driver", ".\\Executable\\chromedriver.exe");
		//System.setProperty("webdrive.chrome.driver", System.getProperty("user.dir")+"\\Executable\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	String sourceCode = driver.getPageSource();

	System.out.println("Application source code : " +sourceCode);
	System.out.println("URL : " +driver.getCurrentUrl());
	System.out.println("page source : " +driver.getPageSource());
	System.out.println("Application source Length : " +sourceCode.length());
	System.out.println("Application URL : " +driver.getCurrentUrl());
	System.out.println("Application current Title : " +driver.getTitle());
	if (driver.getTitle().equals("Google")) {
		System.out.println("Google page opened sucessfully.......");
	}
	else { System.out.println("Google page not opened or title got changed");
	
	}
	driver.close();
	}

}
