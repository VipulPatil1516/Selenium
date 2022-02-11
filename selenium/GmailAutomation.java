package selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//String expectedTitle="Gmail";
public class GmailAutomation 
{
	WebDriver driver= new ChromeDriver();
	@Test 
   public void launchApplication()// throws InterruptedExeption
   {
	   System.out.println("Test Case: Launch Application");
       System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
	   //System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver.get("https://gmail.com");
   }
	@Test
	public void loginApplication()// throws InterruptedExeption
	{
		//lunchApplication();
		System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		System.out.println("Test Case: Login Application");
		//System.out.println("");
		 driver.get("https://gmail.com");
		
		
	}
}
