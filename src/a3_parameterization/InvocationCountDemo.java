package a3_parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountDemo {

	@Test(invocationCount=3)
	void verifyTitle()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login");
		
		Assert.assertEquals("nopCommerce demo store. Login", driver.getTitle());
		
		driver.quit();
	}
}