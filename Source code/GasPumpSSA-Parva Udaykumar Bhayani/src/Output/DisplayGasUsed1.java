package Output;

import Datastore.DataStore;

public class DisplayGasUsed1 extends DisplayGasUsed
{
	public DisplayGasUsed1(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//It is responsible to set the gallon and calculate the total amount.
	@Override
	void DisplayGasUsed() 
	{
		// TODO Auto-generated method stub
		int gallon=ds.getG();
		gallon=gallon+1;
		ds.setG(gallon);
		//calculate total
		float total=ds.getGasPrice1()*ds.getG();
		
		ds.setTotal1(total);
		System.out.println();
		
		//System.out.println(ds.getGasPrice2());
	}

}
