package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TwitterAutomation 
{
 String expectedTitle= "Twitter";
 public WebDriver driver;
 public TwitterAutomation()
 {
	 System.setProperty("webdriver.chrome.driver", "E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
 }
 @Test
 public void verifyApplication()
 {
	 System.out.println("Title Validation: Verified Application Sucessfully");
	 driver.get("https://twitter.com");
	 String actualTitle= driver.getTitle();
	 System.out.println("My Title"+ actualTitle);
	 System.out.println("My URL"+ driver.getCurrentUrl());
	 System.out.println("My Session ID"+ driver.getWindowHandle());
	 Assert.assertTrue(expectedTitle.contains("Twitter"));
	 System.out.println("Test Completed-Page Verified");
 }
 @Test
 public void signup() throws InterruptedException
 {
	 verifyApplication();
	 System.out.println("Sign Up Using Google");
	 driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-BPrWId")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.id("identifierId")).sendKeys("vipulpatil1516@gmail.com");
 }
 @Test
 public void signUpWithApple() throws InterruptedException
 {
	 verifyApplication();
	 System.out.println("Sign Up Using Apple");
	 driver.findElement(By.className("css-901oao css-16my406 css-bfa6kz r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0")).click();
 }
}
