package encapsulation;

class exex{
	private int pincode;
	private double payment;

	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	
	
}
public class SourceGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exex obj1 = new exex();
		System.out.println(obj1.getPincode());
		System.out.println(obj1.getPayment());
		obj1.setPayment(1234.55);
		System.out.println("Payment : " +obj1.getPayment());
        obj1.setPincode(1233);
        System.out.println("Pincode : " +obj1.getPincode());
	}

}
