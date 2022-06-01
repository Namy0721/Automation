package overriding;
class nam{
	void abc() {
		System.out.println("Super class is access by sub class with the help of extends keyword");
	}

}
class rata extends nam {
	void xyz() {
	System.out.println("Sub class inherte super class Is-a relatioship ");
}
}
public class Overriding01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rata obj1 = new rata();
obj1.xyz();
obj1.abc();
	}

}
