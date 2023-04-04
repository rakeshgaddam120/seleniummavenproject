package day07;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class program02 {
	
	@Test(groups = {"testabc"})
	public void testcase05()
	{
		System.out.println("Test-05");
	}
	@Test
	public void testcase06()
	{
		System.out.println("Test-06");
	}

	@Test(groups = {"testabc"})
	public void testcase07()
	{
		System.out.println("Test-07");
	}

	@Test(groups = {"testabc"})
	public void testcase08()
	{
		System.out.println("Test-08");
	}

	@BeforeGroups(groups = {"testabc"})
	public void beforeGrp()
	{
		System.out.println("Before Group");
	}
	
	@AfterGroups(groups = {"testabc"})
	public void afterGrp()
	{
		System.out.println("After Group");
	}
	

}