package day06;

import org.testng.annotations.*;

public class program06 {
	
	@BeforeMethod
	public void testBefore()
	{
		System.out.println("Before Test");
	}
	@AfterMethod
	public void testAfter()
	{
		System.out.println("After Test");
	}	
	
	@Test
	public void testCases01()
	{
		System.out.println("TC-01");
	}
	@Test
	public void testCases02()
	{
		System.out.println("TC-02");
	}
	@Test
	public void testCases03()
	{
		System.out.println("TC-03");
	}
	

}