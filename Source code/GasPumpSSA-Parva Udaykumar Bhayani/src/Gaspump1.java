import AbstractFactory.Factory;
import AbstractFactory.Factory1;
import Datastore.DataStore;
import MDAEFSM.MDAFESM;

public class Gaspump1 
{
	private MDAFESM mda;
	private DataStore data;			
	private Factory af;
	
	public Gaspump1(MDAFESM mdaefsm){ // Constructor sets the object for MDAEFSM class.
									
		mda=mdaefsm;    
		af= new Factory1(); // Sets the object for ConcreteFactory1
		data=af.getDataStoreObj();  //Constructor sets object for AbstractFactory that gives us all the data objects.
		mda.setAbstractFactory(af);
	}
	public void Activate(float a, float b) {
		// TODO Auto-generated method stub		
		if(a>0 && b>0){
			data.setTpA(a);  //Sets the price for gastype 1 in temporary variable
			data.setTpB(b);   // Sets the price for gastype 2 in temporary variable
			mda.Activate();    // Calls the Activate function in the MDAEFSM Class.
		}
		else{
			System.out.println("Price Can Not Be Less Than 0"); // If user gives input less than 0 
		}
		
	}
	public void Start() {
		// TODO Auto-generated method stub		
		mda.Start(); //This methods calls Start in MDAEFSM
	}
	public void PayCredit() {
		// TODO Auto-generated method stub
		mda.PayType(1); // This method is called when the type i.e t=1 
		data.storepaytype(1);
	}
	public void PayDebit(String y)
	{
		data.SettempPin(y);		// This method is called when the type i.e t=3
		mda.PayType(3);
		data.storepaytype(3);
	}
	public void Pin(String x)
	{
		if(data.getPin().equals(x))
		{
			mda.CorrectPin(); // pin  verified 
		}
		else
		{
			mda.InCorrectPin(); //wrong pin
		}
	}
	public void Reject() {
		// TODO Auto-generated method stub
		mda.Reject(); //This methods calls Reject in MDAEFSM
	}
	public void Cancel() {
		// TODO Auto-generated method stub
		mda.Cancel(); //This methods calls Cancel in MDAEFSM
	}
	public void Approved() {
		// TODO Auto-generated method stub
		mda.Approved(); //This methods calls Approved in MDAEFSM
	}
	
	public void Regular() {
		// TODO Auto-generated method stub
		mda.SelectGas(1); //This methods calls Select Gas in MDAEFSM. It is called when gas=1
	}
	public void Diesel() {
		// TODO Auto-generated method stub
		mda.SelectGas(2); //This methods calls Select Gas in MDAEFSM. It is called when gas=2
	}
	public void StartPump() {
		// TODO Auto-generated method stub
		mda.Continue();
		mda.StartPump(); //This methods calls StartPump in MDAEFSM
		
	}
	public void PumpGallon() {
		// TODO Auto-generated method stub
		mda.Pump(); //This methods calls PumpGallon in MDAEFSM
	}
	public void StopPump() {
		// TODO Auto-generated method stub
		mda.StopPump();	//This methods calls StopPump in MDAEFSM
		mda.Receipt();   //This methods calls Receipt in MDAEFSM
		}
	public void FullTank() {
		// TODO Auto-generated method stub
		mda.StopPump();	//This methods calls StopPump in MDAEFSM
		mda.Receipt();
	}

}
