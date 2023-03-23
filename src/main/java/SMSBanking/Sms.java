package SMSBanking;

import java.util.Scanner;

public class Sms extends Kyc implements Transaction 
{
	Scanner scan=new Scanner(System.in);
	public void SmsSend(Kyc send)
	{
		System.out.println("Debited Message");
		System.out.println("Zealous Bank Alert *INR"+send.getBalance()+"is the Accout Balance in\n AC"+send.getAccountNumber());
	}
	public static void main(String[] args) 
	{
		Sms sms=new Sms();
		Kyc kyc=new Kyc("Thivin", 1001550054231l, 25500);
		System.out.println("Which Process you want\n 1.Balance Enquriy\n 2.Recharge\n 3.Book Ticket");
		int key=sms.scan.nextInt();
		switch (key) 
		{
		case 1:
				sms.BalanceEnquriy(kyc.getBalance());
			break;
		case 2:
			System.out.println("Select Recharge Type\n 1.Mobile Recharge\n 2.Tv Recharge");
			int recharge=sms.scan.nextInt();
			switch (recharge) {
			case 1:
				System.out.println("RS719 3months 2GB/D");
				System.out.println("Give a Confirmation (yes or no)");
				String confirm=sms.scan.next();
				if(confirm.equalsIgnoreCase("yes"))
				{
					sms.Recharge(kyc.getName());
					sms.SmsSend(kyc);
				}
				else {
					System.out.println("Thank you");
				}
				break;
			case 2:
				System.out.println("RS210 3months 2GB/D");
				System.out.println("Give a Confirmation (yes or no)");
				String confirm1=sms.scan.next();
				if(confirm1.equalsIgnoreCase("yes"))
				{
					sms.Recharge(kyc.getName());
					sms.SmsSend(kyc);
				}
				else {
					System.out.println("Thank you");
				}
				break;
			default:
				System.out.println("Oops! Try Again");
				break;
			}
			break;
		case 3:
			sms.BookTicket();
			sms.SmsSend(kyc);
			break;

		default:
			break;
		}
	}

	@Override
	public void BalanceEnquriy(double balance) 
	{
		// TODO Auto-generated method stub
		System.err.println("Enter Balance Enquriy Number 1901");
		int number=scan.nextInt();
		if(number==1901)
		{
			System.out.println("Your Account Balance"+" "+balance);
		}
		else {
			System.out.println("Invalued Balance Enquriy Number");
		}
		
	}

	@Override
	public void Recharge(String name) 
	{
		// TODO Auto-generated method stub
		System.err.println("Enter Recharge Code Number 2245");
		int number=scan.nextInt();
		if(number==2245)
		{
			System.out.println("Your Recharge Successfully"+" "+name);
		}
		else {
			System.out.println("Invalued Recharge Number");
		}
		
	}

	@Override
	public void BookTicket() 
	{
		// TODO Auto-generated method stub
		System.out.println("\n1.Bus Ticket\n 2.Train Ticket");
		int ticket=scan.nextInt();
		switch (ticket)
		{
		case 1:
			System.out.println("Bus Ticket Salem to Bangalore Rs.850");
			System.out.println("give a Confirmation (yes or no)");
			String ticket1=scan.next();
			if(ticket1.equalsIgnoreCase("yes"))
			{
				System.out.println("Your Ticket is Booked");
			}
			else {
				System.out.println("Thank you");
			}
			break;
		case 2:
			System.out.println("Train Ticket Salem to Bangalore Rs.450");
			System.out.println("give a Confirmation (yes or no)");
			String ticket2=scan.next();
			if(ticket2.equalsIgnoreCase("yes"))
			{
				System.out.println("Your Ticket is Booked");
			}
			else {
				System.out.println("Thank you");
			}
			break;

		default:
			System.out.println("Oops! Try Aagin");
			break;
		}
	}

}
