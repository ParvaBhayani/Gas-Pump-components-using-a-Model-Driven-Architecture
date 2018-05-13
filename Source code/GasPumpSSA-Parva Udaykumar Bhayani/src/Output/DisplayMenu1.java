package Output;

import Datastore.DataStore;

public class DisplayMenu1 extends DisplayMenu
{

	public DisplayMenu1(DataStore ds) 
	{
		super(ds);
		// TODO Auto-generated constructor stub
	}
	//Prints menu of gas pump once price is set
	@Override
	void DisplayMenu() 
	{
		// TODO Auto-generated method stub
		System.out.println("\t Select Gas");
		System.out.println("\t Diesel:" );
		System.out.println("\t Regular:");
		System.out.println();
	}
}
