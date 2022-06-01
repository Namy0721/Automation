package practiceprogram;

public class QuestionNreminder {

	
 public double QueRemi (double a , double b) {
 double reminder = a/b ;
 double question = a%b;
 System.out.println ("Reminder: "+question);
 System.out.println ("Question: "+reminder);
 
return reminder;
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 QuestionNreminder obj = new QuestionNreminder();
	 obj.QueRemi(298.66, 22.22);
	 
 }
 
}
