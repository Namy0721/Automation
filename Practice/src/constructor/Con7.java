package constructor;

public class Con7 {
 int i = 10;
 Con7(){
	 System.out.println ("value of i " +i);
	 System.out.println("Running CLASS Con7 Constrctor..");
	 
i=23;

 }
 class B {
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Main class beings...");
Con7 c2 = new Con7();
System.out.println("Class B global variable i = " +c2.i);
System.out.println("***************");
Con7 c3 = new Con7();
System.out.println("Class con7 variable i = " +c3.i);


	}

}
