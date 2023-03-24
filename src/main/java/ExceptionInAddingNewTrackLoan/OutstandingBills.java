package ExceptionInAddingNewTrackLoan;

import java.util.Scanner;

public class OutstandingBills 
{
	Scanner scan=new Scanner(System.in);
	//limit of loan
	String bills[]=new String[10];
	//outstanding loans
	public OutstandingBills()
	{
		bills[0]="Mobile";
		bills[1]="Fridge";
		bills[2]="WashingMachine";
		bills[3]="BikeLoan";
		bills[4]="HomeLoan";
		bills[5]="CarLoan";
		bills[6]="Hospital";
		bills[7]="Hotels";
		bills[8]="AC";
		bills[9]="Laptop";
	}
	public static void main(String[] args) 
	{
		OutstandingBills out=new OutstandingBills();
		
		System.out.println("Select the process\n 1.Apply new Loan");
		int key=out.scan.nextInt();
		switch (key) {
		case 1:
			System.out.println("Enter Which Loan you want");
			String newloan=out.scan.next();
			out.AddnewLoan(newloan);
			break;

		default:
			System.out.println("Oops! Try Aagin");
			break;
		}

	}
	//add new loan method
	public String AddnewLoan(String addloan)
	{
		//exception handle in add new loans
		try
		{
			for(int index=0;index<bills.length;index++)
			{
				if(bills[index]==null)
				{
					bills[index]=addloan;
					return addloan+" "+"Your New Loan added Successfully";
				}
			}
			throw new OutstandingException();
		}
		catch (OutstandingException exe) 
		{
			// TODO: handle exception
			System.out.println(exe);
			System.out.println("Your Current Loans are");
			for(String loan:bills)
			{
				System.out.println(loan);
			}
		
		}
		return addloan+" "+"Your New Loan added Successfully";
	}
}
