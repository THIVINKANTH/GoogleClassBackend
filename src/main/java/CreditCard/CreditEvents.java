package CreditCard;

public interface CreditEvents 
{
	public String NewCreditCard(CreditCardDetails creditcard);
	public void LoginExistingCard(String cardpin);
	public String Transaction();
	public int BillList();
	public int BillPay();
	public String CancelCard(String pin);
	
}
