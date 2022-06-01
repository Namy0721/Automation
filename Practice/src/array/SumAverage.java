package array;

public class SumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num6[] = {10,20,30,-40,-50,-60,70,80,90,99};
double sum = 0;
double avg = 0;
System.out.println("Length : " +num6.length);

for (int i = 0; i<num6.length; i++ ) {
	sum = num6[i]+sum;
	 }
System.out.println("Sum : " +sum);

avg = sum/num6.length;
System.out.println ("Average : " +avg);

//for (int i : num6) {
//	sum = i+sum;
//	}
//System.out.println ("Sum using for each : " +sum);
//	}

}
}