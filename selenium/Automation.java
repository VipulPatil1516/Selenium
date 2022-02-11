package selenium;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {


	//In Selenium software we have a Interface called WebDrier .
	//WebDriver interface has implemented by different classes like Chrome,Firefox,IE ....
	//WebDriver contains different functions to do different operations on a web application.
	//WebDriver : get() - to call any url on a open browser
	//The Constructor of each class who implemented WebDriver will open the respective browser automatically.

	//IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property
	//SessionNotCreatedException : org.openqa.selenium.SessionNotCreatedException: Could not start a new session. Response code 500. Message: session not created: This version of ChromeDriver only supports Chrome version 97
	     //Current browser version is 90.0.4430.212 with binary path C:\Program Files (x86)\Google\Chrome\Application\chrome.exe
	//WebDriver : get(),getTitle(),getUrl(),getWindowHandle,getWindowHandles,refresh,close,quit
			//findElement , findElements , switch  .......
	//Selenium WebDriver will use the HTML document [DOM] of the web page for its object identification.
	//How to open the HTML Doc : Open Developer tool in your browser [ F12 , or RightClick->Inspect -> Elements tab will have the Html page]
	 //HTML Doc[DOM] will contain the attributes of each element present in the current web page we opened.
	//Test Case : Gmail Application Title validation
	//By : ID , Name , Class , Css , linkText , partialLinkText , tagName , xpath
	//WebElement : click , clear , sendKeys , isDisplayed , isEnabled , getText , getAttribute , findElement , findElements
	String expectedTitle = "Gmail"; //TestData 
	@Test
	public void launchApplication() throws InterruptedException
	{
		System.out.println("Test Case : Launch Application");		
		System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\JarFiles\\chromedriver-win32-90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com"); //We have to call URL of AUT 
		String actualTitle = driver.getTitle();
		System.out.println("My title :" + actualTitle);
		System.out.println("My url :" + driver.getCurrentUrl());
		System.out.println("My session ID :" + driver.getWindowHandle());
		if(expectedTitle.equals(actualTitle)) //Custom validation
		{
			System.out.println("Title Validation Passed"); //We will report it in a html file
		}
		else
		{
			System.out.println("Title Validation Failed");
		}
		Assert.assertEquals(expectedTitle, actualTitle);
		WebElement emailObj = driver.findElement(By.name("identifier"));
		if(emailObj.isDisplayed() && emailObj.isEnabled())
		{
			emailObj.click();
			emailObj.sendKeys("gfggfdgfg");
			Thread.sleep(2000);
			emailObj.clear();
			Thread.sleep(2000);
			emailObj.sendKeys("nag022@gmail.com");
		}
		else
		{
			System.out.println("Email or phone number object is not displayed / not enabled");
		}

		driver.findElement(By.name("identifier")).sendKeys("nag022");

	}
	@Test
	public void loginToApplication()
	{
		System.out.println("Test Case : Login To Application");
	}

	//Demonstrate : IllegalStateException 
	//Write a program to get SessionNotCreatedException
	//Write a program to get NullPointer exception.
	//Write program to validate titles of Yahoo,Amazon,Flipkart using both Junit Assertions and custom assertions. 










}