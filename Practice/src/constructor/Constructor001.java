package constructor;

public class Constructor001 {
double i = 10.23;
Constructor001 (double j){
	System.out.println("Running Class C constructor..");
	i = j;
}
 class Cons6 {
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main() of Class started ");
Constructor001 c1 = new Constructor001(15.34);
System.out.println("Class C global variable i = " +c1.i);
System.out.println("****************************************");
Constructor001 c2 = new Constructor001(200.89);
System.out.println("Class Constructor001 Global veriable i = " +c2.i);

	}

}
