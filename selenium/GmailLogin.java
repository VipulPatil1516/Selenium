package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GmailLogin
{
	@Test
   public static void main(String[] args) throws InterruptedException   
   {
      System.setProperty("webdriver.chrome.driver","E:\\Software\\JarFiles\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.gmail.com");
      driver.findElement(By.id("identifierId")).sendKeys("priyajkumart",Keys.ENTER);
      Thread.sleep(3000);
      driver.findElement(By.name("password")).sendKeys("PASSWORD",Keys.ENTER);
      Thread.sleep(4000);
      driver.close();
   }
}