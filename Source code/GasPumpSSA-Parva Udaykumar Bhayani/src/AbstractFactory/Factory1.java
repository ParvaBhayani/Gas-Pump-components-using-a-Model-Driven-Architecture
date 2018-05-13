package AbstractFactory;

import Datastore.DataStore;
import Datastore.DataStore1;
import Output.CancelMsg;
import Output.CancelMsg1;
import Output.DisplayGasUsed;
import Output.DisplayGasUsed1;
import Output.DisplayMenu;
import Output.DisplayMenu1;
import Output.GasPumpedMsg;
import Output.GasPumpedMsg1;
import Output.PaymentMsg;
import Output.PaymentMsg1;
import Output.PrintReceipt;
import Output.PrintReceipt1;
import Output.ReadyMsg;
import Output.ReadyMsg1;
import Output.RejectMsg;
import Output.RejectMsg1;
import Output.ReturnAmt;
import Output.ReturnAmt1;
import Output.StopMsg;
import Output.StopMsg1;
import Output.StoreAmt;
import Output.StoreAmt1;
import Output.StorePin;
import Output.StorePin1;
import Output.StorePrice;
import Output.StorePrice1;
import Output.WrongPinMsg;
import Output.WrongPinMsg1;
import Output.setGasPrice;
import Output.setGasPrice1;
import Output.setIniVal;
import Output.setIniVal1;


public class Factory1 extends Factory {

	 public Factory1() 
	 {
		 ds = new DataStore1(); //Constructor returns DataStore1 Object
	 }

	@Override
	public
	DataStore getDataStoreObj() 
	{
		// TODO Auto-generated method stub
		return ds; // Returns Object of DataStore1 Class
	}

	@Override
	public
	StorePrice getStorePriceObj() 
	{
		// TODO Auto-generated method stub
		sp = new StorePrice1(ds);
		return sp; // Returns Object of StorePrice1 Class
	}

	@Override
	public
	PaymentMsg getPaymentMsgObj() 
	{
		// TODO Auto-generated method stub
		pm =new PaymentMsg1(ds);
		return pm; // Returns Object of PaymentMsg1 Class
	}

	@Override
	public
	StoreAmt getStoreAmtObj() 
	{
		// TODO Auto-generated method stub
		sa =new StoreAmt1(ds);
		return sa; // Returns Object of StoreAmt1 Class
	}

	@Override
	public
	DisplayGasUsed getDisplayGasUsedObj() 
	{
		// TODO Auto-generated method stub
		dgu =new DisplayGasUsed1(ds);
		return dgu; // Returns Object of DisplayGasUsed1 Class
	}

	@Override
	public
	DisplayMenu getDisplayMenuObj() 
	{
		// TODO Auto-generated method stub
		dm=new DisplayMenu1(ds);  // Returns Object of DisplayMenu1 Class
		return dm;
	}

	@Override
	public
	StopMsg getStopMsgObj() 
	{
		// TODO Auto-generated method stub
		sm =new StopMsg1(ds);
		return sm;  // Returns Object of StopMsg1 Class
	}

	@Override
	public
	GasPumpedMsg getGasPumpedMsgObj() 
	{
		// TODO Auto-generated method stub
		gpm =new GasPumpedMsg1(ds);
		return gpm; // Returns Object of GasPumpedMsg1 Class
	}

	@Override
	public
	ReturnAmt getReturnAmtObj() 
	{
		// TODO Auto-generated method stub
		ra = new ReturnAmt1(ds);
		return ra; // Returns Object of ReturnAmt1 Class
	}

	@Override
	public
	PrintReceipt getPrintReceiptObj() 
	{
		// TODO Auto-generated method stub
		pr = new PrintReceipt1(ds);
		return pr; // Returns Object of PrintReceipt1 Class
	}

	@Override
	public
	RejectMsg getRejectMsgObj() 
	{
		// TODO Auto-generated method stub
		rjm =new RejectMsg1(ds); // Returns Object of RejectMsg1 Class
		return rjm;
	}

	@Override
	public
	ReadyMsg getReadyMsgObj() 
	{
		// TODO Auto-generated method stub
		rm = new ReadyMsg1(ds);
		return rm; // Returns Object of ReadyMsg1 Class
	}

	@Override
	public
	CancelMsg getCancelMsgObj() 
	{
		// TODO Auto-generated method stub
		cm = new CancelMsg1(ds);
		return cm; // Returns Object of CancelMsg1 Class
	}

	@Override
	public
	setGasPrice getsetGasPriceObj() 
	{
		// TODO Auto-generated method stub
		sgp = new setGasPrice1(ds);
		return sgp; // Returns Object of setGasPrice1 Classv
	}

	@Override
	public
	setIniVal getsetInitValObj() 
	{
		// TODO Auto-generated method stub
		siv = new setIniVal1(ds);
		return siv; // Returns Object of setInitVal1 Class
	}
	public StorePin getStorePinObj() {
		// TODO Auto-generated method stub
		spin = new StorePin1(ds);
		return spin; // SetPrice1 class object is returned
	}

	@Override
	public WrongPinMsg getWrongPinObj() {
		// TODO Auto-generated method stub
		wpm= new WrongPinMsg1(ds);
		return wpm;
	}
}
