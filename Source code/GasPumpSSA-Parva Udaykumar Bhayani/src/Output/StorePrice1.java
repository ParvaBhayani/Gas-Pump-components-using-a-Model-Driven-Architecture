package Output;

import Datastore.DataStore;

public class StorePrice1 extends StorePrice 
{
	public StorePrice1(DataStore ds) {
        super(ds);
    } 
	//Stores the price value of different gas.
    @Override
    void StorePrice() {
         
    	float Rcost=ds.getTpA();
    	float Scost=ds.getTpB();
    	ds.setRcost1(Rcost);
    	ds.setScost1(Scost);

    	System.out.println("Regular Gas Price "+ds.getRcost1());
    	System.out.println("Diesel Gas Price "+ds.getScost1());
    	System.out.println();
    	
    }
}
