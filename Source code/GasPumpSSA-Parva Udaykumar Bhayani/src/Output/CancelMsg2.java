package Output;

import Datastore.DataStore;

public class CancelMsg2 extends CancelMsg
{
	public CancelMsg2(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//Prints Cancel Message when selection of gas is cancelled.
	// Responsible to print the cancel msg when the Selection for the gas is cancelled.
	@Override
	void CancelMsg() 
	{
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Transaction Cancelled");
	}
}
