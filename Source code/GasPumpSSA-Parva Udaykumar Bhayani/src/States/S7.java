package States;

import MDAEFSM.MDAFESM;
import Output.Output;
import Datastore.DataStore1;

public class S7 extends State{
	

	public S7(MDAFESM m_da, Output outp) {
		super(m_da, outp);
		// TODO Auto-generated constructor stub
	}
	public void CorrectPin(){
		System.out.println("Correct Pin! Approved!");//Call OutputProcessor's ReturnCash method.
		op.DisplayMenu();
		m_da.StateChange(4);
	}
	public void InCorrectPin(){ 
		op.WrongPinMsg();
		m_da.StateChange(1);
	}
			
	public void Activate(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Start(){System.out.println("Invalid State. Please select an appropriate option");}
	public void Reject(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Cancel(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Approved(){System.out.println("Invalid State. Please select an appropriate option");}
    public void StartPump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Pump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void StopPump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void SelectGas(int gas){System.out.println("Invalid State. Please select an appropriate option");}
    public void Receipt(){System.out.println("Invalid State. Please select an appropriate option");}
    public void NoReceipt(){System.out.println("Invalid State. Please select an appropriate option");}
	public void PayType(int t) {System.out.println("Invalid State. Please select an appropriate option");}
}
