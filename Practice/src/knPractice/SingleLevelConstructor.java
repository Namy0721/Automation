package knPractice;

class fruit {
	fruit(){
		System.out.println("I belong to vegitarian family");
	}
	void display() {
		System.out.println("I can be  eaten raw");
	}
}
class apple extends fruit{
	apple(){
		//super()
		System.out.println("I belong to fruit family");
	}
	void eat() {
		System.out.println("An apple a day keeps the dotors away.");
	}
}
public class SingleLevelConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
fruit obj1 = new fruit();
System.out.println("************Print for refrence obj1*************");
obj1.display();
apple obj2 = new apple();
System.out.println(":::::::::Print for refrence obj2:::::::::::::");
obj2.display();
obj2.eat();
fruit obj3 = new apple();
System.out.println("<<<<<<<<<<Print for refrence obj3 for object apple with zero parameterized constructor>>>>>>>>>");
obj3.display();


	}

}
