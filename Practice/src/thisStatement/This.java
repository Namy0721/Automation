package thisStatement;

public class This {
 int a;
 int b;
 
 
	 This(int a, int b)
	 {
 this.a=a;
 this.b=b;
 }
 void display()
 {
	 System.out.println("a= " +a+ "b=" +b);
	 }
 public static void main(String[] args)
 {
	 This object = new This(10,20);
	 object.display();
	 System.out.println(object.a+ " " +object.b);
	 This object2 = new This(120,201);
	 object2.display();
	 System.out.println(object.a+ " " +object.b);
	 
	 
 }
 
 
		 
}
