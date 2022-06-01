package staticNonstaticGlobalVariables;

 class MethodNonStatic {
	 
	 /* Default : Access Modifier
	  * Non Static : Non Access Modifier
	  * Double : Return Type
	  * Method : Method Name
	  (double r,int t, double p) : Argument,Parameter */
 
	 double method (double r, int t, double p) {
		 double si = r*t*p/100;
		 System.out.print("Rate = " +r);
		 System.out.println("Time = " +t);
		 System.out.println("Principal = " +p);
		 System.out.println("Simple Interest = " +si);
		 System.out.println("**********New Numbers*******");
		 return si;
		
	}
		 
	public static void main(String[] args) {
		MethodNonStatic ref = new MethodNonStatic();
          ref.method(3,4,123.45);
          ref.method(87.3,4 , 7655.00);
          ref.method(12.90, 3, 98777.0);
          

	}

}
