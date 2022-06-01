package thisStatement;

public class Statement {
    Statement()
    {
    	System.out.println("*******Zero-Parameter********");
    	
    }
   
    Statement(int age)
    { 
        
    System.out.println("*********Int Parameter********");
    System.out.println("Age = " +age);
    }
    void display () 
    {
    	System.out.println("hello");
    }
    Statement(char c, double d)
    {
    	System.out.println("*********Char and Double Parameter********");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Statement object = new Statement();
Statement object2 = new Statement(28);
object2.display();
Statement object3 = new Statement('a',22.76);

	}

}
