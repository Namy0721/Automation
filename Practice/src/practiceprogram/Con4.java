package practiceprogram;

public class Con4 {
	
	int k=10;

  
	public Con4()
  
  {
		
	  
	  System.out.println(k);
	  k=34;

  }
  
  public static void main(String[] args) {
	
	  Con4 c1 = new Con4();
	  Con4 c2 = new Con4 () ;
	  System.out.println("value = "+c2.k);
	  System.out.println("Program start");
	  
	  
  }
 }
