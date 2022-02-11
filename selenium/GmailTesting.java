package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class GmailTesting
{
   String expectedtitle="Gmail";
   public WebDriver driver;
   public GmailTesting()
   {
  System.setProperty("webdriver.chrome.driver", "E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
   }
   @Test
   public void lunchApplication()
   {
  System.out.println("Test Case: Lunch Application");
  driver.get("https://gmail.com");
  String title = driver.getTitle();
  System.out.println("Title:"+ title);
  System.out.println("Get URL"+ driver.getCurrentUrl());
  System.out.println("Sesion ID:"+ driver.getWindowHandle());
  if(expectedtitle.equals(title))
  {
  System.out.println("Title Validation Successfull");
  }
  else
  {
  System.out.println("TItle Validation Failed");
  }
       Assert.assertEquals(expectedtitle,title);
   }
   @Test
   public void enterUsername() throws InterruptedException
   {
  lunchApplication();
  System.out.println("Test Case: Enter Mobile Number or UserName");
  driver.findElement(By.id("identifierId")).sendKeys("8999781680",Keys.ENTER);
  //driver.findElement(By.className("whsOnd zHQkBf")).click();  
   }
   @Test
   public void next() throws InterruptedException
   {
  lunchApplication();
  //driver.findElement(By.jsname("V67aGc"));
  driver.findElement(By.className("VfPpkd-vQzf8d")).click();
   }
   @Test
   public void forgetEmail() throws InterruptedException
   {
  lunchApplication();
  driver.findElement(By.tagName("button")).click();
  //driver.findElement(By.tagName("button")).click();
   }
   @Test
   public void recoveryEmail() throws InterruptedException
   {
  lunchApplication();
  System.out.println("Test Case: Recovery Of Email");
  WebElement emailobj=driver.findElement(By.id("recoveryIdentifierId"));
  driver.findElement(By.className("Xb9hP"));
  //driver.findElement(By.className("whsOnd zHQkBf"));
       if (emailobj.isDisplayed() && emailobj.isEnabled())
       {
      emailobj.click();
      Thread.sleep(2000);
      emailobj.sendKeys("vipulpatil11516@gmail.com");
      Thread.sleep(2000);
     
       }
       else
       {
         System.out.println("Email or phone number object is not displayed / not enabled");
     
       }
       driver.findElement(By.name("recoveryIdentifierId")).sendKeys("100");
   }
}