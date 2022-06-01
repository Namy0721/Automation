package staticNonstaticGlobalVariables;



class MethodsStatic {
	public class MethodsStaticNonstatic {

	}
/* Public : Access Modifier
 * Static : Non Access Modifier
 * Double : Return Type
 * employeeInfo : Method Name
   (int age,double salary,int empTD) : Argument,Parameter */
	
	public static double employeeInfo (int age, double salary, int empID){
		       
		       System.out.println("My empID is"+empID);
		       System.out.println("I am"+age+"year old");
		       System.out.println("My annual salary is"+salary);
		       System.out.println("*********New Employee details*********");
			    return salary;
   }

	public static void main(String[] args) {
	employeeInfo(23,100000,1234);
   MethodsStatic.employeeInfo(24,1200000,567);
	employeeInfo(25,1500000,890);
	employeeInfo(26,1500000,789);
	MethodsStatic.employeeInfo(27,1800000,765);
	
}
  
   
 }


