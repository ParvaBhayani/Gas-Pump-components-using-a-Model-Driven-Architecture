package Output;

import Datastore.DataStore;

public abstract class StorePin {
	public DataStore ds;

	public StorePin(DataStore d) {
		// TODO Auto-generated constructor stub
		ds=d;
	} 
	abstract void StorePin(); 
}
