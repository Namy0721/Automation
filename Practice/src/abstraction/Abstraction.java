package abstraction;


abstract class Abc {
public abstract void abstract1();
	void display() {
	System.out.println("I belong to abstract class");
}
	}
class Xyz extends Abc{
	public void abstract1(){
		System.out.println ("English is an universal language");
	}
}
class Efg extends Abc{
public void abstract1(){
		System.out.println("hindi is a national language of India");
	}
}

public class Abstraction {

public static void main (String [] args) {
	Xyz obj1 = new Xyz ();
	obj1.abstract1(); //  English is an universal language.
	Abc obj2 = new Xyz();
	obj2.abstract1();//English is an universal language.
	obj2.abstract1();//I belong to abstract class.
	Efg obj3 = new Efg();
	obj3.abstract1(); // hindi is a national language of India.
	obj3.display();// I belong  to abstract class.

}
	
}	
	
	
