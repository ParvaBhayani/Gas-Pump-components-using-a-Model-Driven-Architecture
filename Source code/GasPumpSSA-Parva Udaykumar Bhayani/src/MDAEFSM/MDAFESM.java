package MDAEFSM;

import States.State;
import AbstractFactory.Factory;
import States.S0;
import States.S1;
import States.S2;
import States.S3;
import States.S4;
import States.S5;
import States.S6;
import States.S7;
import States.S8;
import States.Start;
import Output.Output;

public class MDAFESM 
{
	 private State[] s = new State[10];
	 private State st;
	private Output op;
	
	 public MDAFESM() {
	        op = new Output();
	        s[0] = new Start(this, op);
	        s[1] = new S0(this, op);
	        s[2] = new S1(this, op);
	        s[3] = new S2(this, op);
	        s[4] = new S3(this, op);
	        s[5] = new S4(this, op);
	        s[6] = new S5(this, op);
	        s[7] = new S6(this, op);
	        s[8] = new S7(this, op);
	        s[9] = new S8(this,op);
	        st=s[0]; 
	    }

	public void setAbstractFactory(Factory af) {
		// TODO Auto-generated method stub
		op.setAbstractFactory(af);
		}

	public void Activate() {
		// TODO Auto-generated method stub
		st.Activate();
		
	}

	public void Start() {
		// TODO Auto-generated method stub
		st.Start();
		
	}

	public void Reject() {
		// TODO Auto-generated method stub
		st.Reject();
		
	}
	public void Cancel() {
		// TODO Auto-generated method stub
		st.Cancel();
		
	}

	public void Approved() {
		// TODO Auto-generated method stub
		st.Approved();
		
	}

	public void SelectGas(int gas) {
		// TODO Auto-generated method stub
		st.SelectGas(gas);
		
	}

	public void StartPump() {
		// TODO Auto-generated method stub
		st.StartPump();
		
		
	}
	public void StopPump() {
		// TODO Auto-generated method stub
		st.StopPump();
	}	

	public void Receipt() {
		// TODO Auto-generated method stub
		st.Receipt();
		
	}

	public void Pump() {
		// TODO Auto-generated method stub
		st.Pump();
		
	}
	public void NoReceipt() {
		// TODO Auto-generated method stub
		st.NoReceipt();
		
	}
	public void StateChange(int i){
	st=s[i]; // State changes as per the value of i
	//System.out.println("STateChange");
	}

	public void PayType(int t) {
		// TODO Auto-generated method stub
		st.PayType(t);
		
		
	}
	public void CorrectPin() {
		// TODO Auto-generated method stub
		st.CorrectPin();	
	}
	public void InCorrectPin() {
		// TODO Auto-generated method stub
		st.InCorrectPin();	
	}
	public void Continue()
	{
		st.Continue();
	}
}
