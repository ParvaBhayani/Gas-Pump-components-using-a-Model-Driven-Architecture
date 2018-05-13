package States;

import MDAEFSM.MDAFESM;
import Output.Output;

public class S8 extends State{
	

	public S8(MDAFESM m_da, Output outp) {
		super(m_da, outp);
		// TODO Auto-generated constructor stub
	}
	public void StartPump(){
		op.setInitVal(); //Calling OutputProcessor's setInitVal method.
		op.ReadyMsg(); //Calling OutputProcessor's ReadyMsg method.
		m_da.StateChange(6);
	}
	public void Activate(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Start(){System.out.println("Invalid State. Please select an appropriate option");}
	public void Reject(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Cancel(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Approved(){System.out.println("Invalid State. Please select an appropriate option");}
   // public void StartPump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void Pump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void StopPump(){System.out.println("Invalid State. Please select an appropriate option");}
    public void SelectGas(int gas){System.out.println("Invalid State. Please select an appropriate option");}
    public void Receipt(){System.out.println("Invalid State. Please select an appropriate option");}
    public void NoReceipt(){System.out.println("Invalid State. Please select an appropriate option");}
	public void PayType(int t) {System.out.println("Invalid State. Please select an appropriate option");}
}
