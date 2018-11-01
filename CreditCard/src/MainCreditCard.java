
public class MainCreditCard 
{

	public static void main(String[] args) 
	{
		CreditCard[] cards = new CreditCard[5];
		
		cards[0] = new CreditCard(123456789, 1000, 0.14, "Mridula");
		cards[1] = new CreditCard(987654321, 1000, 0.14, "Shanker");
		cards[2] = new CreditCard(135797531, 1000, 0.14, "Shruthi");
		cards[3] = new CreditCard(246808642, 1000, 0.14, "Latha");
		cards[4] = new CreditCard(657483920, 1000, 0.14, "Adithi");
		
		int targetAccount = 123456789;
		
		for(CreditCard card: cards)
		{
			if(card.getCardNum() == targetAccount)
				card.charge(300);
		}
 
	}

}
