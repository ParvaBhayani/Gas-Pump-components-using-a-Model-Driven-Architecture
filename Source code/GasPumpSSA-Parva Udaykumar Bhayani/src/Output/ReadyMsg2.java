package Output;

import Datastore.DataStore;

public class ReadyMsg2 extends ReadyMsg
{
	public ReadyMsg2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// Prints the ready msg when the pump is ready to start.
	@Override
	void ReadyMsg() {
		// TODO Auto-generated method stub
		System.out.println("\t Start Pumping");
		System.out.println();
	}
}
