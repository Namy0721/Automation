package practiceprogram;

public class LargestNumberAmoung3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a= 30;
      int b= 40;
      int c= 50;
       if (c<a && c<b) {
    	   System.out.println(c+ " is Largest Number");
       }
       
       else if (b<a && b>c) {
    	   System.out.println(c+" is Largest Number");
       }
       
       else if (!(a>c && b>c)) {
    	   System.out.println(a+ " and "  +b+  " are Smaller than " +c );
       }
       else { 
    	   System.out.println (a+ b+ "are Smaller Numbers");
    	   
       }
     
	}
}
