package array;

public class MultiDimenstion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrya [] [] = new int [3][3];
		System.out.println("Length = " +arrya.length);
		//System.out.println(" Lenght of [2][3] : " +arrya[2][3]);
		
		for (int i = 0; i<arrya.length; i++) {
			for (int j = 0; j<arrya[i].length;j++) {
				//System.out.println("Row : " +arrya[i]+ "column : " +arrya[j]);
				System.out.print(arrya[i][j]+ " ");
			}
			System.out.println();
		}
		 
		arrya [0] [0] = 13;
		arrya[0][1] = 14;
		arrya[0][2]=15;
		arrya[1][0]=16;
		arrya[1][1]=18;
		arrya[1][2]=19;
		arrya[2][0]=20;
		arrya[2][1]=21;
		arrya[2][2]=22;
	System.out.println("*************************");	
		for (int i = 0;i< arrya.length;i++) {
		for (int j = 0; j<arrya.length;j++) {
			System.out.print(" " +arrya[i][j]);
		}
		System.out.println();
		}
	}

}
