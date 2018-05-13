package Output;

import Datastore.DataStore;

public class setGasPrice1  extends setGasPrice
{
	public setGasPrice1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
//Set the price for particular gas type 
	@Override
	void setGasPrice(int gas) {
		// TODO Auto-generated method stub
	 if(gas==1){
		 float cost1=ds.getRcost1();
		 ds.setGasPrice1(cost1);
		 float b= ds.getGasPrice1();
		 System.out.println("Regular Gas Selected");
		 System.out.println();
	 }
	 else if(gas==2){
		 float cost1=ds.getScost1();
		ds.setGasPrice1(cost1);
		 float a= ds.getGasPrice1();
		 System.out.println("Diesel Gas Selected");
		 System.out.println();
	 }
	}
}
