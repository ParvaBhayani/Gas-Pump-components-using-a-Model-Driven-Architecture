package Output;

import Datastore.DataStore;

public abstract class RejectMsg 
{
	protected DataStore ds;
    public RejectMsg(DataStore ds) {
        this.ds = ds;
    }    
    abstract void RejectMsg();

}
