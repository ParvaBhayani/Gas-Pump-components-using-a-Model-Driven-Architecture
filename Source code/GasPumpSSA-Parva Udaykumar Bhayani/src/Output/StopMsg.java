package Output;

import Datastore.DataStore;

public abstract class StopMsg
{
	protected DataStore ds;
    public StopMsg(DataStore ds) {
        this.ds = ds;
    }   
	abstract void StopMsg();

}
