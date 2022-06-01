import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path1 = System.getProperty("user.dir") + "\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path1);
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com");
System.out.println("Home page title : " +driver.getTitle());
if (driver.getTitle().equalsIgnoreCase("Facebook -log in or sign up")){
System.out.println("Title is correct");
	}
	
else { System.out.println("Incorrect");

}
driver.close();
}

	}

