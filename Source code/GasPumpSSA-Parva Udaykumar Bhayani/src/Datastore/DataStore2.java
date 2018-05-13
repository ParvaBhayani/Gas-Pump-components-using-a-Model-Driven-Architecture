package Datastore;

public class DataStore2 extends DataStore
{
	
		public void setTp_A(float a)
		{
			tpA=a;  //Sets the price of gastype=1
		}
		public void setTp_B(float b)
		{
			tpB=b; //Sets the price of gastype=2
		}
		public void setTp_C(float c)
		{
			tpC=c; //Sets the price of gastype=3
		}
		public float getTp_A() 
		{ 
			return tpA; //Gets the price of gastype=1
		}
		public float getTp_B() 
		{ 
			return tpB; //Gets the price of gastype=2
		}
		public float getTp_C() 
		{ 
			return tpC; //Gets the price of gastype=3
		}
		public void setAmt(float c) 
		{ 
	    	amt = c;  //Sets the value of cash 
	    }
	   
	    public float getAmt() 
	    { 
	    	return  amt; //Gets the value of cash
	    } 
	    public void setL(int liter)
		{
			L=liter; //Sets the total liter pumped
		}
	    public int getL() 
	    {
	    	return L; //Gets the total liter pumped
	    }
		
	    public void setGasPrice2(float Cost2) 
		{
	    	
			cost2=Cost2;   //Sets the price of the selected gastype
		}
		public float getGasPrice2() 
		{ 
			
			return cost2; //Gets the price of the selected gastype
		}
		public void setTotal2(float total2)
		{
			Total2=total2;  //Sets the total2 amount charged for the gallon pumped
		}
		public float getTotal2()
		{
			return Total2;  //Gets the total2 amount charged for the gallon pumped
		}
		public void setRcost2(float rcost2)
	    {
			
	    	Rcost2=rcost2; 
	    	
	    }
		public  float getRcost2()
	    {
			
	    	return Rcost2; //Gets the price of the regular gas
	    }
	    public  void setScost2(float scost2)
	    {
			
	    		    	Scost2=scost2; //Sets the price of the super gas
	    }
	   public  float getScost2()
	    {
			
	    	return Scost2; //Gets the price of the super gas
	    }
	    public void setPcost2(float pcost2)
		{
			
			Pcost2=pcost2; //Sets the price of the premium gas
		}
	    public float getPcost2()
		{
	    	
			return Pcost2; //Gets the price of the premium gas
		}
	    public void storepaytype(int t)
	    {
	    	pt=t;
	    }
	    public int getpaytype() 
	    {
	    	return pt;
	    }
}
