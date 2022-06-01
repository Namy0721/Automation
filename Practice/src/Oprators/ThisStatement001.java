package Oprators;

public class ThisStatement001 {
	int rollno;
	float fee;
	ThisStatement001(int rollno) {
		this.rollno = rollno;
	}
	ThisStatement001(int rollno, float fee) {
		this(rollno);// reusing constructor
		this.fee = fee;
	}
	void display() {
		System.out.println(rollno + " " + fee);
	}
}
class ThisStatement3 {
	public static void main(String args[]) {
		System.out.println("**********************Creating S1 object***************************");
		ThisStatement001 s1 = new ThisStatement001(111);//
		System.out.println(s1.rollno + " " + s1.fee);
//	System.out.println("**********************Creating S2 object***************************");
//	ThisStatement001 s2 = new ThisStatement001(112, 6000f);
//	System.out.println(s2.rollno + " " + s2.fee);
//	System.out.println("*****************Display()*************************");
//		s2.display();
	}
}


