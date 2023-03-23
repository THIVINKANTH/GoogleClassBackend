package SMSBanking;

public class Kyc 
{
	private String Name;
	private long AccountNumber;
	private double Balance;
	
	
	public Kyc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kyc(String name, long accountNumber, double balance) {
		super();
		Name = name;
		AccountNumber = accountNumber;
		Balance = balance;
	}
	@Override
	public String toString() {
		return "Kyc [Name=" + Name + ", AccountNumber=" + AccountNumber + ", Balance=" + Balance + ", getName()="
				+ getName() + ", getAccountNumber()=" + getAccountNumber() + ", getBalance()=" + getBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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
