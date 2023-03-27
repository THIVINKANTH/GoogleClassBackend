package CreditCard;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CreditCardProcess implements Runnable,CreditEvents
{
	File file=new File("D:\\JavaConsoleFile\\CreditCardDetails.doc");
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	FileInputStream fis=null;
	ObjectInputStream ois=null;
	ArrayList<CreditCardDetails>details=null;//new ArrayList<CreditCardDetails>();
	Scanner scan=new Scanner(System.in);
	public void CreateCard() throws IOException
	{
		fos=new FileOutputStream(file);
		oos=new ObjectOutputStream(fos);
		oos.writeObject(details);
		oos.close();
		fos.close();	
	}
	public void ReadCard() throws IOException, ClassNotFoundException
	{
		fis=new FileInputStream(file);
		ois=new ObjectInputStream(fis);
		details=(ArrayList<CreditCardDetails>)ois.readObject();
		ois.close();
		fis.close();
	}
	public CreditCardProcess()
	{
//		try
//		{
//			fos=new FileOutputStream(file);
//			oos=new ObjectOutputStream(fos);
//			oos.writeObject(details);
//			oos.close();
//			fos.close();
//		}
//		catch (IOException e) 
//		{
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}

	@Override
	public String NewCreditCard(CreditCardDetails creditcard) 
	{
		try 
		{
			ReadCard();
			details.add(creditcard);
			CreateCard();
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		return creditcard.getCardPin()+""+"has added Successfully";
	}

	@Override
	public void LoginExistingCard(String cardpin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Transaction() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int BillList() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int BillPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String CancelCard(String pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	synchronized public void run() 
	{
		System.out.println("Welcome to Zealous Credit Card Service\n"+Thread.currentThread().getName());
		do
		{
			System.out.println("Which Process you want\n 1.Apply New Credit Card\n 2.Login Card\n 3.Transaction\n 4.BillList\n 5.BillPay\n 6.CancelCard");
			int key=scan.nextInt();
			switch (key) 
			{
			case 1:
				System.out.println("Enter your Details");
				System.out.println("Enter Card Number, Enter your Pin, Enter Your Card limit");
				CreditCardDetails card=new CreditCardDetails(scan.nextLong(), scan.next(), scan.nextInt());
				System.out.println(NewCreditCard(card));
				break;

			default:
				break;
			}
			
		}
		while(true);
	}
	
}
