package b2_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver driver;
	
	LoginPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//div[@id='divLogo']//img")
	WebElement img_logo;
	

	@FindBy(id="txtUsername")
	WebElement txt_username;
	
	@FindBy(name="txtPassword")
	WebElement txtPassword;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	//Action methods
	public boolean checkLogoPresence      ()
	{
		boolean status=img_logo.isDisplayed();
		return status;
	}
	
	
	public void setUserName(String name)
	{
		txt_username.sendKeys(name);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
}