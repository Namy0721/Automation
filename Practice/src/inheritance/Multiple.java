package inheritance;

//class A2{
//	void msg() {
//		System.out.println("Hello");
//		
//	}
//}
//class B2{
//	void msg() {
//		System.out.println("Welcome");
//	}
//}
//
//public class Multiple extends A2,B2 {
//
//	Multiple(){
//		super();
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Multiple obh = new Multiple();
//obh.msg();
//	}
//
//}

class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
// child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
	
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);
		System.out.println("Fruits fruitAge: "+super.fruitAge);
		taste();
		super.taste();
	}
}
public class  Multiple {

	public static void main(String[] args) {

		System.out.println("*******************************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*******************************************");
	}
}