package Output;

import Datastore.DataStore;

public class GaspumpedMsg2 extends GasPumpedMsg
{
	public GaspumpedMsg2(DataStore ds) 
	{
	super(ds);
	// TODO Auto-generated constructor stub
}

//Prints gas pumped message when pump is stopped.

@Override
void GasPumpedMsg() {
	// TODO Auto-generated method stub
	System.out.println(ds.getL()+" Liter Pumped");
	System.out.println(ds.getTotal2()+" Toal Price");
	System.out.println();
	}

}
