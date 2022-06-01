package Oprators;

public class unaryoprators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0 , b;
b=a++ + ++a + ++a + a;
//b= (0) + (1 + 1) + (2 + 1) + 3;
System.out.println(a); // 3
System.out.println(b); // 8

a= -5;
b= a-- + --a + --a + a;
//b= (-5) + (-1 + -6) + (-7 +-1) + (-8);
System.out.println("a: "+a); //(-8)
System.out.println("b: "+b);// (-28)

a=21;
b= --a + --a + --a + a + ++a + a++;
// b = (-1+21) + (-1 +20) + (-1 + 19) + (18) + (1+18) + (19+1)
System.out.println(a);// (20)
System.out.println(b);//(113)

a=-2;
b=a-- + a + ++a + a++ + ++a + a++ + a;
//b = (-2) + (-1 + -2) + (-3+1) + (-2)+(1+ -2 +1) + 0 + (0+1);
//b=(-2) + (-3) + (-2) + (-2) + (-1+1) + (0) (0+1); 
System.out.println(a);// 1
System.out.println(b); // (-8)



	}

}
