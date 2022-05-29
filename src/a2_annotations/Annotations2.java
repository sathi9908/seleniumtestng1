package a2_annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeClass
	void login()
	{
		System.out.println("Login.....");
	}
	
	@AfterClass
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
	
	@Test(priority=3)
	void prepaidrecharge()
	{
		System.out.println("Pre paid Recharge test");
	}
	
	@Test(priority=4)
	void postpaidrecharge()
	{
		System.out.println("Post paid Recharge test");
	}

}
