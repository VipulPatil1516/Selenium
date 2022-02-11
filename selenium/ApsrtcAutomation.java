package selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import junit.framework.Assert;

public class ApsrtcAutomation
{
	/*Xpath: Relative xpath
	      tagName[@attribute='value']
	      tagName[text()='value']
	    		  tagName[contains(@attribute,'value')]
	    		  tagName[contains(text(),'value')]
	    *[@attribute='value']
	    *[text()='value']
	    *[contains(@attribute,'value')]
	    *[contains(text(),'value')]
	
	tagName[@attribute1='value' and @attribute2='value']
			tagName[text()='value' and @attribute2='value']
					tagName[contains(@attribute,'value') and @attribute2='value']
					tagName[contains(text(),'value')and @attribute='value']
			*[@attribute='value'and @attribute2='value']
			*[text()='value' and @attribute1 = 'value']
			*[contains(@attribute,'value')and @attribute2 = 'value']
		    *[contains(text(),'value') and @attribute2 = 'value']*/
	
	
	
   public WebDriver driver;
   String name= "Vipul";
   public ApsrtcAutomation()
   {
	   System.out.println("My Name:"+ name);
	   System.setProperty("webdriver.chrome.driver", "E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
       driver= new ChromeDriver();
   }
   String expected = "APSRTC Official Website for Online Bus Ticket Booking - APSRTConline.in";
   @Before
   public void lunchApplication()
   {
	   System.out.println("Test Case: Lunch Application");
	   driver.get("https:/www.apsrtconline.in/");
	   Assert.assertEquals(expected, driver.getTitle() );
   }
   @Test
   public void bookTicket() throws InterruptedException
   {
	   driver.findElement(By.xpath("//input[@name='source']")).sendKeys("HYDERABAD");
	   Thread.sleep(2000);
	   Actions actions= new Actions(driver);
	   actions.sendKeys(Keys.ENTER).perform();
	   driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	   driver.switchTo().alert().accept();
	   driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("GUNTUR");
	   Thread.sleep(2000);
	   actions.sendKeys(Keys.ENTER).perform();
	   driver.findElement(By.xpath("//input[@name='txtJourneyDate']")).click();
	   //driver.findElement(By.xpath("//a[text()='15']")).click();
	   selectDate("4");
	   driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
   }
   @Test
   public void allKeyBoardActions() throws InterruptedException
   {
	   WebElement fromCity=driver.findElement(By.xpath("//input[@name='source']"));//.sendKeys("HYDERABAD");
	   Thread.sleep(2000);
	   Actions actions= new Actions(driver);
	   actions.moveToElement(fromCity).click().sendKeys("HYDERABAD").doubleClick().contextClick().build().perform();
	   //actions.sendKeys(Keys.ENTER).perform();
   }
   @Test
   public void multipleWindows()
   {
	   driver.findElement(By.xpath("//a[@text='TimeTable / Track']")).click();
       driver.findElement(By.xpath("//a[text()='All services Time Table & Tracking']")).click();
   }
   
   public void selectDate(String jDate)
   {
	   driver.findElement(By.xpath("//a[text()='"+jDate+"']")).click();
   }
   @Test
   public void navigateOnEachTab() throws InterruptedException
   {
	   driver.findElement(By.xpath("//a[@title='Ticket Status']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@title='Home']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@title='Cancel Ticket']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@title='Gallery']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@title='Track Service']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@title='Wallet']")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//a[@title='TimeTable / Track']")).click();
	   Thread.sleep(2000);
   }
   public void navigateOnEachTabDynamic(String tabName)
   {
	   driver.findElement(By.xpath("//a[@title='"+tabName+"'")).click();
   }
   @Test
   public void dynamicXpath()
   {
	   navigateOnEachTabDynamic("Wallet");
   }
}
