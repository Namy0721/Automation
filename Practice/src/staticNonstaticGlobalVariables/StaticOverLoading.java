package staticNonstaticGlobalVariables;

 class StaticOverLoading {
	 
	 private static double sOverloading (double num1 , float num2) {
		  double sum = num1+num2;
		  System.out.println("*******Double,Float*************");
		  System.out.println("Number1 = " +num1);
		  System.out.println("Number2 = " +num2);
		  System.out.println("Addition of Two Numbers = " +sum);
		  
		  		  return sum;
	 }

	public static void main(String[] args) {
		StaticOverLoading.sOverloading(123456,7890f);
		StaticOverLoading.sOverloading(987600,986540f);
		 sOverloading();
		 sOverloading(128,16345,32332,643422);
		 

	}
 static int sOverloading () {
	 System.out.println("*****Parameter Not Mention******");
	 System.out.println ("Static overloading Method");
	 return 0;
 }
	private static long sOverloading (long a, int b, int c, long d) {
		long sum = a+b+c+d;
		System.out.println("*****Long,Int,Int,Long******");
		System.out.println("Sum of sOverloading in long datatype = " +sum);
		return sum;
	}
		
 }
 

