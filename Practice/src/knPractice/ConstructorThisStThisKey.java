package knPractice;

public class ConstructorThisStThisKey {

	 int age;
	double salary;
	
	
//	 void Method (double i) {
//	 }
//	 
		ConstructorThisStThisKey(){
			this(20.0,56.09f);
			System.out.println("********0 Parameterised**********");
			System.out.println("Zero Parameter");
			
			
		}
		ConstructorThisStThisKey(int a){
			this.salary = a;//28
			System.out.println("**********Int Parameterised***********");
			System.out.println(" Salary = " +a);//28
			System.out.println("Int = " +a);//28
		}
		ConstructorThisStThisKey(double b, float c){
//			this(28);
			System.out.println("*********Double Float***********");
			System.out.println("Double = " +b+ "Float = " +c);//20.0,56.09f
			
	}
		ConstructorThisStThisKey(double f, float e, int d){
			this();
			this.age = d;//23
			System.out.println("************Double Float Int************");
			System.out.println("Age = " +d);//23
			System.out.println("Double = " +f+  "Float = " +e+   "int = " +d);  
		}
	 void display () {
		 System.out.println("**********Display Method**********");
		 System.out.println( salary+ " " +age );
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("Static Variable = " +age);
ConstructorThisStThisKey obj = new ConstructorThisStThisKey(20.0,40.0f,23);
System.out.println("Salary = " +obj.salary); 
System.out.println("Age = " +obj.age);
obj.display();
ConstructorThisStThisKey obj2 = new ConstructorThisStThisKey();
obj2.display();


	}

}
