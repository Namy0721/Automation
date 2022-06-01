package constructor;

public class Overloading001 {
Overloading001(){
	System.out.println("Zero Parameterized");
	
}
void mul(int a, int b) {
	System.out.println("Sum of two = " + (a*b));
	
}
void mul ( int a, int b, int c) {
	System.out.println("Sum of three = " + (a+b+c));
	
}
class Multiplication{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading001 object = new Overloading001();
object.mul(2134,3455);
object.mul(123,2345,23443);

	}

}
