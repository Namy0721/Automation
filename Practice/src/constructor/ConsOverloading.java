package constructor;

public class ConsOverloading {
	ConsOverloading(){
		System.out.println("Zero Parameterized");
		
	}
	ConsOverloading(int a){
		System.out.println("Parameterized Constructor");
		
	}
	ConsOverloading(int a,double b,int c){
	System.out.println("Parameterized Constructor");
	System.out.println(" a = " +a+ " b =  " +b+ " c = "  +c);
	}
	ConsOverloading(double a, int b, int c){
		System.out.println("Parameterized Constructor");
	}
		public static void main (String []args) {
			ConsOverloading c1 = new ConsOverloading();
			ConsOverloading c2 = new ConsOverloading(12);
			ConsOverloading c3 = new ConsOverloading(123,238.98,123);
			ConsOverloading c4 = new ConsOverloading(231.23,214,123);
			
		}
	}
	


