package States;

import MDAEFSM.MDAFESM;
import Output.Output;

public abstract class State {
	protected Output op;
    protected MDAFESM m_da;
/*This is the State Pattern used by all the state sub classes.Here all the methods 
at this levels doen't perform any actions.
*/	    
    public State(MDAFESM mda, Output outp) {
        m_da = mda;
        op = outp; //This constructor sets the MDA_EFSM and OutputProcessor Objects
    }
    public void Activate(){}
    public void Start(){}
    public void Reject(){}
    public void Cancel(){}
    public void Approved(){}
    public void StartPump(){}
    public void Pump(){}
    public void StopPump(){}
    public void SelectGas(int gas){}
    public void Receipt(){}
    public void NoReceipt(){}
	public void PayType(int t) {}
	public void CorrectPin() {}
	public void InCorrectPin() {}
	
	public void Continue() {
		// TODO Auto-generated method stub
		
	}	
	}

