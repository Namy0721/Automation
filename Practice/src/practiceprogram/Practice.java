package practiceprogram;
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        //Area of circle
				float r=5; float pi = 3.14f;
				double area = pi*r*r;
				System.out.println("Radius="+ r);
				System.out.println("Area of circle ="+ area);
				System.out.println("************************");
				
				//Area of Rectangle
				int weidth = 12;
				int height = 24;
				  float area1 = weidth*height;
				 System.out.println("weidth="+ weidth);
				 System.out.println("height="+ height);
				 System.out.println("Area of Rectangle ="+ area1);
				 System.out.println("**************************");
				 
				 // Addition, multiplication, subtraction, division, remainder
				float number1 = 23.98f;
				double number2 = 21.987;
				double addition = number1 + number2;
				int multiplication = (int) (number1*number2);
			  double subtraction = number1-number2;
				double division = number1/number2;
				double reminder = number1%number2; // modulas
				System.out.println("Number1=" + number1);
				System.out.println("Number2=" + number2);
				System.out.println("addition=" + addition);
				System.out.println("multiplication="+multiplication);
				System.out.println("subtration="+subtraction);
				System.out.println("division="+division);
				System.out.println("reminder="+reminder);
				System.out.println("**********************");
				
				
				//Simple Interest
				int P = 1200;
				float r1 = 12.5f;
				long t = 2;
				double A = (P*r1*t)/100;// Simple Interest formula
				System.out.println("Principal=" + P);
				System.out.println("Rate of interest=" + r1);
				System.out.println("Time=" + t);
				System.out.println("Simple Interest ="+A);
				System.out.println("****************");
				
				//Convert fahrenheit to celsius
				byte Fahrenheit;
				Fahrenheit = 25;
				double Celsius;
				Celsius = ((Fahrenheit-32)*5)/9; // Formula to convert F into C
				System.out.println("Fahrenheit=" + Fahrenheit);
				System.out.println("Fahrenheit into Celsius="+Celsius);
				
				
						
	}

}
