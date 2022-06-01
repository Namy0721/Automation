package interface100;


interface vijaya{
void print();
}

interface laxhami extends vijaya{
void show();
}

class vijayalaxhamin implements laxhami{
public void print(){
System.out.println(" My full name is vijayalaxhamin");
}
public void show(){
System.out.println("MY first name is vijaya");
}
}

public class ExtendesAndImplements {
	public static void main (String []args){
		vijayalaxhamin obj1 = new vijayalaxhamin();
		obj1.print();
		obj1.show();

		laxhami obj2 = new vijayalaxhamin();
		obj2.show();
		obj2.print();

		vijaya obj3 = new vijayalaxhamin();
		obj3.print();
		}
		}


