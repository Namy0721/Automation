import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeTaskCreation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
       WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
//LOGIN
driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
driver.findElement(By.cssSelector("td#loginButtonContainer")).click();
//TASK CLICK
//Thread.sleep(3000);
WebElement task = driver.findElement(By.cssSelector("table.navTable>*:first-child tr>*:nth-child(4)"));
WebDriverWait wait = new WebDriverWait(driver, 20);
wait.until(ExpectedConditions.elementToBeClickable(task));
task.click();
//ADD NEW CLICK
driver.findElement(By.cssSelector("div.addNewButton>*:last-child")).click();
//NEW TASK CLICK
driver.findElement(By.cssSelector(".item.createNewTasks")).click();
//Customer and project task
driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector>*:nth-child(1)")).click();
WebElement project = driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector>*:first-child>*:nth-child(2)>*:first-child div div>*:nth-child(3)"));
WebDriverWait wait1 = new WebDriverWait(driver, 30);
wait.until(ExpectedConditions.elementToBeClickable(project));
project.click();
//Project click
//Thread.sleep(3000);
//driver.findElement(By.cssSelector(".selectProjectErrorCell")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector(".projectSelector.customerOrProjectSelector")).click();
driver.findElement(By.cssSelector(".projectSelector.customerOrProjectSelector div>*:nth-child(4)")).click();
//WRITE TASK
WebElement Writetask = driver.findElement(By.cssSelector("input[placeholder='Enter task name']"));
Writetask.click();
Writetask.sendKeys("TESTING");
//SELECT DEADLINES
driver.findElement(By.cssSelector("#ext-gen51")).click();
driver.findElement(By.cssSelector("#ext-gen110")).click();
//DATE SELECT
driver.findElement(By.cssSelector(".x-date-inner>*:nth-child(2)>*:nth-child(2) td")).click();
//TYPE OF WORK
driver.findElement(By.cssSelector("td.billingTypeCell>*:nth-child(2)")).click();
//SELECT TESTING
driver.findElement(By.cssSelector("td.billingTypeCell>*:first-child div div div>*:first-child>*:nth-child(11)")).click();
//CHECKBOX CLICK
driver.findElement(By.cssSelector(".components_checkboxContainer.checkboxContainer>*:nth-child(3)")).click();
//CLICK CREATE TASK
driver.findElement(By.cssSelector(".commitButtonPlaceHolder")).click();
//TESTING CREATED, VALIDATION TO BE DONE
List<WebElement> list = driver.findElements(By.xpath("//div[@class='createdTasksTableContainer']/following-sibling::div/table/tbody/tr"));
System.out.println("Size of list : " +list.size());
for(int i=0;i<list.size();i++) {
	WebElement options = list.get(i);
	System.out.println("Name of task creation : " +options.getText());
	System.out.println("Is Displayed : " +options.isDisplayed());
	System.out.println("Is Enabled : " +options.isEnabled());
	System.out.println("************************************");

if(options.equals("TESTING")) {
	WebDriverWait wait2 = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(options));
	options.click();
	
	
}
	
}






	}
}
