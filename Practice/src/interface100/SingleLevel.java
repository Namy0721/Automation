package interface100;


interface Nonliving{
int age = 3456666; // public static final variable
void display();// public abstract method
void show() ;// public abstract method 
}

class Chair implements Nonliving{
public void display()
{
System.out.println("I am a non living thing");
}
public void show()
{
System.out.println("I dont inhale oxgane");
}
}

public class SingleLevel {
	public static void main (String []args){
		Chair obj1 = new Chair();
		obj1.display();
		obj1.show();
		System.out.println(" Non livng can live as long as " +Nonliving.age);
		}
}


