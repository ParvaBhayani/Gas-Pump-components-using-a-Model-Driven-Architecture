package Output;

import Datastore.DataStore;

public class StorePin1 extends StorePin {

	public StorePin1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}

	@Override
	void StorePin() {
		// TODO Auto-generated method stub
		ds.SetPin(ds.gettempPin());;
		System.out.println("Pin Set Successfully");
		System.out.println();
	}

}
