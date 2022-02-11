package selenium;

public class GeneralUtilities 
{
    public static void fixedWait(int timeInSec)
    {
    	try 
    	{
    	 Thread.sleep(timeInSec * 1000);	
    	} catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
