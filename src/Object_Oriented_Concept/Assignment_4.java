package Object_Oriented_Concept;

public class Assignment_4 {
	Assignment_4(){}
		
	public abstract class Payment 
	{
		protected double cash;
		Payment(double val) 
		{
				this.cash = Math.round(val*100)/100.0;
			}
		public double getcash() 
		{
				return cash;
			}
		public void setcash(double newval) 
		{
				this.cash = newval;
			}
		public void paymentDetails() 
		{
				System.out.println("The payment of cash: $" +this.cash);
			}
		}
	
	public class CashPayment extends Payment
	{

		CashPayment(double val) 
		{
			super(val);
		}

		public void paymentDetails()
		{
			System.out.println("The payment of cash:  $" + this.cash);
		}
	}
	
	public class CreditCardPayment extends Payment 
	{

		public String name, expDate, number;

		CreditCardPayment(double value, String name, String expDate, String number) 
		{
			super(value);
			this.number = number;
			this.expDate = expDate;
			this.name = name;
		}

		public void paymentDetails() {
		System.out.println("The payment of $" + this.cash + " through the card " + this.number
	        + ",  and expire date "	+ this.expDate + ", and the owner name: " + this.name + ".");
		}

	}
	
	public static void main(String[] args) 
	{
		Assignment_4 a=new Assignment_4();
	CreditCardPayment x = a.new CreditCardPayment(2.12, "Pavitra","11/11", "************1234");

			CashPayment p = a.new CashPayment(20.03);

	CreditCardPayment y = a.new CreditCardPayment(11.22, "Srikanth","11/11","1234567891");

			CashPayment q = a.new CashPayment(55.12);
			
			x.paymentDetails();
			p.paymentDetails();
			y.paymentDetails();
			q.paymentDetails();
		}
		
	
	

}
