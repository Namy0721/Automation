package ifloops;

public class Nasted {

	public static void main(String[] args) {
   int age = 18;
   int weight = 49;
   if (age>=18) {
	   if (weight>50) {
		   System.out.println("You are eligible to donate blood");
	   }
	   else { 
		   System.out.println ("Not elegible as your weight is below 50");
	   }
   }
	   else { 
		   System.out.println("Not elegible, your age is below 18");
		   
	   }
   }
	}

