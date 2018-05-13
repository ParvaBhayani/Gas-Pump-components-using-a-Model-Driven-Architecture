package Output;

import Datastore.DataStore;

public abstract class ReturnAmt
{
	protected DataStore ds;
    public ReturnAmt(DataStore ds) {
        this.ds = ds;
    }   
	abstract void ReturnAmt();


}
