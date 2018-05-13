package Datastore;

public class DataStore1 extends DataStore
{
	public void setTpA(float a)
	{
		tp_A=a; //Sets the price of gastype=1
	}
	public float getTpA()
	{
		return tp_A;    //Gets the price of gastype=1
	}
	public void setTpB(float b)
	{
		tp_B=b;      //Sets the price of gastype=2
	}
	public float getTpB()
	{
		return tp_B;     //Gets the price of gastype=2
	}
	public void setGasPrice1(float Cost1) 
	{
        cost1=Cost1;     //Sets the price of the selected gastype
    }
	public float getGasPrice1()
	{
		return  cost1;    //Gets the price of the selected gastype
	}
   
    public void setG(int gallon)
    { 
    	G = gallon;     //Sets the total gallon pumped 
    }
   
    public int getG() 
    {
    	return G;       //Gets the total gallon pumped
    }
    public void setTotal1(float total1)
    {
    	Total1=total1;     //Sets the total amount charged for the gallon pumped
    }
    public  float getTotal1()
    {
    	return Total1;    //Gets the total amount charged for the gallon pumped
    }
    public  void setRcost1(float rcost1)
    {
    	Rcost1=rcost1;    //Sets the price of the regular gas 
    }
    public  float getRcost1()
    {
    	return Rcost1;      //Gets the price of the regular gas
    }
    public  void setScost1(float scost1)
    {
    	Scost1=scost1;      //Sets the price of the super gas
    }
    public  float getScost1()
    {
    	return Scost1;       //Gets the price of the super gas
    }
    public void SetPin(String x)
    {
    	
		pin = x;
    	
    }
    public String getPin()
    {
    	
    	return pin;
    }
    public void SettempPin(String y) {
		// TODO Auto-generated method stub
		tempPin=y;
		
	}
   public String gettempPin()
    {
    	return tempPin;
    }
   
    
}
