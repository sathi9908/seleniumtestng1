package a2_annotationspack1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTest2 {
	@Test(priority=1)
	void test_select()
	{
		System.out.println("select test completed");
	}
	@Test(priority=2)
	void test_delete()
	{
		System.out.println("delete test completed");
	}
	@AfterTest
	void disconnect_Database()
	{
	System.out.println("Database disconnected...");
	}

}
