package Output;

import Datastore.DataStore;

public class DisplayMenu2 extends DisplayMenu
{
	public DisplayMenu2(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
		//Prints menu of gas pump once price is set
	@Override
	void DisplayMenu() {
		// TODO Auto-generated method stub
		System.out.println("\t Select Gas");
		System.out.println("\t Super:");
		System.out.println("\t Regular:");
		System.out.println("\t Premium:");
		System.out.println();
	}
}
