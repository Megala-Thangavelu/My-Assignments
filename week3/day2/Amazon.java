package week3.day2;

public class Amazon extends CanaraBank  {
	
	
	@Override
	public void cashOnDelivery() {
		System.out.println("Mode of payment is Cash On Delivery");
	}

	@Override
	public void upiPayments() {
		System.out.println("Mode of payment is Upi Payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("Mode of payment is Card Payment");		
	}

	@Override
	public void internetBanking() {
		System.out.println("Mode of payment is Internet Banking");
		
	}


public static void main(String[] args) {
	
	Amazon obj=new Amazon();
	obj.cardPayments();
	obj.cashOnDelivery();
	obj.internetBanking();
	obj.upiPayments();
	
}
}