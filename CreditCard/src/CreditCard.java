
public class CreditCard 
{

		private final int CARD_NUM;
		private double limit;
		private double balance;
		private double interestRate;
		private String ownerName;
		
		public CreditCard(int cN, double l, double iR, String oN)
		{
			CARD_NUM = cN;
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
		
		public void chargeInterest()
		{
			balance = balance + (interestRate * balance);
		}
		
		public int getCardNum()
		{
			return CARD_NUM;
		}
		
		public double getLimit()
		{
			return limit;
		}
		
		public double getBalance()
		{
			return balance;
		}
		
		public double getInterestRate()
		{
			return interestRate;
		}
		
		public String getOwnerName()
		{
			return ownerName;
		}
		
		public String toString()
		{
			return " Card Number: " + CARD_NUM + " Name: " + ownerName + " Balance: " + balance + " Rate: " + interestRate + " Limit: " + limit;
		}
	
}
