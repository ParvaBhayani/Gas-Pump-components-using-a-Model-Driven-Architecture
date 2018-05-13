package States;

import MDAEFSM.MDAFESM;
import Output.Output;

public class S1 extends State{

	//Indicates State 2 which extends by State Class.
		public S1(MDAFESM m_da, Output op) {
			super(m_da, op);
			// TODO Auto-generated constructor stub
		}
		public void PayType(int t){
			if(t==1){
				System.out.println("Waiting for the Approval");
				m_da.StateChange(3);
			}
			if(t==2){
				op.StoreAmt();//Calling OutputProcessor's StoreAmt method.
				op.DisplayMenu();//Calling OutputProcessor's DisplayMenu method.
				m_da.StateChange(4);
			}
			if(t==3)
			{
			
				op.StorePin();
				
				m_da.StateChange(8);
			}
			
		}
		public void Activate(){
			System.out.println("Invalid State. Please select an appropriate option");
		}
		// public void Activate(){System.out.println("Invalid State. Please select an appropriate option");}
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
		//	public void PayType(int t) {System.out.println("Invalid State. Please select an appropriate option");}
		

}
