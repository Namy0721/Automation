package interface100;


interface Grandfather{
void print();
}

interface Father{
void print();
}

class Child implements Grandfather,Father{
public void print() {
System.out.println("We are a family");
}

}

public class MultiplaeWithSameMethodName {

public static void main (String [] args){
Child obj1 = new Child();
obj1.print();

Father obj2 = new Child();
obj2.print();

Grandfather obj3 = new Child();
obj3.print();
}

}
