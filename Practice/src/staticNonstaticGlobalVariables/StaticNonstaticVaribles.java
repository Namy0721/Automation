package staticNonstaticGlobalVariables;

public class StaticNonstaticVaribles {
	static double salary = 278888; //SGV
	 byte age;//NSGV
 
	public static void SVariables (int a, int b, double c) {
	 double sum = a+b+c;
	 System.out.println ("Sum of two numbers = " +sum);
	 System.out.println("*************New Numbers*********");
 }
 public static void main (String [] args) {
	 double salary = 679888; //Local Variable
	 //StaticNonstaticVaribles.salary = 42000;
	 System.out.println("Salary = " +salary);
	 System.out.println("Salary = " +StaticNonstaticVaribles.salary); //class name and variable
	 SVariables(123,2344,2233.00);
	 SVariables(3344,2211,2244.77);
	 StaticNonstaticVaribles obj = new StaticNonstaticVaribles();//object creation
	 obj. NonStaticVaribles(); // calling
	 System.out.println ("Age =" +obj.age);
	 StaticNonstaticVaribles obj1 = new StaticNonstaticVaribles(); // object creation
	 obj1.age = 24; //calling
	 System.out.println("Age = " +obj1.age);
	 }
 
 void NonStaticVaribles () {
	 System.out.println ("Non Static variables are also know as object variables");
	 
 
 
	 
	 
	 
 }
 
}
