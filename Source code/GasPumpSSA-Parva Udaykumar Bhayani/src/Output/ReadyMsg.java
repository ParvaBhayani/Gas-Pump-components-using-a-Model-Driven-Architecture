package Output;

import Datastore.DataStore;

public abstract class ReadyMsg 
{
	protected DataStore ds;
    public ReadyMsg(DataStore ds) {
        this.ds = ds;
    }    
    abstract void ReadyMsg();

}
