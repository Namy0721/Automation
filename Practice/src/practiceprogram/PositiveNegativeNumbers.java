package practiceprogram;

public class PositiveNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a= -5;
      for (;a<5;a++) {
    	  if (a < 0) {
    		  System.out.println(a+ " is Negative Number");
    	  }
    	  else if (a > 0)
    	  {
    		  System.out.println(a+ " is Positive Number");
    	  }
    	  else {
    		  System.out.println (a+ " is Null ");
    	  }
      }
	}

}
