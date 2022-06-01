package knPractice;

public class StaticNonStaticOverLoading {
	public static void main (char args) {
		System.out.println("Welcome to Accerelaction");
		System.out.println(args);
	}
	public static void main (float args) {
		System.out.println("Make best of three months ");
		System.out.println(args);
	}
static double main (int r,double p, double t) {
	double SimpleInterest = r*p*t/100;
	System.out.println("Simple Interest = "+SimpleInterest);
	return SimpleInterest  ;
}
	static int main (int b, int h) {
		
		int area = b*h;
		System.out.println("Area of triangle = "+area);
		return area;
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticNonStaticOverLoading.main('K');
StaticNonStaticOverLoading.main(234.50f);
StaticNonStaticOverLoading.main(123, 45.99,4.0);
StaticNonStaticOverLoading.main(12,23);

StaticNonStaticOverLoading obj = new StaticNonStaticOverLoading();
obj.main(22.00,12.89);
obj.main(23.0);
obj.main(234);
obj.main(123,238.098f);
	}
	
	class nonStatic {
		
	}
public double main (double l, double w) {
	double Area = l*w;
	System.out.println("Area of Rectangle = " +Area);
	return Area;
}
public double main (double r) {
double Area = 3.14*r*r;
System.out.println("Area of Circle = " +Area);
return Area;

}
public double main (int number) {
	double square = number*number;
	System.out.println("Square Root = " +square);
	return square;
}
public void main (int a, float b) {
	float c = a+b;
	System.out.println("Sum of two numbers = " +c);
	
}
}

