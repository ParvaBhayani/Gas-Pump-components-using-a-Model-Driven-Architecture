package States;

import MDAEFSM.MDAFESM;
import Output.Output;

public class S2 extends State {
	public S2(MDAFESM m_da, Output op) {
		super(m_da, op);
		// TODO Auto-generated constructor stub
	}
	public void Approved(){
		op.DisplayMenu(); //Calling OutputProcessor's DisplayMenu method.
		m_da.StateChange(4);
	}
	public void Reject(){
		op.RejectMsg(); //Calling OutputProcessor's RejectMsg method.
		m_da.StateChange(1);
	}
	public void Activate(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Start(){System.out.println("Invalid State. Please select an appropriate option");}
   // public void Reject(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Cancel(){System.out.println("Invalid State. Please select an appropriate option");}
  //  public void Approved(){System.out.println("Invalid State. Please select an appropriate option");}
    public void StartPump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Pump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void StopPump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void SelectGas(int gas){System.out.println("Invalid State. Please select an appropriate option");}
    public void Receipt(){System.out.println("Invalid State. Please select an appropriate option");}
    public void NoReceipt(){System.out.println("Invalid State. Please select an appropriate option");}
    public void PayType(int t) {System.out.println("Invalid State. Please select an appropriate option");}
}
