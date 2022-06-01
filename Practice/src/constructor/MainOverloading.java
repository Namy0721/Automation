package constructor;

public class MainOverloading {
	public static void main(int agrs) {
		System.out.println("Main Methoda with int argument Executing");
		System.out.println(agrs);
	}
	public static void main(char args) {
		System.out.println("Main Method with char argument Executing");
		System.out.println(args);
	}

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
System.out.println("Orignal main Executing");
MainOverloading.main(12);
MainOverloading.main('A');
MainOverloading.main(123445);

	}

}
