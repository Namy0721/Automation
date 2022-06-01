import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumUtility.SeleniumUtility;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
SeleniumUtility s3 = new SeleniumUtility();
WebDriver driver = s3.setUp("Chrome","https://www.redbus.in/");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

WebDriverWait wait = new WebDriverWait(driver,20);
//FROM Swargate, Pune
driver.findElement(By.cssSelector("input[type=text]")).sendKeys("Swargate, Pune");
//wait.until(ExpectedConditions.elementToBeClickable(".rb-monthTable.first.last>tbody>*:nth-child(5)>*:nth-child(3)"));
//TO Porvorim, Goa
driver.findElement(By.cssSelector("#dest")).sendKeys("Porvorim, Goa");
//DATE
//Thread.sleep(3000);

driver.findElement(By.id("onward_cal")).click();
WebElement src = driver.findElement(By.cssSelector(".next>button"));
src.click();
wait.until(ExpectedConditions.elementToBeClickable(src));
WebElement src1 = driver.findElement(By.cssSelector(".rb-monthTable.first.last>tbody>*:nth-child(5)>*:nth-child(3)"));
src1.click();
wait.until(ExpectedConditions.elementToBeClickable(src1));
//SEARCH
driver.findElement(By.id("search_btn")).click();

Thread.sleep(3000);
//DEPARTURE TIME AFTER 6PM
driver.findElement(By.cssSelector(".dept-time.dt-time-filter>*:nth-child(4) label")).click();
//AC BUS ONLY
driver.findElement(By.cssSelector("label[for=bt_AC]")).click();

Thread.sleep(3000);
//TOTAL BUSES AND NAME
List <WebElement> RedBus = driver.findElements(By.cssSelector("#result-section>*:nth-child(2) ul"));
System.out.println("Total number of buses : " +RedBus.size());

for (int i=0;i<RedBus.size();i++) {
	WebElement BusName = RedBus.get(i);
	System.out.println(i+ "Name of the bus : " +BusName.getText());
}





	}

}
