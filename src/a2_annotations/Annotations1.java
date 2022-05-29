package a2_annotations;


import org.testng.annotations.*;

public class Annotations1 {

	@BeforeMethod
	void login()
	{
		System.out.println("Login.....");
	}
	
	@AfterMethod
	void logout()
	{
		System.out.println("Logout.....");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("Search test");
	}
	
	@Test(priority=2)
	void Advsearch()
	{
		System.out.println("Adv Search test");
	}
	
}

