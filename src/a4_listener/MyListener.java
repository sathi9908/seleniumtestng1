package a4_listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{

	public void onTestStart(ITestResult result) 
	{
	  System.out.println("My Test is started..."+result.getName());
	  }
	
	public void onTestSuccess(ITestResult result) 
	{
		 System.out.println("My Test is Passed..."+result.getName());
	  }
	
	public void onTestFailure(ITestResult result) 
	{
		 System.out.println("My Test is Failed..."+result.getName());
	  }
	
	  public void onTestSkipped(ITestResult result) 
	  {
		  System.out.println("My Test is Skipped..."+result.getName());
		}
}