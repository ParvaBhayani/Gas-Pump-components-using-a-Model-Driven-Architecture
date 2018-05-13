import AbstractFactory.Factory;
import AbstractFactory.Factory2;
import Datastore.DataStore;
import MDAEFSM.MDAFESM;

public class Gaspump2 
{
	
	int payreturn;
	private MDAFESM mda;
	private DataStore data;
	private Factory af;  // Constructor sets the object for MDAEFSM class.
	public Gaspump2(MDAFESM mdaefsm) {
		// TODO Auto-generated constructor stub
		mda = mdaefsm;
		af= new Factory2(); //Sets object for ConcreteFactory2
		data=af.getDataStoreObj();// Constructor sets the object for AbstractFactory that gives us all the data objects.
		mda.setAbstractFactory(af);
	}
                      // The Gas Pump 2 class calls MDA_EFSM class.
	public void Activate(float a, float b, float c) {
		// TODO Auto-generated method stub
		if(a>0 && b>0 && c>0){
			data.setTp_A(a); //Sets the price for gastype 1 in temporary variable
			data.setTp_B(b); //Sets the price for gastype 2 in temporary variable
			data.setTp_C(c); //Sets the price for gastype 3 in temporary variable
			System.out.print("Regular :"+data.getTp_A()+" \nSuper : "+data.getTp_B() +"\nPremium : "+data.getTp_C());
			mda.Activate(); //Calls the Activate function in the MDAEFSM Class.
			mda.Start();
		}
		else{
			System.out.println("Price Can Not Be Less Than 0"); // If user gives input less than 0
		}
		
	}


	// This method is called when the type i.e t=2
	public void PayCash(float d) 
	{
		// TODO Auto-generated method stub
		if(d>0){
		//mda.Start();
			data.setAmt(d); // Only when Cash given in positive it allows to set the cash
			payreturn=2;
			mda.PayType(payreturn);
			data.storepaytype(2);
		}
		else System.out.println("Amount Should Be Greater Than 0");
	}
	public void PayCredit() {
		
		// TODO Auto-generated method stub
		
		payreturn=1;
		//mda.Start();
		data.setAmt(0);
		mda.PayType(payreturn); // This method is called when the type i.e t=1 
		data.storepaytype(1);
		
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		mda.Cancel(); // Calls the Cancel function in the MDAEFSM Class.
		}
	public void Reject() {
		// TODO Auto-generated method stub
		mda.Reject(); //This methods calls Reject in MDAEFSM
		System.out.println("You can use again the same gas pump");
		mda.Start();
	}
	public void Approved() {
		// TODO Auto-generated method stub
		mda.Approved(); //This methods calls Approved in MDAEFSM
	}

	public void Regular() {
		// TODO Auto-generated method stub
		mda.SelectGas(1);  //This methods calls Select Gas in MDAEFSM. It is called when gas=1
		mda.Continue();
		
	}
	public void Super() {
		// TODO Auto-generated method stub
		mda.SelectGas(2);  //This methods calls Select Gas in MDAEFSM. It is called when gas=2
		mda.Continue();
	}
	
	public void Premium() {
		// TODO Auto-generated method stub
		mda.SelectGas(3);  //This methods calls Select Gas in MDAEFSM. It is called when gas=3
		mda.Continue();
		}

	public void StartPump() {
		// TODO Auto-generated method stub
		mda.StartPump(); // Calls the StartPump function in the MDAEFSM Class.
    }
		
	public void PumpLiter() 
	{
		// TODO Auto-generated method stub
		if (payreturn ==1)
		{
			mda.Pump();
		}
		if(payreturn ==2)
		{
			float amt = data.getAmt();//Getting Cash value from DataStore
			
	        int L = data.getL();//Getting number of Liters from DataStore
	       
	        float cost = data.getGasPrice2();//Getting price per Gallon from DataStore
	        
	        if(amt < (L+1 )*cost){ // checks the condition whether the cash given is less than the pumped gas amount
	        	System.out.println("\n\tPump Has Stopped - Insufficient CAsh\n");
	        	System.out.println("\n\tWant A Receipt?\n");
	                mda.StopPump();//Calling StopPump function of MDAEFSM
	        }
		
	        else           
        	mda.Pump();//Calling Pump function of MDAEFSM
		}
	}

	public void Stop() {
		// TODO Auto-generated method stub
		mda.StopPump(); //Calling StopPump function of MDAEFSM
		
	}

	public void Receipt() {
		// TODO Auto-generated method stub
		mda.Receipt(); //Calling Receipt function of MDAEFSM
		System.out.println("ThanK You for Using Gas Pump. You can use again the same gas pump");
		System.out.println("-----------------------------------------------------------------");
		mda.Start();
		
	}

	public void NoReceipt() {
		// TODO Auto-generated method stub
		System.out.println("No Receipt");
		mda.NoReceipt(); //Calling NoReceipt function of MDAEFSM
		System.out.println("ThanK You for Using Gas Pump. You can use again the same gas pump");
		System.out.println("-----------------------------------------------------------------");
		mda.Start();
	}
	
	}
