package constructor;

public class ConOverloading {

	double sum (int g, int h) {
	System.out.println(g+h);
	return (g+h);
	
}
	double sum (int g,double h, int f) {
		System.out.println(g+h+f);
		return (g+h+f);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ConOverloading obj = new ConOverloading();
 obj.sum(21,45);
 obj.sum(123,234.56,345);
	}

}
