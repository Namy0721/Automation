package interface100;


interface Bank{
float roi(); // public abstract 
}

class Axis implements Bank{
public float roi(){
return 6.56f;
}
}

class Icici implements Bank{
public float roi(){
return 7.84f;
}
}

public class Hierarical {
public static void main (String[] args) {
Axis obj1 = new Axis();
System.out.println (" Rate of interest of Axis = " +obj1.roi());


Icici obj2 = new Icici();
System.out.println("Rate of interest of ICICI = " +obj2.roi());

Bank obj3 = new Axis();
System.out.println("AS per bank roi of Axis = " +obj3.roi());
//obj3.roi();

Bank obj4 = new Icici();
System.out.println("AS per bank roi of ICICI = " +obj3.roi());
//obj4.roi();
}
}



