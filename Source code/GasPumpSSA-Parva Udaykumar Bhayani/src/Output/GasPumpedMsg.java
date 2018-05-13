package Output;

import Datastore.DataStore;

public abstract class GasPumpedMsg
{
	protected DataStore ds;
    public GasPumpedMsg(DataStore ds) 
    {
        this.ds = ds;
    }    
    abstract void GasPumpedMsg();
}
