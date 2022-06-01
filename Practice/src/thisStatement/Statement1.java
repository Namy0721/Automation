package thisStatement;

public class Statement1 {
	Statement1(){
		System.out.println("*****ZERO*****");
		
	}
	Statement1(int age){
		this();
		System.out.println("******INT****");
		System.out.println(age);
	}
	Statement1 (char c, double d){
		this(25);
		System.out.println("****CHAR-DOUBLE*****");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Statement1 object = new Statement1('c',215.56);

	}

}
