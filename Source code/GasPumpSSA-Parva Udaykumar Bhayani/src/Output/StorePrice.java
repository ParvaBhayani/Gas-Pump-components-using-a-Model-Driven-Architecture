package Output;

import Datastore.DataStore;

public abstract class StorePrice {
	 public DataStore ds;

		public StorePrice(DataStore data) {
			// TODO Auto-generated constructor stub
			ds=data;
		} 
		abstract void StorePrice();	
}
