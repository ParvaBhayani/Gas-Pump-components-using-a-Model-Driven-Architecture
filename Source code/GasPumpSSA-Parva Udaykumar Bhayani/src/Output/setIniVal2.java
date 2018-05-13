package Output;

import Datastore.DataStore;

public class setIniVal2 extends setIniVal
{
	public setIniVal2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// Responsible to set the initial gallon pumped to 0 and also the total amount to 0.
	@Override
	void setInitVal() {
		// TODO Auto-generated method stub
		ds.setL(0);
		ds.setTotal2(0);
	}
}
