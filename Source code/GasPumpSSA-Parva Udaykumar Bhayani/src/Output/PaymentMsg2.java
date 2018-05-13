package Output;

import Datastore.DataStore;

public class PaymentMsg2 extends PaymentMsg
{
	public PaymentMsg2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	void PaymentMsg() {
		// TODO Auto-generated method stub
		System.out.println("\n\t Pay By Credit or Pay By Cash");
		System.out.println();
	}
}
