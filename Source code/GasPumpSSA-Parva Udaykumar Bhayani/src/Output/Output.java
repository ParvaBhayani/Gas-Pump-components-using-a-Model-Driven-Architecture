package Output;

import AbstractFactory.Factory;
import Datastore.DataStore;
import AbstractFactory.Factory;
import Output.CancelMsg;
import Output.DisplayGasUsed;
import Output.DisplayMenu;
import Output.GasPumpedMsg;
import Output.PaymentMsg;
import Output.PrintReceipt;
import Output.ReadyMsg;
import Output.RejectMsg;
import Output.ReturnAmt;
import Output.StopMsg;
import Output.StoreAmt;
import Output.StorePrice;
import Output.setGasPrice;
import Output.setIniVal;

public class Output {
	private Factory af;
	DataStore ds;
	//MDA_EFSM Actions
	public void setAbstractFactory(Factory aFact) {
		// TODO Auto-generated method stub
		af=aFact; //This 
	}
	// stores the price for the gastypes. It also responsible to get the data object from abstract factory.
	public void StorePrice() {
		// TODO Auto-generated method stub
		StorePrice sp= af.getStorePriceObj();
		sp.StorePrice();
	}
	//add menu for selecting cash or credit.It also responsible to get the data object from abstract factory.
	public void PaymentMsg() {
		// TODO Auto-generated method stub
		PaymentMsg pm =af.getPaymentMsgObj();
		pm.PaymentMsg();
	}
	// store the cash amount given by user.It also responsible to get the data object from abstract factory.
	public void StoreAmt(){
		StoreAmt sa=af.getStoreAmtObj();
		sa.StoreAmt();		
	}
	//add menu for selecting gas type: super or regular or premium.It also responsible to get the DisplayMenu object from abstract factory.
	public void DisplayMenu(){
		DisplayMenu dm= af.getDisplayMenuObj();
		dm.DisplayMenu();
	}
	// It shows the reject msg in the particular strategy pattern classes.It also responsible to get the RejectMsg object from abstract factory.
	public void RejectMsg(){ 
		RejectMsg rjm = af.getRejectMsgObj();
		rjm.RejectMsg();
		
	}
	// It shows the ready msg in the particular strategy pattern classes.It also responsible to get the ReadyMsg object from abstract factory.
	public void ReadyMsg(){
		ReadyMsg rm= af.getReadyMsgObj();
		rm.ReadyMsg();
	}
	// It shows the cancel msg in the particular strategy pattern classes.It also responsible to get the CancelMsg object from abstract factory.
	public void CancelMsg(){
		CancelMsg cm= af.getCancelMsgObj();
		cm.CancelMsg();
	}

	/*It sets the price for the selected gas type and calls the particular strategy pattern classes.It also responsible to get the setGasPrice 
	object from abstract factory.*/
	
	public void setGasPrice(int gas) {
		// TODO Auto-generated method stub
		setGasPrice sgp=af.getsetGasPriceObj();
		sgp.setGasPrice(gas);
	}
	/*It sets the initial price for the different gas type and calls the particular strategy pattern classes.It also responsible to get the
	 *  setInitVal object from abstract factory.
	 */
	public void setInitVal() {
		// TODO Auto-generated method stub
		setIniVal siv=af.getsetInitValObj();
		siv.setInitVal();
		
	}
	/*It calculates the total gas pumped according to the particular strategy pattern classes.It also responsible to get the DisplayGasUsed object 
	from abstract factory.*/
	public void DisplayGasUsed(){
		DisplayGasUsed dgu= af.getDisplayGasUsedObj();
		dgu.DisplayGasUsed();
	}
	// It shows the Gas Pumped msg in the particular strategy pattern classes.It also responsible to get the GasPumpedMsg object from abstract factory.
	public void GasPumpedMsg(){
		GasPumpedMsg gpm= af.getGasPumpedMsgObj();
		gpm.GasPumpedMsg();
		
	}
	// It shows the stop msg in the particular strategy pattern classes.It also responsible to get the StopMsg object from abstract factory.
	public void StopMsg(){
		StopMsg sm= af.getStopMsgObj();
		sm.StopMsg();
	}
	/*It prints the receipt of the total gas pumped according to the particular strategy pattern classes.It also responsible to get the PrintReceipt 
	 * object from abstract factory.
	 */
	public void PrintReceipt(){
		PrintReceipt pr= af.getPrintReceiptObj();
		pr.PrintReceipt();
	}
	/*It calculates the total cash remaining and returns the remaining cash after gas pumped to the user according to the particular 
	 * strategy pattern classes.It also responsible to get the ReturnCash object from abstract factory.
	 */
	public void ReturnAmt(){
		ReturnAmt ra = af.getReturnAmtObj();
		ra.ReturnAmt();
	}
	public void StorePin() {
		// TODO Auto-generated method stub
		StorePin sp = af.getStorePinObj();
		sp.StorePin();
	}
	public void WrongPinMsg() {
		// TODO Auto-generated method stub
		WrongPinMsg wp=af.getWrongPinObj();
		wp.WrongPinMsg();
	}
	
	
}
