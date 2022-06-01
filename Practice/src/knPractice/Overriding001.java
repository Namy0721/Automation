package knPractice;

class car {
	void car() {
		System.out.println("I am CAR");
	}
	static void four() {
		System.out.println("I have four wheels");
	}
}
class inova extends car{
	void car() {
		super.car();
		System.out.println("I belong to Car family");
	}
	static void four() {
		System.out.println("I have same wheels as car");
	}
}
public class Overriding001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car obj1 = new inova();//super class reference for object sub class with zero parameters.
obj1.car();
obj1.four();
inova obj2 = new inova();
System.out.println("***********");
inova.four();
obj2.car();
	}

}
