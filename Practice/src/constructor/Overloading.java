package constructor;

public class Overloading {
static int age;
double salary;
Overloading(){
	System.out.println("==========Zero parameterized========");
	
}
Overloading(int a){
	System.out.println("=========Parameterized=========");
	age=a;
	System.out.println("Int Parameterized"+a);
	
}
Overloading(double b){
	System.out.println("=========Parameterized=========");
	salary=b;
	System.out.println("Double Parameterized " +b);
}
Overloading(int a,double b){
	System.out.println("=========Parameterized=========");
	 age=a;
	salary=b;
	System.out.println("Int Double Parameter = " +a+ " " +b);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading c1 = new Overloading();
System.out.println("After int-para constructor,Age =  " +c1.age);
System.out.println("After int-para constructor,Salary =  " +c1.salary);

Overloading c2 = new Overloading(345777.90);
System.out.println("After int-para constructor,Age =  " +c2.age);
System.out.println("After int-para constructor,Salary =  " +c2.salary);

Overloading c3 = new Overloading(30,456627.09);
System.out.println("After int-para constructor,Age =  " +age);
System.out.println("After int-para constructor,Salary =  " +c3.salary);


	}

}
