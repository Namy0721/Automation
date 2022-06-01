package staticNonstaticGlobalVariables;

class NonstaticOverloading {
	
        int nOverloading (int i, int j) {
    	   int area = i*j*1/2;
    	   System.out.println("****Tringle*****");
    	   System.out.println("Length = " +i);
    	   System.out.println("Widht = "+j);
    	   System.out.println ("Area of traingle = "+area);
    	   return area;
       }
        
        public static void main (String[] args) {
        NonstaticOverloading obj = new NonstaticOverloading();
        obj.nOverloading (100, 89);
        obj.nOverloading(123.98,455);
        obj.nOverloading(1122,334.3f, 234);
        }
      public double nOverloading (double l , long w ) {
    	  double area = l*w;
    	  System.out.println("*****Rectangle******");
    	  System.out.println("Length = " +l);
    	  System.out.println("Width = " +w);
    	  System.out.println("Area of Rectangle = " +area);
		return area;
      }
      private float nOverloading (long l, float w, long h) {
    	  float volume = l*w*h;
    	  System.out.println("*******Cuboid*******");
    	  System.out.println("Length = " +l);
    	  System.out.println("Weidth = " +w);
    	  System.out.println("Height = " +h);
    	  System.out.println("Volume of cuboid = " +volume);
    	  return volume;
      }
}
