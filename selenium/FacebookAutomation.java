package selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAutomation
{
    String expectedTitle= "FaceBook-Log in or sign up";
    public WebDriver driver;
    public FacebookAutomation()
    {
    	System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
    	driver=new ChromeDriver();
    }
    @Test
    public void verifyApplication()
    {
    	System.out.println("Test Case:Lunch Application");
    	driver.get("https://www.facebook.com");
    	//driver.get("https://gmail.com");
    	String my_Title = driver.getTitle();
    	System.out.println("My Title:"+ my_Title);
    	System.out.println("Get URL:"+ driver.getCurrentUrl());
    	System.out.println("My Session ID"+ driver.getWindowHandle());
    	/*if(expectedTitle.equals(my_Title))
    	{
    	  System.out.println("Title Validation Failed");	
    	}
    	else
    	{
    		System.out.println("Title Validation Passed");
    	}*/
    	//Assert.assertEquals(actualTitle, expectedTitle); 
        Assert.assertTrue(my_Title.contains("Facebook"));
        System.out.println("Test Completed-Page Verified");
    }
    @Test
    public void enterUsername() throws InterruptedException
    {
    	verifyApplication();
    	System.out.println("Test Case:Enter Username");
    	driver.findElement(By.id("email")).sendKeys("Vipul");
    	driver.findElement(By.className("inputtext _55r1 _6luy")).click();
    	driver=new ChromeDriver();
    }
    @Test
   public void enterPassword() throws InterruptedException
   {
	   verifyApplication();
	   System.out.println("Test Case:Enter Password");
	   driver.findElement(By.id("pass")).sendKeys("***********");
	   driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).click();
   }
    @Test
    public void login() throws InterruptedException
    {
    	verifyApplication();
    	System.out.println(("Test Case:Login Successfull"));
    	driver.findElement(By.className("_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy")).click();
    	driver.findElement(By.tagName("submit")).click();
    }
    @Test
    public void forgottenPassword()
    {
    	verifyApplication();
    	System.out.println("Test Case: Forget Password");
    	driver.findElement(By.className("_97w4")).click();
    }
    @Test
    public void signUpForFacebook()
    {
    	verifyApplication();
    	System.out.println("Test Case: Sign Up For Facebook");
    	driver.findElement(By.className("_97w5")).click();
    }
    @Test
    public void languageForFacebook()
    {
    	verifyApplication();
    	//System.out.println("Test Case: Language For Facebook");
    	driver.findElement(By.className("_sv4")).click();
    }
    @Test
    public void hindiLanguageForFacebook()
    {
    	verifyApplication();
    	//System.out.println("Test Case: Language For Facebook");
    	driver.findElement(By.tagName("Hindi")).click();
    	driver.findElement(By.className("_sv4"));
    }
}
