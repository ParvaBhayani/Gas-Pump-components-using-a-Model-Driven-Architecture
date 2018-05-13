package Output;

import Datastore.DataStore;

public class StopMsg2 extends StopMsg
{
	public StopMsg2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//Prints the stop msg when the pump is stopped.
	@Override
	void StopMsg() {
		// TODO Auto-generated method stub
		
		System.out.println("Pump is Stopped.");
    	System.out.println("Choose the following: 12) Receipt 13)No Receipt");
    	System.out.println();
	}
}
