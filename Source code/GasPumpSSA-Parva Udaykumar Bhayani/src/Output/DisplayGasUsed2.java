package Output;

import Datastore.DataStore;

public class DisplayGasUsed2 extends DisplayGasUsed
{
	public DisplayGasUsed2(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// It is responsible to set the liter and calculate the total amount.
	@Override
	void DisplayGasUsed()
	{
		// TODO Auto-generated method stub
		int liter=ds.getL();
		liter=liter+1;	
		ds.setL(liter);
		float total=ds.getGasPrice2()*ds.getL();
		if(ds.getpaytype()==1)
		total = 1.1f*total;
		ds.setTotal2(total);
		System.out.println();
		}
}
