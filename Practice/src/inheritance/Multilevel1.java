package inheritance;

class A1 {
	static int a = 10;
	int b = 20;
	double c = 13.45;
	
}

class B1 extends A1{
	static int x = 30;
	int y = 40;
	double z = 23.45;
	
}

class C1 extends B1{
	static int pp = 50;
	int q = 60;
	double r = 34.54;
	
}
public class Multilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("************Static Veriables**********");
System.out.println("Class A1 static veriable : " +A1.a);
System.out.println("Class B1 static veriavle : " +B1.x);
System.out.println("Class C1 static veriable : " +C1.pp);

C1 obj = new C1();
System.out.println("*******Non static variables with reference variable obj******");
System.out.println("Parent class A, non static variable : " +obj.b);
System.out.println("Parent class A, non static variable : " +obj.c);
System.out.println("Sub class B non static veriable :   "  +obj.y);
System.out.println("Sub class B non static variable : " +obj.z);
System.out.println("Sub class C  non static variable : " +obj.q);
System.out.println("Sub class C non static veriable :   "  +obj.r);

B1 obj1 = new B1();
System.out.println("*********Non static variables with reference variable Obj1*********");
System.out.println("Parent class A, non static variable : " +obj1.b);
System.out.println("Parent class A, non static variable : " +obj1.c);
System.out.println("Sub class B non static veriable :   "  +obj1.y);
System.out.println("Sub class B non static variable : " +obj1.z);



	}

}
 