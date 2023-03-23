package LoanRequest;

public class CustomerDetails 
{
	private String CustomerName;
	private String Pan;
	private long Aadhar;
	private String Profession;
	private int Cibil;
	private long Contact;
	
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(String customerName, String pan, long aadhar, String profession, int cibil, long contact) {
		super();
		CustomerName = customerName;
		Pan = pan;
		Aadhar = aadhar;
		Profession = profession;
		Cibil = cibil;
		Contact = contact;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getPan() {
		return Pan;
	}
	public void setPan(String pan) {
		Pan = pan;
	}
	public long getAadhar() {
		return Aadhar;
	}
	public void setAadhar(long aadhar) {
		Aadhar = aadhar;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public int getCibil() {
		return Cibil;
	}
	public void setCibil(int cibil) {
		Cibil = cibil;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
}
