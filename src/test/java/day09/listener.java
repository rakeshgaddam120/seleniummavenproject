package day09;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
	framework framework;
	
	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("execution started");
	}
	
	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("execution completed");
	}
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		try {
			Thread.sleep(2000);
			framework.browserRefresh();
			System.out.println("execution failed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}