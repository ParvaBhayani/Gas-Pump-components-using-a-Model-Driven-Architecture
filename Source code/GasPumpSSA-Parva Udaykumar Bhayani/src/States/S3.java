package States;

import MDAEFSM.MDAFESM;
import Output.Output;


public class S3 extends State {
	//Indicates State 4 which extends by State Class.
		public S3(MDAFESM m_da, Output op) {
			super(m_da, op);
			// TODO Auto-generated constructor stub
		}
		public void SelectGas(int gas){
			op.setGasPrice(gas); //Calling OutputProcessor's setGasPrice method.
			m_da.StateChange(5);
		}
		public void Cancel(){
			op.CancelMsg(); //Calling OutputProcessor's CancelMsg method.
			m_da.StateChange(1);
		}
		public void Activate(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void Start(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void Reject(){System.out.println("Invalid State. Please select an appropriate option");}
	   // public void Cancel(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void Approved(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void StartPump(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void Pump(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void StopPump(){System.out.println("Invalid State. Please select an appropriate option");}
	    //public void SelectGas(int gas){System.out.println("Invalid State. Please select an appropriate option");}
	    public void Receipt(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void NoReceipt(){System.out.println("Invalid State. Please select an appropriate option");}
	    public void PayType(int t) {System.out.println("Invalid State. Please select an appropriate option");}
}
