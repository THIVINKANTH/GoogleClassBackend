package ConsoleGpay;

public class Gpay 
{
	private String Name;
	private String UpiPin;
	private long AccountNumber;
	private double Balance;
	
	
	public Gpay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gpay(String name, String upiPin, long accountNumber, double balance) {
		super();
		Name = name;
		UpiPin = upiPin;
		AccountNumber = accountNumber;
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Gpay [Name=" + Name + ", UpiPin=" + UpiPin + ", AccountNumber=" + AccountNumber + ", Balance=" + Balance
				+ ", getName()=" + getName() + ", getUpiPin()=" + getUpiPin() + ", getAccountNumber()="
				+ getAccountNumber() + ", getBalance()=" + getBalance() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUpiPin() {
		return UpiPin;
	}
	public void setUpiPin(String upiPin) {
		UpiPin = upiPin;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	
	
}
