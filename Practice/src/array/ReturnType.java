package array;

public class ReturnType {

	static int[] array() {
		return new int[] {23,66,77,88,99};
		}
//		or
//		int num[] = new int[3];
//		num[0] = 11;
//		num[1] =23;
//		num[2]=33;
//	return new

		static double array1(){
			return  (10.09+30.99);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] =  ReturnType.array();
		
		for (int i = 0; i<a.length;i++) {
			System.out.println("index : " +i+ " Value = " +a[i] );
		}
			System.out.println("sum = " +array1());
			
		}

	}

