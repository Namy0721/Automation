package constructor;

public class ClassMethodOverloading {
void msg(int x,int y) {
	System.out.println("Hello Java");

	
}
}
class SubClass{
	void msg (double x, double y) {
		System.out.println("Welcome you in java ");
	}
	}
 class SuperClass{
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassMethodOverloading ref = new ClassMethodOverloading();
      ref.msg(23, 23);
      ref.msg(22,56);
      SubClass obj = new SubClass();
      obj.msg(21.00, 23.88);
      obj.msg(4.90, 34.8);
	}

}
