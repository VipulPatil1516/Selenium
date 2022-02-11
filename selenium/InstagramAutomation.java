package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAutomation
{
   String expectedTitle="Login • Instagram";
   public WebDriver driver;
   public InstagramAutomation()
   {
	   System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
   }
   @Test
   public void verifyApplication() throws InterruptedException
   {
	   System.out.println("Test Case:Verify Application Successfull");
	   driver.get("https://www.instagram.com");
	   String actualTitle=driver.getTitle();
	   System.out.println("My Title:"+ actualTitle);
	   System.out.println("My URL:"+ driver.getCurrentUrl());
	   System.out.println("My Session ID:"+ driver.getWindowHandle());
	   Assert.assertTrue(expectedTitle.contains("Login • Instagram"));
       System.out.println("Test Completed-Page Verified");   
   }
   @Test
   public void userName() throws InterruptedException
   {
	   //driver.findElement(By.className("_2hvTZ pexuQ zyHYP")).click();
	   verifyApplication();
	   System.out.println("Test Case: User Name");
	   driver.findElement(By.name("username")).sendKeys("Vipul");
   }
   @Test
   public void password() throws InterruptedException
   {
	   verifyApplication();
	   System.out.println("Test Case:Password");
	   driver.findElement(By.name("password")).sendKeys("51655");
	   driver.findElement(By.className("_2hvTZ pexuQ zyHYP")).click();
	   
   }
   @Test
   public void loginWithFacebook() throws InterruptedException
   {
	   verifyApplication();
	   System.out.println("Test Case:Login With Facebook");
	   driver.findElement(By.className("KPnG0")).click();
   }
   /*@Test
   public void login() throws InterruptedException
   {
	   verifyApplication();
	   System.out.println("Test Case: Log In Into Instagram");
	   driver.findElement(By.name("username")).sendKeys("Vipul");
	   driver.findElement(By.name("password")).sendKeys("vip");
	   driver.findElement(By.xpath("//div[class"))
   }*/
   
   
}
