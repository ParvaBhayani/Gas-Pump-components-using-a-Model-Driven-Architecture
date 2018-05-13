package Output;

import Datastore.DataStore;

public class StoreAmt2 extends StoreAmt
{
	public StoreAmt2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// Responsible to store the cash value.
	@Override
	void StoreAmt() {
		// TODO Auto-generated method stub
	    float amt = ds.getAmt();
        ds.setAmt(amt);
        System.out.println();
	}

}
