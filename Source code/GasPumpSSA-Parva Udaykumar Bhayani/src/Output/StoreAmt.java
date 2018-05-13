package Output;

import Datastore.DataStore;

public abstract class StoreAmt 
{
	protected DataStore ds;
    public StoreAmt(DataStore data) {
        ds = data;
    }     
    abstract void StoreAmt();
}
