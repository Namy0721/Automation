package constructor;

public class SquareOverloading {
	public void Square(int number) {
		int square = number*number;
		System.out.println("Method with integer Argument called : " +square);
		
	}
public void Square(double number) {
	double square = number*number;
	System.out.println("Method with double argument called : " +square);
	
}
public void Square(long number) {
	long square = number*number;
	System.out.println("Method with long Argument Called: " +square);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SquareOverloading obj = new SquareOverloading();
obj.Square(45);
obj.Square(20.0);
obj.Square(28l);
	}

}
