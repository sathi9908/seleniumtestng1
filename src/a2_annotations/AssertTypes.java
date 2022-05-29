package a2_annotations;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTypes {
	
/*	@Test
	void test_hardassertions()
	{
		Assert.assertEquals("abc","xyz");
		System.out.println("Hard assertion is completed");
	}*/
	
	@Test
	void soft_assertions()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("abc", "xyz");
		System.out.println("Soft assertion is completed");
		sa.assertAll();//must be specified
	}
	
	

}
