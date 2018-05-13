package Output;

import Datastore.DataStore;

public abstract class WrongPinMsg {
	protected DataStore ds;
      
    public WrongPinMsg(DataStore ds2) {
		// TODO Auto-generated constructor stub
    	ds=ds2;
	}
	abstract void WrongPinMsg();
}
