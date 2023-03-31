package day06;

import org.testng.annotations.Test;

public class program02 {
	
	@Test(priority = 1)
	public void testCases04()
	{
		System.out.println("TC-04");
	}
	@Test(priority = 2)
	public void testCases05()
	{
		System.out.println("TC-05");
	}
	
	@Test(priority = 0)
	public void testCases01()
	{
		System.out.println("TC-01");
	}
	@Test(priority = 3)
	public void testCases02()
	{
		System.out.println("TC-02");
	}
	@Test(priority = 2)
	public void testCases03()
	{
		System.out.println("TC-03");
	}
	

}