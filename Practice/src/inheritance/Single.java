package inheritance;

class fruit {
	fruit(){
		System.out.println("fruit class constractor..");
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}

class apple extends fruit{

	apple(){
			//super(); java compiler will write default super()
		System.out.println("Apple class constructor ..");
		
		}
	public void shape() {
		System.out.println("Apple is rond");
	
	}
}
public class Single {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
apple obj = new apple();
obj.taste();
obj.shape();

	}

}
