package practiceprogram;

import forloops.vc;

public class Swap2Numbers {

	public static void Swap() {
		int x = 20, y=30, temp;
		temp=x+y;
		x=temp-x;
		y=temp-y;
		System.out.println("value of x : "+x);
		System.out.println("value of y : "+y);
		System.out.println("******************");
	}
		public static void main (String[] args) {
			// TODO Auto-generated method stub
			Swap();
			vc ref = new vc();
			ref.method1();
			
			
			
	}
		public void method1() {
			int x=20, y=30;
			x=x+y;
			y=x-y;
			x=x-y;
			System.out.println("value of y : "+y);
			System.out.println("value of x : "+x);
		}
}