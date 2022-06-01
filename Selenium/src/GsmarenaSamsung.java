import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmarenaSamsung {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver",path);
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.gsmarena.com/");

driver.findElement(By.cssSelector(".brandmenu-v2>ul a")).click();
//List<WebElement> SamsungPage = driver.findElements(By.cssSelector(".nav-pages>a"));
//System.out.println("Total pages : " +SamsungPage.size());
//
//if(SamsungPage.size()>0) {
//	System.out.println("Pagenation exist..");
//}
//	for(int i=0;i<SamsungPage.size();i++) {
//		WebElement samsung = SamsungPage.get(i);
//		Thread.sleep(3000);
//		samsung.click();
//		System.out.println (driver.getCurrentUrl());
//		SamsungPage = driver.findElements(By.cssSelector(".nav-pages>a"));
//		
//		
//		
//	}
//	}
//}
List<WebElement> pagination =driver.findElements(By.cssSelector(".nav-pages>a"));
System.out.println("Pagination count :"+pagination.size());
for(int i =0;i<pagination.size();i++) {
	WebElement click = pagination.get(i);
	//WebDriverWait wait = new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.elementToBeClickable(pagination.get(i)));
		Thread.sleep(2000);
		//pagination.get(i).click();
		click.click();
		System.out.println(driver.getCurrentUrl());
	
		


		pagination =	driver.findElements(By.cssSelector(".nav-pages>a"));
}
}
}

//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//class GsmarenaSamsung.java {
//
//	public static void main(String[] args) throws InterruptedException {
//	
//		String path = System.getProperty("user.dir")+"\\executable\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", path);
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get("https://www.gsmarena.com/");
//		
//		driver.findElement(By.cssSelector(".brandmenu-v2>ul a")).click();
//		List<WebElement> SamsungPage = driver.findElements(By.cssSelector(".nav-pages>a"));
//		System.out.println("Total pages : " +SamsungPage.size());
//
//		if(SamsungPage.size()>0) {
//			System.out.println("Pagenation exist..");
//		}
//			for(int i=0;i<SamsungPage.size();i++) {
//				WebElement samsung = SamsungPage.get(i);
//				Thread.sleep(3000);
//				samsung.click();
//				System.out.println (driver.getCurrentUrl());
//				SamsungPage = driver.findElements(By.cssSelector(".nav-pages>a"));
//				
//				
//				
//			}
//		
//	List<WebElement>  phones =	driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
//		
//	System.out.println("Phone count: "+phones.size()); 
//		
//		for(int i =0;i<phones.size();i++) {
//		
//		WebElement  phoneoptions =  phones.get(i);
//		String name = phoneoptions.getText();
//	
//		if(name.equals("Samsung"));
//		
//		phoneoptions.click();		
//		
//		}
//	
//	
//List<WebElement> samsung =	driver.findElements(By.cssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a"));
//		
//		
//		
//		System.out.println("Samsung Count "+samsung.size());
//		for(int i =0;i<samsung.size();i++) {
//		WebElement   samsungops=	samsung.get(i);
//		String samsungPhnames = samsungops.getText();
//		
//			if(samsungPhnames.equals("Galaxy Tab S6 Lite (2022)")) {
//				
//				samsungops.click();
//			}
//	}
//
//		
//		
//		
//		List<WebElement> pagination =driver.findElements(By.cssSelector(".col.col-1-5.pages-next-prev.float-right>*:nth-child(2)"));
//		System.out.println("Pagination count :"+pagination.size());
//		for(int i =0;i<pagination.size();i++) {
//			
//			WebElement  pagenos  =  pagination.get(i);
////			WebDriverWait wait = new WebDriverWait(driver,20);
////			wait.until(ExpectedConditions.elementToBeClickable(pagenos));
//			Thread.sleep(2000);
//			pagenos.click();
//			driver.getCurrentUrl();
//			pagination =	driver.findElements(By.cssSelector(".pages-next"));
//		}
//	}
