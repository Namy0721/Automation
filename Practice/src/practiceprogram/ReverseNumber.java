package practiceprogram;


public class ReverseNumber {

	public static void main(String[] args) {
    int a = 123456; 
    System.out.println("Number is: "+a);
   int  reverse = 0;
//    for (int i = a ;i != 0 ; i=i/10) {
//    	int modulas = i%10;
//    	reverse = reverse*10+modulas;
//    }
//    
   for (int i = a; i>0;i = i/10)
   {
	   int modulas = i%10;
	   reverse = reverse*10+modulas;
   }
   
    System.out.println("The reverse of given number is: " +reverse);
    if (reverse == a) {
    	System.out.println("is a palandrom ");
    	
    }
    else {
    	System.out.println("is not palandrom");
    }
    	
    }
}


//int a = 01234;
//System.out.println("paint"+a);
//	}
//}
//public class ReverseNumber {
//	int i =10;
//	 ReverseNumber() {
//		System.out.println("Running Class Constructoro1");
//	}
//	void display() {
//		System.out.println("I am display() of class A.");
//	}
//}
//class X {
//	int j=10;
//	X() {
//		System.out.println("Running class X constructor..");
//	}
//	void display() { 
//		System.out.println("I am display () of class X.");
//	}
//}
// class Cons5 { 
//	void display() {
//		System.out.println("I am display () of class Cons5.");
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 ReverseNumber a1 = new  ReverseNumber();
//a1.display();
//System.out.println("Class Constructor01 global variable i =" +a1.i);
//X a2 = new X();
//a2.display();
//System.out.println("Class X global variable j =" +a2.j);
//Cons5 a3 = new Cons5();
//a3.display();
//	}
//
//}
