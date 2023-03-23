package LoanRequest;

import java.util.Scanner;

public class LoanProcess extends CustomerDetails
{
	public void display()
	{
		if(getCibil()==750)
		{
			System.out.println(getCustomerName()+" "+"your Loan is Approved");
		}
		else
		{
			System.out.println(getCustomerName()+" "+"Oops! Sorry your loan is not Approved Cibil Rejected");
		}
	}
	public static void main(String[] args) 
	{
		CustomerDetails customer=new CustomerDetails();
		Scanner scan=new Scanner(System.in);
		LoanProcess loan= new LoanProcess();
		do
		{
			System.out.println("Welcome to Zealous Bank\n which Process you want\n 1.Apply for Loan\n 2.Exit");
			int menu=scan.nextInt();
			switch (menu) 
			{
			case 1:
				System.out.println("Place Enter your name, pan number , aadhar number, Profession, Cible Score, Contact");
				customer=new CustomerDetails(scan.next(), scan.next(), scan.nextLong(), scan.next(), scan.nextInt(), scan.nextLong());
				loan.display();
				break;
			default:
				System.out.println("Thank you");
				break;
			}
		}
		while(true);

	}

}
