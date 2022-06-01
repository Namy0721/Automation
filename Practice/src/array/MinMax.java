package array;

public class MinMax {

	static void display (int array[]) {
		int min = array[0];
		//min = 3
		
		for (int i = 1 ; i < array.length ; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("Minimum :  " +min);
	}
	static void extream(int rry[]) {
		int max = rry[0];
		for (int f = 1; f<rry.length;f++) {
			if(max < rry[f]) {
				max = rry[f];
			}
		}
		System.out.println("Maximum : " +max);
	}
	public static void main(String[] args) {
	int a[] = {10,20,99,80,30,91,1};
	MinMax.display(a);
	extream(a);
		// TODO Auto-generated method stub

	}

}
