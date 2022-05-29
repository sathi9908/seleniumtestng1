package a2_annotationspack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTest1 {
	
	@Test(priority=1)
	void test_insert()
	{
		System.out.println("Insertion test completed");
	}
	@Test(priority=2)
	void test_update()
	{
		System.out.println("Update test completed");
	}
	@BeforeTest
	void connect_Database()
	{
	System.out.println("Database connected...");
	}

}
