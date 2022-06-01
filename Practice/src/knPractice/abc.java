package knPractice;

public class abc {


		static int ac = 20;
		double b = 30.9;
		
		double salary = 1000000;
		int EmpID;
		int year =1990;
		
		abc(double a){
			this(210.0,12.8f,22);
			System.out.println("+++++++++++++++++single parameterized constructor+++++++++++++++++++++++");
			System.out.println ("global salary : " +salary);
			System.out.println("Single parameterised Salary : " +a);
			
			a = salary;
			
			
		}
		abc (double c, float d, int e){
			this(1999,1122,2200.9);
		
			System.out.println("+++++++++++++++++Parameterized constructor+++++++++++++++++++++");
			System.out.println("EmpID : " +EmpID);
			System.out.println("Parameterised constructor Salary : " +c);
			System.out.println("Parameterised EmpID : " +d);
			System.out.println("int e = " +e);
			
			c = salary;
			d = EmpID;
		}
		abc (int year, int EmpID , double salary){
			
			this.year = year;
			//System.out.println(" year through this keyword : " +this.year);
			this.EmpID = EmpID;
			//System.out.println(" EmpID through this keyword : " +this.EmpID);
			this.salary= salary;
			//System.out.println(" salary through this keyword : " +this.salary);
		}
		
		void xyz() {
			System.out.println("==========This Keywords==========");
			System.out.println("year =  " +year+ " Salary = " +salary+ " EmpID = " +EmpID);
		}
		
		static {
			System.out.println("********static block******");
		}

//		{
//			System.out.println("*********non static block*********");
//		}
		public static void display (int c , int d , int e){
		 double sum  = c+d+e ;
		
		System.out.println(" values =   "  +c+  "  , "   +d+   " , "   +e) ;
		System.out.println("sum = " +sum);
		}
		{
			System.out.println("*******love you**********");
		
		
	
		}

		public double display (double g , float h) {
		double mul = g*h ;
		System.out.println(" values =  " +g+ " , "  + h) ;
		System.out.println(" multiplication = " +mul);

		return mul;
	
		}
		

		public static void main (String []args){
			
			abc.display(10,20,30);
			
			abc ref = new abc (2087633.0,10000.0f,4);
			
			System.out.println("<<<multiplication : " +ref.display(29.0 , 25.9f)+ ">>>>>");
		
			System.out.println(" double b =  "  + ref.b);
			System.out.println("static int a = " +abc.ac);

			ref.b = 10.0;
			System.out.println( " new value = " +ref.b);
			
			//abc obj = new abc(112.0,5555);
		
		abc obj1 = new abc(1111);
		System.out.println("*****tHIS STATMENT*********");
			
			abc obj2 = new abc(2000, 2000, 20000.0);
			obj2.xyz();

			
			}
		{
			System.out.println("*********fuck u********");
		}
		static {
			System.out.println("********static block2******");
		}
			
		}
		





