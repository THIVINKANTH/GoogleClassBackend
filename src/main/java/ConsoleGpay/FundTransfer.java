package ConsoleGpay;

import java.util.Scanner;

public class FundTransfer extends Gpay
{
	Scanner scan=new Scanner(System.in);
	public void transfer(Gpay gpay, int mobile)
	{
		System.out.println("Enter User Name");
		String name=scan.next();
		if(name.matches(gpay.getName()))
		{
			System.out.println("Select your Plan\n 1.Rs 719-3Months 2GB/Day\n 2.Rs 299-28Days 2GB/D");
			int key=scan.nextInt();
			switch (key) 
			{
			case 1:
				System.out.println("Enter Your Upi PIN");
				String pin=scan.next();
				if(pin.matches(gpay.getUpiPin()))
				{
					System.out.println(gpay.getName()+" "+"Mobile Recharge Successfully");
				}
				else {
					System.out.println("Incorrect PIN");
				}
				break;
			case 2:
				System.out.println("Enter Your Upi PIN");
				String pins=scan.next();
				if(pins.matches(gpay.getUpiPin()))
				{
					System.out.println(gpay.getName()+" "+"Mobile Recharge Successfully");
				}
				else {
					System.out.println("Incorrect PIN");
				}
				break;
			default:
				System.out.println("Try Again");
				break;
			}
			
		}
		else {
			System.out.println("Invalued UserName");
		}
	}
	public void transfer(Gpay gpays)
	{
		System.out.println("Enter User Name");
		String name=scan.next();
		if(name.matches(gpays.getName()))
		{
			System.out.println("Select your Entry Trip\n 1.Double Rs450 valid time 12Hours\n 2.Single entry Rs 320");
			int key=scan.nextInt();
			switch (key) 
			{
			case 1:
				System.out.println("Enter Your Upi PIN");
				String pin=scan.next();
				if(pin.matches(gpays.getUpiPin()))
				{
					System.out.println(gpays.getName()+" "+"FasTag Paid Successfully");
				}
				else {
					System.out.println("Incorrect PIN");
				}
				break;
			case 2:
				System.out.println("Enter Your Upi PIN");
				String pins=scan.next();
				if(pins.matches(gpays.getUpiPin()))
				{
					System.out.println(gpays.getName()+" "+"FasTag Paid Successfully");
				}
				else {
					System.out.println("Incorrect PIN");
				}
				break;
			default:
				System.out.println("Try Again");
				break;
			}
			
		}
		else {
			System.out.println("Invalued UserName");
		}
	}


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FundTransfer fund=new FundTransfer();
		Gpay pay=new Gpay("Thivin","thivin@123",100155001234l, 25500);
		System.out.println("Which process you want\n 1.Mobile Recharge\n 2.FasTag Recharge");
		int menu=fund.scan.nextInt();
			switch (menu) 
			{
			case 1:
				fund.transfer(pay,1);
				break;
			case 2:
				fund.transfer(pay);
				break;
			default:
				System.out.println("Thank you");
				break;
			}

	}

}
