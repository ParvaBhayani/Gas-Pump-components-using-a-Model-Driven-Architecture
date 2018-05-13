package Output;

import Datastore.DataStore;

public class PrintReceipt2 extends PrintReceipt
{
	public PrintReceipt2(DataStore ds) {
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//Prints the receipt once the gas pump is stopped.
	@Override
	void PrintReceipt() {
		// TODO Auto-generated method stub
		float total = ds.getTotal2();
        System.out.println("\n\tRECEIPT");
        System.out.println("\t# OF LITERS: "+ds.getL());
        System.out.println("\tTOTAL: $"+total+"\n");
        System.out.println();
	}
}
