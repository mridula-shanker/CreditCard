
public class CreditCard 
{

		private final int CARDNUM;
		private double limit;
		private double balance;
		private double interestRate;
		private String ownerName;
		
		public CreditCard(int cN, double l, double iR, String oN)
		{
			cardNum = cN;
			limit = l;
			interestRate = iR;
			ownerName=oN;
			balance=0;
		}
		
		public void charge(double a)
		{
			if (balance+a<limit)
				balance=balance+a;
		}
		
		public void credit(double b)
		{
			balance = balance - b;
		}
		
		public double chargeInterest()
		{
			balance = balance + (interestRate * balance);
		}
}
