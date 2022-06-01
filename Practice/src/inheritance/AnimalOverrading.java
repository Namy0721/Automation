package inheritance;

class Animal {
	
void move() {
	System.out.println("I am an animal");
}
}
class cat extends Animal{
	void move() {
		
System.out.println("I can bark");
}

void tail() {
	System.out.println("I hav a tail");
}
}
public class AnimalOverrading {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Animal obj1 = new  Animal();
obj1.move();
cat obj2 = new cat();
obj2.move();
obj2.tail();
Animal obj3 = new cat();
obj3.move();


	}

}
