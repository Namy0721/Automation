package inheritance;

class A {
	static int a = 10;
	int b = 20;
	double c = 13.45;
	
			}

class B { 
	static int x = 30;
	int y = 40;
	double z = 53.45;
}

class C {
	static int p = 45;
	int q = 60;
	double r = 66.45;
}
public class Inheritance0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Class A static variables : " +A.a);
System.out.println("Class B static variable :  "+B.x);
System.out.println("Class c static variable : " +C.p);
A a1=new A();
System.out.println("Class A non static variable : " +a1.b);
System.out.println("Class A non static variable : " +a1.c);
B b1 = new B();
System.out.println("Class B non static variable : " +b1.y);
System.out.println("Class B non static variable : " +b1.x);
C c1 = new C();
System.out.println("Class C non static variable : " +c1.q);
System.out.println("Class C non static variable : " +c1.r);

	}

}
