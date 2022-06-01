package practiceprogram;

public class Add2num {
	void additional () {
		int a = 25;
		int b = 45;
		int c = a+b;
		System.out.println("Sum of two number is " +c);
	}
	
	 float Multiplication (float a, float b) {
		float c = a*b;
		System.out.println("Multiplication of two numbers is: " +c);
		 return c;
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add2num ref = new Add2num();
ref.additional();
ref.Multiplication(123.22f, 22.43f);


	}

}
