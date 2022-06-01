package array;

public class RowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array [] [] = { {12,23} ,{23,34,45} ,{45,67,88,99} };
System.out.println("Length : " +array.length);

for (int i = 0; i<array.length;i++) {
	for (int j = 0;j<array[i].length;j++) {
	System.out.print(array[i][j]+ " ");
}
	System.out.println();
	}
System.out.println("**********************");
char chararray [] [] = { {'a','b','c','d'} , {'g','h'} , {'o','l','m'} };

for (int i = 0; i<chararray.length;i++) {
	for (int j = 0; j<chararray[i].length;j++) {
		System.out.print(" " +chararray[i][j]);
		
	}
	System.out.println();
}
}
}