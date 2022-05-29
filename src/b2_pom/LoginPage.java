package b2_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	By img_logo_loc=By.xpath("//div[@id='divLogo']//img");
	By txt_username_loc=By.id("txtUsername");
	By txt_password_loc=By.id("txtPassword");
	By btn_login_loc=By.name("Submit");
	
	//Action methods
	public boolean checkLogoPresence      ()
	{
		boolean status=driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
	
	
	public void setUserName(String name)
	{
		driver.findElement(txt_username_loc).sendKeys(name);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(txt_password_loc).sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login_loc).click();
	}
	
}