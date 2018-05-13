package Output;

import Datastore.DataStore;

public abstract class setIniVal 
{
	protected DataStore ds;
    public setIniVal(DataStore ds) {
        this.ds = ds;
    }    
    abstract void setInitVal();
}
