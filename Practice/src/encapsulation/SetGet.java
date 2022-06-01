package encapsulation;

class Employee {
private int salary = 450000;
private double EmpId = 123.45;

public int getSalary(){
return salary;
}

public double getEmpId(){
return EmpId;
}

public void setSalary (int salary){
this.salary = salary;
}

public void setEmpId(double EmpId){
this.EmpId = EmpId;
}
}
public class SetGet {
public static void main (String []args) {
Employee obj1 = new Employee();
 System.out.println("Salary : " +obj1.getSalary());
 System.out.println("Employee id : " +obj1.getEmpId());
 
 obj1.setSalary(5451233);
 obj1.setEmpId(234.65);
 System.out.println("Salary : " +obj1.getSalary());
 System.out.println("Employee id : " +obj1.getEmpId());

 Employee obj2 = new Employee();
  System.out.println("Salary : " +obj2.getSalary());
 System.out.println("Employee id : " +obj2.getEmpId());
 
 Employee obj3 = new Employee();
 obj3.setEmpId(5555.55);
 System.out.println("Employee id : " +obj3.getEmpId());
 obj3.setSalary(3455531);
 System.out.println( "Salary : " +obj3.getSalary());
 
 Employee obj4 = new Employee();
 obj4.setEmpId(12333.90);
 obj4.setSalary(23334454);
 
 }
 }
 

