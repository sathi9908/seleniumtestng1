package a1_simpletestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32 (2)\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.opencart.com/");
		  
		  driver.findElement(By.xpath("//a[@title='My Account']")).click();
		  driver.findElement(By.linkText("Register")).click();
		  driver.findElement(By.linkText("Login")).click();
		  
		  
		
	}

}
