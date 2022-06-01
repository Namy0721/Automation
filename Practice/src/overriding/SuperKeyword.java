package overriding;


class xyz{
	void display() {
		
		System.out.println("Super class Statement");
		
	}
}

class abc extends xyz{
	void display() {
		
		super.display();
		
		System.out.println("Sub class statement");
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		xyz obj = new abc();
		
		obj.display();

	}
}
