package staticNonstaticGlobalVariables;

public class ArathematicalOpreation {
	
	 public static double claculation (double a,long b) {
		   double sum = a+b;
		   double multiply = a*b;
	       double sub = a-b;
	       double div = a/b;
	       double modules =a%b; 
	       System.out.println("Addition of two number = " +sum );
	       System.out.println("Multiplication of two number = " +multiply);
	       System.out.println("Subtraction of two number = " +sub);
	       System.out.println("Division of two number = " +div);
	       System.out.println("Reminder of two number = " +modules);
	       System.out.println("***********New Numbers***************");
	       return modules; 
	   }
	 public static void main (String [] args) {
		 claculation (123.0,4536);
		 ArathematicalOpreation.claculation(2200, 3340);
		 claculation (2340.9,9900);
		 ArathematicalOpreation.claculation(1122, 2233);
		 
		 
	 }
	 
}
