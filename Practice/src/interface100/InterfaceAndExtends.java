package interface100;

interface zzz {
float age = 100.89f;
void display ();
void show();
}
interface Animals01 extends zzz{
void living ();

}

class Omniverous implements zzz{
public void display() {
System.out.println("Omniverous eats both animals and plants");
}
public void show(){
System.out.println("They hunt for food");
}
}

class Carniverous extends Omniverous{
 public void dispaly() {
 System.out.println("Carniverous eats only plants");
 }
 public void living (){
 System.out.println("Animals are free living ");
 }
}
public class InterfaceAndExtends{
	public static void main (String []rgs) {
		Omniverous obj1 = new Omniverous();
		obj1.display();
		obj1.display();
		Carniverous obj2 = new Carniverous();
		obj2.dispaly();
		obj2.show();
		obj2.living();
	}
	}