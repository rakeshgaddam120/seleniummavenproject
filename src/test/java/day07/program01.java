package day07;

import org.testng.annotations.Test;

public class program01 {
	
	@Test(groups = {"testabc"})
	public void testcase01()
	{
		System.out.println("Test-01");
	}
	@Test(groups = {"abc"})
	public void testcase02()
	{
		System.out.println("Test-02");
	}

	@Test(groups = {"testabc"})
	public void testcase03()
	{
		System.out.println("Test-03");
	}

	@Test(groups = {"testabc","abc"})
	public void testcase04()
	{
		System.out.println("Test-04");
	}

	

}