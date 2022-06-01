package thisStatement;

public class A1 {
   A1(){
	   this(25.36);
	   System.out.println("hello zero");
	   
   }
   A1(double d) {
	   this(15);
	   System.out.println("double " +d);
   }
   A1 (int x) {
	   System.out.println("  int " +x);
	   
   }
   class ThisStatement {
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 A1 a1 = new A1();
 A1 a2 = new A1(23.99);
 A1 a3 = new A1 (40);
	}

}
