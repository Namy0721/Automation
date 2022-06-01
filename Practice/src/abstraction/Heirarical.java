package abstraction;

abstract class RBI{
abstract double roi();
final void statement() {
System.out.println("As per the RBI");
}
}

class Idbi extends RBI{
double roi(){
return 6.8;
}
}

class Sbi extends RBI{
double roi(){
return 7.8;
}
}

public class Heirarical{
public static void main(String [] args){
Idbi obj1 = new Idbi();
System.out.println("Rate of intrest of Idbi is : " +obj1.roi()+ " % " ); // 6.8
obj1.statement(); // As per RBI

Sbi obj2 = new Sbi();
System.out.println("Rate of interest of Sbi :  " +obj2.roi()+ " % " ); // 7.8
obj2.statement(); // As per RBI

RBI obj3 = new Idbi();
System.out.println("As per RBI roi of Idbi is : " +obj3.roi()+ "%" ); // 6.8

RBI obj4 = new Sbi();
System.out.println("As per RBI roi of Sbi is : " +obj4.roi()+ " % " ) ; //7.8

}
}


