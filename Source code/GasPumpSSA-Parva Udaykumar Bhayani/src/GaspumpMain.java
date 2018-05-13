import java.util.Scanner;
import MDAEFSM.MDAFESM;
public class GaspumpMain 
{
	static Scanner in;
public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MDAFESM mda=new MDAFESM();
		in=new Scanner(System.in);
		System.out.println("\tSELECT GasPump-1, GasPump-2:\n");
        System.out.println("\t1. GasPump-1\n\t2. GasPump-2\n\t3.exit");
        System.out.print("\tSelect GasPump: ");
		//Menu Options
		int gpType = 0;// selects the gas Type where gpType=1 is for GasPump1 and gpType=2 is for GasPump2
		try{
			gpType=Integer.parseInt(in.nextLine());
		}catch(Exception e){
			System.out.println("Please select valid GasPump");
			main(args);
		}
		
		switch(gpType){
		case 1: showGasPump1(mda);
				break;
		case 2: showGasPump2(mda);
				break;
		case 3: System.exit(0);
				break;
		default: System.out.println("Enter Valid Input:");
				 break;
				
		}
		
	}
	//Allows us to select the operations for GasPump1

	private static void showGasPump1(MDAFESM mda) {
		// TODO Auto-generated method stub
		Gaspump1 gp1=new Gaspump1(mda);
		float a,b;
		int ch;
		String x;
		Scanner in1=new Scanner(System.in);
		
		System.out.println("Please make a note of all following operations");
		System.out.println("GasPump-1 Exceution");
		ch=1;
		while(ch!=14){ // ch gives option to select different operations for the GasPump1
			System.out.println("Select Operation:");
			System.out.println("0-Activate,1-Start,2-PayCredit,3.PayDebit,4.Pin,5-Reject,6-Cancel,7-Approved,8-Diesel,");
			System.out.println(" 9-Regular, 10-StartPump, 11-PumpGallon, 12-StopPump, 13.FullTank 14-quit");
			ch=in.nextInt();  // it reads one character at a time
			switch(ch){
			case 0:System.out.println("Activate(float a, float b)");
					try{
						System.out.println("Enter Value of Regular Gas:");
						a=Float.parseFloat(in1.nextLine());
					}catch(Exception ne){
						a=-1;
	                    System.out.println("please enter a valid input");
	                 }
					try{
						System.out.println("Enter Value of Diesel Gas:");
						b=Float.parseFloat(in1.nextLine());
					}catch(Exception ne){
						b=-1;
						 System.out.println("please enter a valid input");
	                 }					
					gp1.Activate(a,b); // calls Activate for GasPump1 
					break;
			case 1: System.out.println("Start()");
					gp1.Start();  // Calls Start for GasPump1
					break;
			case 2: System.out.println("PayCredit()");
					  gp1.PayCredit(); // Calls PayCredit for GasPump1
					  break;
			case 3: System.out.println("PayDebit(string x)");
					System.out.println("Please Enter Pin to Set:");
					x=in1.nextLine();
					gp1.PayDebit(x);  // Calls PayDebit for GasPump1
					break;
			case 4: System.out.println("Pin()");
					System.out.println("Please Enter Pin to verify Payment");
					String y=in1.nextLine();
					gp1.Pin(y);  // Calls Pin for GasPump1
					break;
			case 5: System.out.println("Reject()");
					  gp1.Reject(); // Calls Reject for GasPump1
				      break;
			case 6: System.out.println("Cancel()");
					  gp1.Cancel();  // Calls Cancel for GasPump1
			  		  break;
			case 7: System.out.println("Approved()");
	  		  		  gp1.Approved(); // Calls Approved for GasPump1
					  break;
			case 8: System.out.println("Diesel()");
					  gp1.Diesel(); // Calls Super for GasPump1
	  		  		  break;
			case 9: System.out.println("Regular()");
					  gp1.Regular(); // Calls Regular for GasPump1
	  		  		  break;
			case 10: System.out.println("StartPump()");
					  gp1.StartPump(); // Calls StartPump for GasPump1
	  		  		  break;
	  		case 11: System.out.println("PumpGallon()");
	  				  gp1.PumpGallon(); // Calls PumpGallon for GasPump1
			  		  break;
			case 12: System.out.println("StopPump()");
					  gp1.StopPump(); // Calls StopPump for GasPump1
			  		  break;
			case 13: System.out.println("FullTank()"); 
					  gp1.FullTank();// Calls FullTank for GasPump1
					  break;
			case 14: System.out.println("Thank You. ");// Terminates the execution
					main(null);
					break;
			default: System.out.println("Invalid Input");
			}
			
		}		

		
	}

	private static void showGasPump2(MDAFESM mda) {
		// TODO Auto-generated method stub
		Gaspump2 gp2=new Gaspump2(mda);
		int ch;
		Scanner in2=new Scanner(System.in); // in2 stores the input for the different parameters like Price for Different gastype from the user  
		
		System.out.println("Please make a note of all following operations");
		System.out.println("GasPump-2 Exceution");
		ch=1;
		while(ch!=14){ // ch gives option to select different operations for the GasPump2
			System.out.println("\nSelect Operation:");
			System.out.println("0-Activate,1-PayCash,2.PayCredit,3.Reject, 4.Approved,5-Cancel,6-Premium,7-Regular,8-Super,9-StartPump");
					System.out.println(" 10-PumpLiter,11-StopPump,12-Receipt 13-NoReceipt, 14-Quit");
			ch=in.nextInt();
			switch(ch){
			case 0: System.out.println("Activate(float a, float b, float c)");
					float a,b,c;
					float d;
					try{
						System.out.println("Enter Value of Regular Gas:");
						a=Float.parseFloat(in2.nextLine());
					}catch(NumberFormatException ne){
                        a=-1;
                     }
					try{
						System.out.println("Enter Value of Super Gas:");
						b=Float.parseFloat(in2.nextLine());
					}catch(NumberFormatException ne){
                        b=-1;
                     }
					try{
						System.out.println("Enter Value of Premium Gas:");
						c=Float.parseFloat(in2.nextLine());
					}catch(NumberFormatException ne){
                        c=-1;
                     }
					
					gp2.Activate(a,b,c);// calls Activate for GasPump2
					
					
					break;
			
			case 1: System.out.println("PayCash(int c)");
					
			   		  System.out.println("Cash Amount c:"); // takes the input from user how much cash he will give before starting the pump
					  d=Float.parseFloat(in2.nextLine());
					  gp2.PayCash(d);    // Calls PayCash for GasPump2
					  break;
			case 2: System.out.println("PayCredit()");
					gp2.PayCredit(); // Calls PayCredit for GasPump2
					break;
			case 3: System.out.println("Reject()");
			  gp2.Reject(); // Calls Reject for GasPump2
		      break;	
			case 4:System.out.println("Approved()");
	  		  gp2.Approved(); // Calls Approved for GasPump2
			  break;
			case 5: System.out.println("Cancel()");
					  gp2.Cancel();// Calls Cancel for GasPump2
				      break;
			case 6: System.out.println("Premium()");
					  gp2.Premium();  // Calls Premium for GasPump2
			  		  break;
			case 7: System.out.println("Regular()");
	  		  		  gp2.Regular(); // Calls Regular for GasPump2
					  break;
			case 8: System.out.println("Super()");
					  gp2.Super(); // Calls Super for GasPump2
	  		  		  break;
			case 9: System.out.println("StartPump()");
					  gp2.StartPump(); // Calls StartPump for GasPump2
	  		  		  break;
			case 10: System.out.println("PumpLiter()");
					  gp2.PumpLiter(); // Calls PumpLiter for GasPump2
	  		  		  break;
	  		case 11: System.out.println("Stop()");
	  				  gp2.Stop(); // Calls Stop for GasPump2
			  		  break;
			case 12: System.out.println("Receipt()");
					  gp2.Receipt(); // Calls Receipt for GasPump2
			  		  break;
			case 13: System.out.println("NoReceipt()");
			  	  	  gp2.NoReceipt(); // Calls No Receipt for GasPump2
			  	  	  break;
			case 14: System.out.println("Thank You");; // Terminates the execution
						main(null);
						break;
			default : System.out.println("Invalid Input");
						
			}
			
		}		
		
	}
}
