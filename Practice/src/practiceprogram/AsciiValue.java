package practiceprogram;

public class AsciiValue {

	
 public void abc () {
	 char i = 'A';
	 int j = i;
	 for (; i <= 'z'; i++) {
	System.out.println(i+"="+j);
	j++;
 }
 }
	
public static void main(String[] args) {
	// TODO Auto-generated method stub	 
	AsciiValue obj = new AsciiValue();
	obj.abc();
}
	}

