
interface Payment {

	void pay(double amount);
	
	 void refund(double amount);
}

 class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("you paid from credit card "+ amount);
		
	}

	@Override
	public void refund(double amount) {

		System.out.println("your refund from credit card "+ amount);
		
	}

	

}
 class PayPalPayment implements Payment {

		
	@Override
	public void pay(double amount) {
		System.out.println("you paid from PayPal "+ amount);
		
	}

	@Override
	public void refund(double amount) {

		System.out.println("your refund from Paypal "+ amount);
		
	}
}

public class Main1 {
	public static void main(String [] args) {
	
		CreditCardPayment cp = new CreditCardPayment();
		cp.pay(250);
		cp.refund(50);

		PayPalPayment pp = new PayPalPayment();
		pp.pay(500);
		pp.refund(100);
	}

}
