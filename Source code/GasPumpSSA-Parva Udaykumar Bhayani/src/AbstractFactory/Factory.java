package AbstractFactory;
import Datastore.DataStore;
import Output.StorePrice;
import Output.WrongPinMsg;
import Output.WrongPinMsg2;
import Output.PaymentMsg;
import Output.StoreAmt;
import Output.StorePin;
import Output.StorePin2;
import Output.RejectMsg;
import Output.DisplayGasUsed;
import Output.ReadyMsg;
import Output.StopMsg;
import Output.CancelMsg;
import Output.PrintReceipt;
import Output.ReturnAmt;
import Output.setGasPrice;
import Output.setIniVal;
import Output.DisplayMenu;
import Output.GasPumpedMsg;

public abstract class Factory {
	 //Abstract Factory pattern used by the Strategy Patterns.
	protected DataStore ds; //DataStore object which stores all data specific to various GasPump
    protected StorePrice sp; // StorePrice object which provides StorePrice function.
    protected StoreAmt sa; //StoreAmt object provides method to store cash
    protected PaymentMsg pm; //PaymentMsg object provides StorePrice function.
    protected RejectMsg rjm; //RejectMsg object provides StorePrice function.
    protected DisplayGasUsed dgu; //DisplayGasUsed object provides method to calculate gallons pumped.
    protected DisplayMenu dm; //DisplayMenu object provides StorePrice function.
    protected GasPumpedMsg gpm; //GasPumpedMsg object provides StorePrice function.
    protected ReadyMsg rm; // ReadyMsg object provides StorePrice function.
    protected StopMsg sm;// StopMsg object provides StorePrice function.
    protected CancelMsg cm; // CancelMsg object provides StorePrice function.
    protected PrintReceipt pr; // PrintReceipt object provides StorePrice function.
    protected ReturnAmt ra; // ReturnAmt object provides StorePrice function.
    protected setGasPrice sgp; // setGasPrice object provides StorePrice function.
    protected setIniVal siv; //setInitVal object provides StorePrice function.
    protected StorePin spin;
    protected WrongPinMsg wpm;
    public abstract DisplayGasUsed getDisplayGasUsedObj();
	public abstract DisplayMenu getDisplayMenuObj();
	public abstract StopMsg getStopMsgObj();
	public abstract DataStore getDataStoreObj();
    public abstract StorePrice getStorePriceObj();
    public abstract PaymentMsg getPaymentMsgObj();
    public abstract StoreAmt getStoreAmtObj();
    public abstract PrintReceipt getPrintReceiptObj();
    public abstract GasPumpedMsg getGasPumpedMsgObj();
    public abstract ReturnAmt getReturnAmtObj();
    public abstract RejectMsg getRejectMsgObj();
    public abstract ReadyMsg getReadyMsgObj();
    public abstract CancelMsg getCancelMsgObj(); 
    public abstract setGasPrice getsetGasPriceObj();
    public abstract setIniVal getsetInitValObj();
	public abstract StorePin getStorePinObj();
	public abstract WrongPinMsg getWrongPinObj();
		
	}

