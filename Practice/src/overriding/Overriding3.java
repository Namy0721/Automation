package overriding;
class W{
	
	void display() {
		
System.out.println("I am class W Method");
	}
}


class E extends W{
	
	void display() {
		
//		super.display();
		System.out.println("I am class E Method");
	}
	
}



public class Overriding3 {

	public static void main(String[] args) {
		
		W ref= new E();
		ref.display();

	}

}

