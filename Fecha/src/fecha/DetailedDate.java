package fecha;

public class DetailedDate extends Fecha implements Year
{   
	
	//This is an attribute
	private String[] M =  {"","January","February","March","April","May","June","July","August","September","October","November","December"};
	private String[] D = {"Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday"};
	
	private int daysThisYear = 0;
	
	//This is the Constructor
    public DetailedDate(String pdate)
    {
    	super(pdate);
    	
    	days();
    	
    }
     
 //==============================================================
    
    private void days()
    {    
    	if(mes<=8)
    	{
    		for(int i=1; i<=(mes-1); i++)
    		{
    			if(i!=2)
    			{
    				if(i%2==0)
    				{
    					daysThisYear = daysThisYear + 30;
    				}
    				else
    				{
    					daysThisYear = daysThisYear + 31;
    				}
    				
    			}
    			else
    			{
    				daysThisYear = daysThisYear + 29;
    			}
    		}
    	}
    	else
    	{
    		daysThisYear = 213;
    		
    		for(int i=8; i<=(mes-1); i++)
    		{
    			if(i%2==0)
    			{
    				daysThisYear = daysThisYear + 31;
    			}
    			else 
    			{
    				daysThisYear = daysThisYear + 30;
    			}
    			
    		}
    		
    	}
    	 
    	
    	daysThisYear = daysThisYear + dia;
    	
    }
    
 //===============================================================
    
    public String toString()
	{
		
		return D[daysThisYear%7]+" "+dia+" of "+ M[mes] +" "+year;
		
	}

  //============================================================
    public void determinateLeap() 
	{
		if((year%4)==0)
		{
			System.out.println("\n"+"==================="+"\n"+"     Leap Year    "+"\n"+"===================");
			
			
		}
	  	
	}
  
}  
