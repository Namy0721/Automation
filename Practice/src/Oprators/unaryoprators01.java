package Oprators;

public class unaryoprators01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b;
		b = a++ + ++a + ++a +a;
		// b = 0 + (1 +  1 + 0) + (1 +2) +3;
		System.out.println(a);// 3
		System.out.println(b); // 8
		
		a=0;
		b = a-- + --a + --a + a;
		// b = 0 +(-1 -1 +0) + (-1 -2) + (-3);
		System.out.println(a); // (-3)
		System.out.println(b);//(-8)
		
		a=0;
	   b = --a + --a + --a + a + ++a + a++;
	// b = (-1 + 0) + (-1 -1) + (-1  -2) + (-3) + ( 1 -3) + (-2 + 1);
	// b = (-1) + (-2) + (-3) + (-3) + (-2) + (-1);
	   System.out.println(a);// (-1)
	   System.out.println(b); // (-13)
	   
	   a=0;
	   b = a-- + a + ++a + a++ + ++a + a++ +a;
	   //b = 0 + (-1 + 0) + (1 -1) + (0) + (1 + 1 + 0) + (2) + (1 +2);
	   System.out.println(a);// 3
	   System.out.println(b); // 6
	   

	}

}
