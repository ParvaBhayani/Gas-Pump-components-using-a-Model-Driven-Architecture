package Output;

import Datastore.DataStore;

public abstract class setGasPrice 
{
	protected DataStore ds;
    public setGasPrice(DataStore ds) {
        this.ds = ds;
    }   
	abstract void setGasPrice(int gas);
}
