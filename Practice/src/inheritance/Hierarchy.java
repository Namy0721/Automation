package inheritance;

class vehical{
//	vehical(){
//		System.out.println("Parent child inheritance");
//	}
	public void wheels() {
		System.out.println("I have wheels");
	}
}
class bike extends vehical{
	public void countwl() {
	System.out.println("I am a bike and has 2 wheels");
	
	}
}
class car1 extends vehical{
	{
		System.out.println(" Hierarchy");
	}
public void countwlc() {
	System.out.println("I am a car and ahs 4 wheels");
}
}
class scooter extends vehical{
//	{
//	System.out.println(" Hierarchy");
//	}
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}

public class Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
scooter sc = new scooter();
sc.countwls();
sc.wheels();

car1 c = new car1();
c.wheels();
c.countwlc();

bike b = new bike();
b.countwl();
b.wheels();

	}

}
