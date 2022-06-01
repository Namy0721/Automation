package knPractice;

class Humanresource{
	public void HR() {
	System.out.println("I take care of employee information");
		
	}
}
class Employee1 extends Humanresource{
	public void E1() {
		System.out.println("my emplyID is 01 by Human Resource");
	}
}
class Employee2 extends Humanresource{
	public void E2() {
		System.out.println("my emplyID is 02 by Hman Resource");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee1 obj1 = new Employee1();
obj1.E1();
obj1.HR();
System.out.println("********************");

Employee2 obj2 = new Employee2();
obj2.E2();
obj2.HR();
System.out.println("********************");

Humanresource obj3 = new Employee1();
obj3.HR();
System.out.println("********************");

Humanresource obj4 = new Employee2();
obj4.HR();
	}

}
