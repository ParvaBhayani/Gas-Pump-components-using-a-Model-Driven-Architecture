package States;

import MDAEFSM.MDAFESM;
import Output.Output;


public class S0 extends State{

	public S0(MDAFESM m_da, Output op) {
		// TODO Auto-generated constructor stub
		super(m_da,op);
	}
	public void Start(){
		op.PaymentMsg();//Calling OutputProcessor's PaymentMsg method.
		m_da.StateChange(2);
	}
	public void Activate(){
		System.out.println("Invalid State. Please select an appropriate option");
	}
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
