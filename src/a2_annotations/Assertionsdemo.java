package a2_annotations;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionsdemo {
	
	
	@Test
	void test()
	{
		int a=20;
		int b=10;
		
		String s1="abc";
		String s2="xyz";
		
		//Assert.assertTrue(a==b);//true
		//Assert.assertFalse(a==b);//false
		
		//Assert.fail();
		
		//Assert.assertEquals(a,b,"values are different...");
		Assert.assertEquals(s1,s2,"values are different...");
		
		
		
		
		
		
	}

}
