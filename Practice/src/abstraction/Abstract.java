package abstraction;

abstract class Egg{
abstract void display();
void food (int temp){
System.out.println("Hard boil need temperature : " +temp);
}
}
class temp extends Egg{
void display() {
System.out.println("Eggs belongs to Egitarian family");
}
void food (int temp){
System.out.println("Eggs are combination of egg white and yolk and temperature : " +temp);
super.food(100);
}
void colour(){
System.out.println("Egg white is white in colour and youlk is yellow in colour");
super.food(150);
}
}
 public class Abstract{
 public static void main (String [] args){
 temp obj1 = new temp();
 obj1.display(); // Eggs belongs to Egitarian family 
 obj1.food (60); //Eggs are combination of egg white and yolk and temperature: 60 & Hard boil temperature : 100
 obj1.colour(); // Egg white is white in colour and yolk is yellow in colour & Hard boil need temperatur : 150
 Egg obj2 = new temp();
 obj2.display(); // Eggs belongs to Egitarian family 
 obj2.food(80); //Eggs are combination of egg white and yolk and temperature: 80 & Hard boil temperature : 100
 
 
 }
 }
 
 
 