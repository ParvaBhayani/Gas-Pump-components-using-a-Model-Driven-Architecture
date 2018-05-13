package Output;

import Datastore.DataStore;

public abstract class PaymentMsg {
	protected DataStore ds;
    public PaymentMsg(DataStore ds) {
        this.ds = ds;
    }    
    abstract void PaymentMsg();
	

}
