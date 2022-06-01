package array;

import java.util.Arrays;

public class PreDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [] =  {12,23,44,56,1,2};
for (int a : array) {
	System.out.println(a);
}
int clone [] = array.clone();
for (int a : clone) {
	System.out.println(a);
}
System.out.println("Are both equal ? ");
System.out.println(Arrays.equals(array, clone));

System.out.println("*****************");

int range[] = Arrays.copyOf(array, array.length);
for (int i : range) {
	System.out.println(i);
}
System.out.println("*********************");

int rangecopy[] = Arrays.copyOfRange(array, 0, 4);
for (int i : rangecopy) {
	System.out.println(i);
}
System.out.println("**********************");
Arrays.sort(array);
System.out.println("After sorting array ");
for (int i : array) {
	System.out.println(i);
}
	}

}
