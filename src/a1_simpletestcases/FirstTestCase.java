package a1_simpletestcases;

import org.testng.annotations.Test;

public class FirstTestCase {

	
	@Test(priority=4)
	void closeapp()
	{
		System.out.println("close application");
	}
	
	@Test(priority=2)
	void login()
	{
		//Login code
		System.out.println("Login to application");
	}

	@Test(priority=1)
	void launchapp()
	{
		System.out.println("Launching application");
	}
	
	@Test(priority=3)
	void logout()
	{
		//Logout
		System.out.println("Logout from application");
	}
	
	
	
}
