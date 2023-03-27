package CreditCard;

public class CreditCardDetails 
{
	private long CardNumber;
	private String CardPin;
	private int CardLimit;
	
	
	public CreditCardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCardDetails(long cardNumber, String cardPin, int cardLimit) {
		super();
		CardNumber = cardNumber;
		CardPin = cardPin;
		CardLimit = cardLimit;
	}
	@Override
	public String toString() {
		return "CreditCardDetails [CardNumber=" + CardNumber + ", CardPin=" + CardPin + ", CardLimit=" + CardLimit
				+ ", getCardNumber()=" + getCardNumber() + ", getCardPin()=" + getCardPin() + ", getCardLimit()="
				+ getCardLimit() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public long getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(long cardNumber) {
		CardNumber = cardNumber;
	}
	public String getCardPin() {
		return CardPin;
	}
	public void setCardPin(String cardPin) {
		CardPin = cardPin;
	}
	public int getCardLimit() {
		return CardLimit;
	}
	public void setCardLimit(int cardLimit) {
		CardLimit = cardLimit;
	}
	
	
	
}
