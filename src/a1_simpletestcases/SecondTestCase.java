package a1_simpletestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTestCase 
{
	WebDriver driver;
	
  @Test(priority=1)
 void openApp() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://admin-demo.nopcommerce.com/login");
  }
  
  @Test(priority=2)
  void login()
  {
	  driver.findElement(By.id("Email")).clear();
	  driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	  
	  driver.findElement(By.id("Password")).clear();
	  driver.findElement(By.id("Password")).sendKeys("admin");
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	
	  String actTitle=driver.getTitle();
	  
	  if(actTitle.equals("Dashboard / nopCommerce administration"))
	  {
		  System.out.println("Test Passed");
	  }
	  else
	  {
		  System.out.println("Test Failed");
	  }
  }
  
  @Test(priority=3)
  void closeApp()
  {
	  driver.close();
  }
}