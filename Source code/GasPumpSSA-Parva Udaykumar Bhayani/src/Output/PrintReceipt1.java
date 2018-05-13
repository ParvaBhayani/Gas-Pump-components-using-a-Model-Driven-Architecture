package Output;

import Datastore.DataStore;

public class PrintReceipt1 extends PrintReceipt
{

	public PrintReceipt1(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	
	// Prints the receipt once the gas pump is stopped.
	@Override
	void PrintReceipt() {
		// TODO Auto-generated method stub
		
		float total = ds.getTotal1();
		
		System.out.println("Receipt:");
		System.out.println("Total Gallons:"+ds.getG());
		System.out.println("Total amount:"+total);
		System.out.println();
	}
}
