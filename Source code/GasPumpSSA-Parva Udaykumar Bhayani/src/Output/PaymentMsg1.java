package Output;

import Datastore.DataStore;

public class PaymentMsg1 extends PaymentMsg
{
	public PaymentMsg1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void PaymentMsg() {
		// TODO Auto-generated method stub
	        System.out.println("\t Pay By Credit or Pay By Debit");
	        System.out.println();
	}
}
