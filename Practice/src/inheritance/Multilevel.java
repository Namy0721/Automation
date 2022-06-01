package inheritance;

class fourwheeler1{
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
}
	
	class car extends fourwheeler1 {
		public void type() {
		System.out.println("I m Car ");
	}
	}
		class maruti extends car{
			public void company() {
				System.out.println("I m maruti");
			}
		}


public class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maruti obj1 = new maruti();
		obj1.company();
		obj1.type();
		obj1.wheels();

	}
}


