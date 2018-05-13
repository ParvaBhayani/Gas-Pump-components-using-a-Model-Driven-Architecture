package Output;

import Datastore.DataStore;

public class setIniVal1 extends setIniVal
{
	public setIniVal1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	
// Responsible to set the initial gallon pumped to 0 and also the total amount to 0.
	@Override
	void setInitVal() {
		// TODO Auto-generated method stub
		ds.setG(0);
		ds.setTotal1(0);
		
	}
}
