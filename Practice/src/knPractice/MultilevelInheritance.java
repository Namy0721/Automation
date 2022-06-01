package knPractice;

class Grandfather{
	void display(){
		System.out.println("I am A Grandfather");
		
	}
}
class Father extends Grandfather{
	void Father01() {
		System.out.println("I am Son of Grandfather");
	}
}

class Child extends Father{
	void Child01() {
		System.out.println("I am son of Father");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj1 = new Child();
		obj1.Child01();
		obj1.Father01();
		obj1.display();
		System.out.println("::::::::::::::::::::::::::");
		
		Father obj2 = new Child();
		obj2.display();
		obj2.Father01();
		System.out.println("::::::::::::::::::::::::::");
		
		Grandfather obj3 = new Child();
		obj3.display();
		System.out.println("::::::::::::::::::::::::::");
		
		Grandfather obj4 = new Father();
		obj4.display();
		System.out.println("::::::::::::::::::::::::::");
		
		
		
		

	}

}
