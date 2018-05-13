package AbstractFactory;

import Datastore.DataStore;
import Datastore.DataStore2;
import Output.CancelMsg;
import Output.CancelMsg2;
import Output.DisplayGasUsed;
import Output.DisplayGasUsed2;
import Output.DisplayMenu;
import Output.DisplayMenu2;
import Output.GasPumpedMsg;
import Output.GaspumpedMsg2;
import Output.PaymentMsg;
import Output.PaymentMsg2;
import Output.PrintReceipt;
import Output.PrintReceipt2;
import Output.ReadyMsg;
import Output.ReadyMsg2;
import Output.RejectMsg;
import Output.RejectMsg2;
import Output.ReturnAmt;
import Output.ReturnAmt2;
import Output.StopMsg;
import Output.StopMsg2;
import Output.StoreAmt;
import Output.StoreAmt2;
import Output.StorePin;
import Output.StorePin1;
import Output.StorePin2;
import Output.StorePrice;
import Output.StorePrice2;
import Output.WrongPinMsg;
import Output.WrongPinMsg1;
import Output.WrongPinMsg2;
import Output.setGasPrice;
import Output.setGasPrice2;
import Output.setIniVal;
import Output.setIniVal2;

public class Factory2 extends Factory{
public Factory2() {
    ds = new DataStore2(); //Constructor returns DataStore2 Object 
}

@Override
public
DataStore getDataStoreObj() {
	// TODO Auto-generated method stub
	return ds;  // Returns Object of DataStore2 Class
}

@Override
public
StorePrice getStorePriceObj() {
	// TODO Auto-generated method stub
	  sp = new StorePrice2(ds);
        return sp; // Returns Object of StorePrice2 Class
}

@Override
public
PaymentMsg getPaymentMsgObj() {
	// TODO Auto-generated method stub
	pm =new PaymentMsg2(ds);
	return pm;   // Returns Object of PaymentMsg2 Class
}

@Override
public
StoreAmt getStoreAmtObj() {
	// TODO Auto-generated method stub
	sa =new StoreAmt2(ds); // Returns Object of StoreAmt2 Class
	return sa;
}

@Override
public
DisplayGasUsed getDisplayGasUsedObj() {
	// TODO Auto-generated method stub
	dgu =new DisplayGasUsed2(ds); // Returns Object of DisplayGasUsed2 Class
	return dgu;
}

@Override
public
DisplayMenu getDisplayMenuObj() {
	// TODO Auto-generated method stub
	dm =new DisplayMenu2(ds);  // Returns Object of DisplayMenu2 Class
	return dm;
}

@Override
public
StopMsg getStopMsgObj() {
	// TODO Auto-generated method stub
	sm =new StopMsg2(ds);
	return sm;  // Returns Object of StopMsg2 Class
}

@Override
public
GasPumpedMsg getGasPumpedMsgObj() {
	// TODO Auto-generated method stub
	gpm =new GaspumpedMsg2(ds);
	return gpm;  // Returns Object of GasPumpedMsg2 Class
}

@Override
public
ReturnAmt getReturnAmtObj() {
	// TODO Auto-generated method stub
	ra = new ReturnAmt2(ds);
	return ra;   // Returns Object of ReturnAmt2 Class
} 

@Override
public
PrintReceipt getPrintReceiptObj() {
	// TODO Auto-generated method stub
	pr = new PrintReceipt2(ds);
	return pr;  // Returns Object of PrintReceipt2 Class
}

@Override
public
RejectMsg getRejectMsgObj() {
	// TODO Auto-generated method stub
	rjm =new RejectMsg2(ds);    // Returns Object of RejectMsg2 Class
	return rjm;
}

@Override
public
ReadyMsg getReadyMsgObj() {
	// TODO Auto-generated method stub
	rm= new ReadyMsg2(ds);
	return rm;  // Returns Object of ReadyMsg2 Class
}

@Override
public
CancelMsg getCancelMsgObj() {
	// TODO Auto-generated method stub
	cm = new CancelMsg2(ds);
	return cm;  // Returns Object of CancelMsg2 Class
}

@Override
public
setGasPrice getsetGasPriceObj() {
	// TODO Auto-generated method stub
	sgp = new setGasPrice2(ds);
	return sgp;  // Returns Object of setGasPrice2 Class
}

@Override
public
setIniVal getsetInitValObj() {
	// TODO Auto-generated method stub
	siv = new setIniVal2(ds);
	return siv;   // Returns Object of setInitVal2 Class
}
@Override
public StorePin getStorePinObj() {
	// TODO Auto-generated method stub
	spin = new StorePin2(ds);
	return spin; // SetPrice1 class object is returned
}

@Override
public WrongPinMsg getWrongPinObj() {
	// TODO Auto-generated method stub
	wpm= new WrongPinMsg2(ds);
	return wpm;
}
}
