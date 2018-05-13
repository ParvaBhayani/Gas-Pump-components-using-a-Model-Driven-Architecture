package Output;

import Datastore.DataStore;

public class setGasPrice2 extends setGasPrice
{
	public setGasPrice2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	// responsible to set the price for particular gas type
	@Override
	void setGasPrice(int gas) {
		// TODO Auto-generated method stub
		
		 if(gas==1){
			 
			 float cost2=ds.getRcost2();
			
				 ds.setGasPrice2(cost2);
			 System.out.println("Regular Gas Selected " + ds.getGasPrice2());
			 System.out.println();
		 }
		 else if(gas==2){
			
			 float cost2=ds.getScost2();
			 
				 ds.setGasPrice2(cost2);
			 System.out.println("Super Gas Selected " + ds.getGasPrice2());
			 System.out.println();
		 }
		 else if(gas==3){
			
			 float cost2=ds.getPcost2();
			
			 ds.setGasPrice2(cost2);
			 System.out.println("Premium Gas Selected " +ds.getGasPrice2());
			 System.out.println();
		 }
	}
}
