package interface100;


interface Animals{
int age = 50; // public static final variable by default
void display(); // public abstract method by default
}

class Rat implements Animals{
public void display(){
System.out.println("I belong to Animal kingdom");
}
}

class Mouse implements Animals{
public void display(){
System.out.println("I m similar to Rat");
}
}
public class Impliments {

public static void main (String[] args) {
Rat obj1 = new Rat();
obj1.display();

System.out.println (Animals.age+ " = Rat age");

Mouse obj2 = new Mouse();
obj2.display();
System.out.println("Mouse age = " +Animals.age);
}

}


