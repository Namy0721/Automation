package knPractice;

class CVC{
	static int a = 20;
	double b = 23.67;
	float c = 23.45f;
}
class xyz{
	static int x = 45;
	double y = 23.45;
	float z = 12.45f;
}
class lmn{
	static int l = 21;
	double m = 22.44;
	float n = 23.45f;
}

public class StaticNonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("I belong to a of class abc : " +CVC.a);
System.out.println("I belong to x of class xyz : " +xyz.x);
System.out.println("I belong to l of class lmn : " +lmn.l);
System.out.println("*************************************");

CVC obj1 = new CVC();
System.out.println("I belong to b of class abc : " +obj1.b);
System.out.println("I belongs to c of class abc : "+obj1.c);
System.out.println("***************************************");

xyz obj2 = new xyz();
System.out.println("I belong to y of class xyz : " +obj2.y);
System.out.println("I belong to z of class xyz : " +obj2.z);
System.out.println("***************************************");

lmn obj3 = new lmn();
System.out.println("I belong to m of class lmn : " +obj3.m);
System.out.println("I belong to n of class lmn : " +obj3.n);
System.out.println("***************************************");

	}

}
