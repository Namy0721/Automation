package thisStatement;

public class Statement001 {
Statement001()
{
	this('c',25.38); 
	
	System.out.println("**********Zero Parameter****");
}
Statement001 (int age)
{
	System.out.println("*********Int Parameter*********");
	
}
Statement001(char c, double d )
{
	System.out.println("****Char Double Parameter");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Statement001 object = new Statement001();

	}

}
