package Output;

import Datastore.DataStore;

public class GasPumpedMsg1 extends GasPumpedMsg
{
	public GasPumpedMsg1(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//Prints Gas pumped message when pump is stopped
	@Override
	void GasPumpedMsg() {
		// TODO Auto-generated method stub
		System.out.println(ds.getG()+" Gallon Pumped");
		System.out.println(ds.getTotal1()+" Toal Price");
		System.out.println();
	}

}
