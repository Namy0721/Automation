

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import SeleniumUtility.SeleniumUtility;

public class ActitimeTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
SeleniumUtility s2 = new SeleniumUtility();
WebDriver driver = s2.setUp("chrome"," https://demo.actitime.com/login.do");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//LOGIN
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
//TASKS MENU 
driver.findElement(By.cssSelector(".ext-strict>*:nth-child(2)>*:nth-child(8)>*:first-child>*:first-child>*:first-child>*:nth-child(4)>a>div")).click();
//TASK SELECTION
driver.findElement(By.cssSelector(".plusIcon")).click();
//CREATE NEW TASK
driver.findElement(By.cssSelector(".item.createNewTasks")).click();
//CUSTOMER NAME
driver.findElement(By.cssSelector(".customerSelector.customerOrProjectSelector>*:first-child")).click();
driver.findElement(By.cssSelector(".itemRow.cpItemRow.selected")).click();
//PROJECT NAME
driver.findElement(By.cssSelector(".selectProjectRow.projectSelectorRow")).click();
driver.findElement(By.cssSelector(".projectSelector.customerOrProjectSelector>*:first-child>*:nth-child(2) div>*:first-child div>*:nth-child(5)"));
//ENTERING NEW DATA
driver.findElement(By.cssSelector(".nameCell.first>*:first-child")).sendKeys("Testing");
//DEADLINE
driver.findElement(By.cssSelector("#ext-gen51")).click();
driver.findElement(By.cssSelector(".x-date-active.x-date-selected>a>em>*:first-child")).click();
//TYPE OF WORK
//Thread.sleep(2000);
//driver.findElement(By.cssSelector(".typeOfWorkButton.editable>*:first-child")).click();
//driver.findElement(By.cssSelector(".typeOfWorkList>*:nth-child(11)>*:first-child")).click();
//CREATE TASK
driver.findElement(By.cssSelector(".commitButtonPlaceHolder>*:nth-child(1)")).click();

List<WebElement> list1 = driver.findElements(By.cssSelector(".tasksTable.scrollToTopButtonShifted"));
System.out.println("Size : " +list1.size());
for(int i=0;i<list1.size();i++) {
	WebElement opp = list1.get(i);
	System.out.println("Element : "+opp.getText());
	System.out.println(opp.isDisplayed());
	
//	if(opp.equals("Testing")) {
//		System.out.println("***********New task has been genrated************");
//		driver.findElement(By.cssSelector(".taskRow.noLastTrackingDate>td>div>div")).click();
//		break;
//	}
}
Thread.sleep(3000);
//CLICK ON TASK CREATEAD
driver.findElement(By.cssSelector(".taskRow.noLastTrackingDate>*:first-child>*:first-child>*:first-child")).click();
//CLICK ON DELETE
driver.findElement(By.cssSelector(".delete.button")).click();

driver.findElement(By.cssSelector(".dialogWithPointerWrapper.deleteDialog>*:first-child li")).click();//.operationConfirmDialogInnerContainer>*:nth-child(6)>*:first-child>*:first-child>*:first-child")).click();
driver.findElement(By.cssSelector(".ext-strict>*:nth-child(2)>*:nth-child(8)>*:first-child>*:first-child>*:first-child>*:nth-child(4)>a>div"));

	}

}
