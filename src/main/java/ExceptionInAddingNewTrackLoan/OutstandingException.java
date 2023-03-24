package ExceptionInAddingNewTrackLoan;

public class OutstandingException extends Exception
{
	//user defined Exception for outstanding loans
	public OutstandingException()
	{
		super("could you please Paid Your Outstanding Loans you have reached maximum number of Loans");
	}
}
