package knPractice;

public class AXA {
	
		 void display() {
			System.out.println("I belong to class A");
		}
		 
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
X obj1 = new X();
obj1.display();
obj1.xyz();
}

}

	 class X extends AXA{
		void xyz() {
			System.out.print("I belong to class B");
		}

		

	 }
