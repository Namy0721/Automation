package interface100;

interface We{
void display ();
default void he (){
System.out.println("He is a gender expression for male");
}
static int age (int x){
return x*x*x;
}
}
class boys implements We{
public void display(){
System.out.println("Boys are theyounger version of male");
}

}

public class JDK8NewUpdate {
	public static void main (String []args){
		boys obj1 = new boys();
		obj1.display();
		obj1.he();
		System.out.println("Age : " +We.age(7));
		}
		}
