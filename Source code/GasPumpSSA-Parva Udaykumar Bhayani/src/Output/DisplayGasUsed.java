package Output;

import Datastore.DataStore;

public abstract class DisplayGasUsed 
{
	protected DataStore ds;
    public DisplayGasUsed(DataStore ds) 
    {
        this.ds = ds;
    }   
	abstract void DisplayGasUsed();

}
