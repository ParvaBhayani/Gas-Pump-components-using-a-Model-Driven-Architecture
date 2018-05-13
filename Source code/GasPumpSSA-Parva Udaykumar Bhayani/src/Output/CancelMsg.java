package Output;

import Datastore.DataStore;

public abstract class CancelMsg 
{
	protected DataStore ds;
    public CancelMsg(DataStore ds) 
    {
        this.ds = ds;
    }    
    abstract void CancelMsg();
}
