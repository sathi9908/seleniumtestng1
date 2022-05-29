package a3_parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	 @BeforeClass
	 void setup()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver=new ChromeDriver();
		}
	 
	 @Test(dataProvider="dp1")
	 void test_login(String uname,String pass) 
	 
	 {
		 driver.get("https://demo.nopcommerce.com/login");
			driver.findElement(By.id("Email")).sendKeys(uname);
			driver.findElement(By.id("Password")).sendKeys(pass);
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			
			String exp_title="nopCommerce demo store";
			String act_title=driver.getTitle();
			
			Assert.assertEquals(exp_title, act_title);
			
		 
	 }
	 
	 @AfterClass
	 void tearDown()
	 {
		 driver.quit();
		 
	 }
	 
	 
	 @DataProvider(name="dp1")
	 Object[][] logindata()
	 {
		 Object data[][]={{"gajjalasatheesh@gmail.com","test@123"},
				 			{"satheesh@gamil.com","test@123"},
				 			{"gajjalasatheesh@gamil.com","tet@"}
	 };
		
		 return data;
		 
	 }

}
