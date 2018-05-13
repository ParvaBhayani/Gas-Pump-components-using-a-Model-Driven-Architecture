package Output;

import Datastore.DataStore;

public abstract class PrintReceipt 
{
	protected DataStore ds;
    public PrintReceipt(DataStore ds) {
        this.ds = ds;
    }   
	abstract void PrintReceipt();
}
