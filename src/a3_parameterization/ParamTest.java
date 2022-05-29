package a3_parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appurl) throws InterruptedException 
	{
		if(br.equals("chrome"))
		{
		  System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			 System.setProperty("webdriver.edge.driver", "C:\\drivers\\edgedriver_win64\\msedgedriver.exe");
			  driver=new EdgeDriver();	
		}
		
		else if(br.equals("firefox"))
		{
			 System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			  driver=new FirefoxDriver();	
		}
		
		
		
		  driver.get(appurl);
		  Thread.sleep(30000);
	
		  
	}
	@Test(priority=1)
	void testLogo()
	{
		boolean status=driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
		Assert.assertEquals(status, true,"Logo is not present");
		
		
	}
	@Test(priority=2)
	void testTitle()
	{
		String act_title=driver.getTitle();
		Assert.assertEquals(act_title, "OrangeHRM","titles are not matched");
		
		
	}
	@AfterClass
	void tearDown()
	{
		driver.quit();
		
	}
	
	
}
