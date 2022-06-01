package array;

public class DecleareAndInitilise {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[4];
		num[0]=20;
		num[1]=30;
		num[3]=40;
		
		System.out.println("Length of Array elements = " +num.length);
		System.out.println("Length of array element 2 and Index 1 =  " +num[1]);
		System.out.println(" ********with the help of for loop*******");
		
		for (int i = 0; i < num.length;i++) {
		System.out.println(" value of Array element = " +num[i]+  " with index = " +i);
	}
		
	System.out.println("******************************************");	
		
	double num1[] = {10.20,20.30,30.40,};
	System.out.println("length of array " +num1.length);
	System.out.println("Length of element 2 with intex 1 = " +num1[1]);
	System.out.println(" ************ with for loop************");
	
	for(int f = 0;f<num1.length;f++) {
	System.out.println("Value of array = " +num1[f]+ " index = " +f );
	}

	

}
}