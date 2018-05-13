package Output;

import Datastore.DataStore;

public class RejectMsg1 extends RejectMsg {
	public RejectMsg1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// Prints the reject msg when the credit card is not accepted.
	@Override
	void RejectMsg() {
		// TODO Auto-generated method stub
		System.out.println("\t Credit Card Not Approved.");
		System.out.println();
	}
}
