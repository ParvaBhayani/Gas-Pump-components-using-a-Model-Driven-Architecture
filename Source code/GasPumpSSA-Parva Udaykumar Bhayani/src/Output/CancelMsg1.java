package Output;

import Datastore.DataStore;

public class CancelMsg1 extends CancelMsg
{
	public CancelMsg1(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//Prints Cancel Message when transaction is cancelled.
	@Override
	void CancelMsg() 
	{
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Transaction is Cancelled.");
	}
}
