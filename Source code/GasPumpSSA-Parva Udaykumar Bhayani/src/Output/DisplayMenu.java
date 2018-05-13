package Output;

import Datastore.DataStore;

public abstract class DisplayMenu 
{protected DataStore ds;
public DisplayMenu(DataStore ds) 
{
    this.ds = ds;
}   
abstract void DisplayMenu();

}
