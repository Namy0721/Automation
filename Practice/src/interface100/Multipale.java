package interface100;


interface car{
void dispaly ();// public abstract 
}

interface wheels{
void property ();
}

class inova implements car,wheels {
public void dispaly() {
System.out.println(" I am a car");
}
public void property(){
System.out.println("I have 4 wheels");
}
}



public class Multipale {
	public static void main (String []args){
		inova obj1 = new inova();
		obj1.dispaly();
		obj1.property();

		wheels obj2 = new inova();
		obj2.property();

		car obj3 = new inova();
		obj3.dispaly();
		}

}
