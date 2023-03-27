package CreditCard;

public class ZealousBank {

	public static void main(String[] args) 
	{
		CreditCardProcess process=new CreditCardProcess();
		Thread th=new Thread(process,"Zealous");
		th.start();

	}

}
