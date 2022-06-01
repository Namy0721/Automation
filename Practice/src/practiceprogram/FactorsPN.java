package practiceprogram;

public class FactorsPN {

	public void Positive(int a) {
		System.out.println("Positive Factors");
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
            System.out.println("value: " +i);
            
			}

		}
		System.out.println();
	}
	public void Negative (int x) {
		System.out.println("Negative Factors");
		for(int i = -1; i>=x;i--) {
			if (x % i==0) {
				System.out.println("Value: " +i);
			}
		}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
   FactorsPN ref = new FactorsPN();
   ref.Positive(68);
   ref.Negative(-24);
	}
	
		
		
	}
	
