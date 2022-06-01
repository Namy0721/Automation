package ifloops;

public class IfCondition {

	public static void main(String[] args) {
		
		int num1=45, num2=30;
		if (!(num1==num2)) {
			System.out.println(num1+ " is Greater Number ");
			}
			else {
				System.out.println(num2+ " is smaller Number");
			}
		if (num1>num2) {
			System.out.println (num1+ " is Greater Number");
		}
		else {
			System.out.println(num2+ " Smaller Number1");
		}
		if (num1>=num2) {
			System.out.println(num1+ " Is Greater than or equal to Num2");
		}
		else
		{
			System.out.println(num2+ " Is smaller Number");
			
			if (num1>=num2 || num1>num2) {
				
				System.out.println(num1+ " is Greater Number ");
			}
			else {
				System.out.println(num2+ " is smaller Number");
				
			}
			if (num1 >=num2 && num1>num2) {
				System.out.println(num1+ " is Greater Number ");
			}
			else {
				System.out.println(num2+ " is smaller Number");
					
			}
			if (num1==num2) {
				System.out.println(num1+ " Equal " +num2);
			}
			else if (num1>num2) {
				System.out.println(num1+ " is Greater Number ");
			}
			else {  
				System.out.println (num2 + " Smaller number");
			}
			int sub1=50, sub2=30;
			if (sub1>35 && sub2>35) {
				System.out.println("PASS");
			}
			else {
				System.out.println("FAIL");
				
				
			}
		}
	}

}
