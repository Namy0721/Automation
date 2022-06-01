package staticNonstaticGlobalVariables;

public class Variables {
	//global variable
		double salary; // Non static global variables
		static char grade; // Static global variables
		int age=28; // Non static global variables
		static int empId=123; // Static global variables
		
		public static void main(String[] args) {
			
			System.out.println("Program Starts..."); 
			int empId=456;// Local veriable
			System.out.println("local empId with std: "+empId);// local empID with std 456
			System.out.println("SGV grade with std: "+Variables.grade);//  SGC grade:
			System.out.println("SGV grade without std: "+grade);// SGC grade without std:
			System.out.println("SGV empId with std: "+Variables.empId);// SGV empID:123
			
			Variables v1=new Variables();
			System.out.println("NSGV salary with std: "+v1.salary);// NSGV salary with std: 0.0
			System.out.println("NSGV age with std: "+v1.age); //NSGV age with std: 28
		
			Variables v2=new Variables();
			v2.salary=25000;//NSGV
			v2.age=30; // NSGV
			System.out.println("NSGV salary with std: "+v2.salary); // NSGV salary with std: 25000
			System.out.println("NSGV age with std: "+v2.age); // NSGV age with std:30

			System.out.println("Program Ends...");
}
}
