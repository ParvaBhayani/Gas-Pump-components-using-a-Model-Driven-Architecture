package Output;

import Datastore.DataStore;

public class ReadyMsg1 extends ReadyMsg
{

	public ReadyMsg1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// Print the ready msg when the pump is ready to start.
	@Override
	void ReadyMsg() {
		// TODO Auto-generated method stub
		System.out.println("\t Start Pumping");
		System.out.println();
	}
}
