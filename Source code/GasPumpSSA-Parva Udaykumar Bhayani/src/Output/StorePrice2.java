package Output;

import Datastore.DataStore;

public class StorePrice2 extends StorePrice {
	public StorePrice2(DataStore data) {
		super(data);
		// TODO Auto-generated constructor stub
	}
	//Stores the price value of different gas.
	@Override
	void StorePrice() {
		// TODO Auto-generated method stub
		float Rcost=ds.getTp_A();
    	float Scost=ds.getTp_B();
    	float Pcost=ds.getTp_C();
  
    	ds.setRcost2(Rcost);
    	
    	ds.setScost2(Scost);	
    	ds.setPcost2(Pcost);
	}
}
