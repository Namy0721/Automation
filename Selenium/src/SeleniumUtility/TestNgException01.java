package SeleniumUtility;

import org.testng.annotations.Test;

public class TestNgException01 {
 

@Test(dependsOnMethods = "Singin",enabled=true)
  public void Login() {
	System.out.println("Hi I m login");
  }
@Test(dependsOnMethods="Login",enabled=true,timeOut=2000,description="Error")
public void Notificationcheck() {
	System.out.println("Hi I m Notificationcheck(");
	try {
		Thread.sleep(2500);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	@Test(enabled=true,expectedExceptions=ArithmeticException.class)
	void Singin() {
		System.out.println("Hi I m Singin");
		int i = 10/0;
		
	}
	@Test
	void testCase() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Hello I m testCase");
		
	}
	
}

