package abstraction;


abstract class Vehical{
abstract void car ();
}

class Inova extends Vehical{
void car(){
System.out.println("I have 4 wheels");
}
}
class Ertiga extends Vehical{
void car(){
System.out.println("I belong to car family");
}
}
public class Hierarchy {
public static void main (String [] args) {
Vehical obj1 = new Inova();
obj1.car(); // I have 4 wheels
Vehical obj2 = new Ertiga();
obj2.car(); // I belong to car family


}
}

