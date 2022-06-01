package practiceprogram;


public class Constructor001 {
	int i =10;
	Constructor001(int k, int z) {
		System.out.println("Running Class Constructoro1");
		System.out.println(k);
		System.out.println(z);
	}
	void display() {
		System.out.println("I am display() of class A.");
	}
}
class X {
	int j=10;
	X() {
		System.out.println("Running class X constructor..");
	}
	void display() { 
		System.out.println("I am display () of class X.");
	}
}
 class Cons5 { 
	void display() {
		System.out.println("I am display () of class Cons5.");
		
	}

	public static void main(String[] args) {
Constructor001 a1 = new Constructor001(20,30);
a1.display();

System.out.println("Class Constructor01 global variable i =" +a1.i);
X a2 = new X();
a2.display();
System.out.println("Class X global variable j =" +a2.j);
Cons5 a3 = new Cons5();
a3.display();
	}

}

