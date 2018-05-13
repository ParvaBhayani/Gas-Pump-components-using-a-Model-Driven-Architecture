package Output;

import Datastore.DataStore;
import MDAEFSM.MDAFESM;

public class ReturnAmt2 extends ReturnAmt
{
	public ReturnAmt2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
// It is responsible to calculate the total amount of cash remained and return it to the customer.
	@Override
	void ReturnAmt() {
		// TODO Auto-generated method stub
		float total=ds.getTotal2();//calculate total from data2 
		float amount=ds.getAmt();
		float returnAmount= amount-total;
		if(returnAmount >= 0)
		{
			if(ds.getpaytype()==2)
			{
				System.out.printf("\tReturn $ %.2f Cash",returnAmount);
				System.out.println();
			}
			
				
			
		}
	
	}
}
