package array;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float num3[]= {20.0f,40.0f,80.0f};
System.out.println("Length = " +num3.length);

for (int a = 0;a<num3.length;a++) {
	System.out.println(num3[a]);
	
}
float[] num4 = Arrays.copyOf(num3, 5);
 System.out.println("Length of array = " +num4.length);
 System.out.println("Array element value with index 4 = " +num4[4]);
 System.out.println("******* for loop with condition ********");
 
 for (int c = 0; c<num4.length;c++) {
	// System.out.println("Index : " +c+ " Element : " +num4[c]);
 
	  if (num4[c]==80.0f) {
		 System.out.println("Element 3 with index 2 : "  +num4[c]);
		 break;
		  }
	 else {
		 System.out.println("Index : " +c+ "Element : " +num4[c]);
	 }
 }

 System.out.println("***************************");
 
 num4[4] = 66.99f;
   num4 [3] = 99.99f;
   System.out.println("Array value : " +num4[4]);
   System.out.println("Array value of index 3 : " +num4[3]);
   System.out.println("Length : " +num4.length);
   System.out.println("****with for loop**********");
   
   for (int d = 0;d<num4.length;d++) {
	   System.out.println("Element : " +num4[d]+ " Index : " +d);
	   
   }
   
   System.out.println("********For Each loop************");
//   for (float i :num4) {
//	   System.out.println(i);
//	   if(i==66.99) {
//		   System.out.println("Value of index 2 : " +num4);
//		   break;
//		    }
//	   else {
//		   System.out.println("Element : " +num4);
//   }
 }
	}



