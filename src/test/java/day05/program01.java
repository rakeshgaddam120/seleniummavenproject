package day05;

import org.junit.*;
import org.junit.Test;

public class program01 {
	
	@Test
	public void testcase01()
	{
		System.out.println("Log-IN");
	}
	
	@Test
	public void testcase02()
	{
		System.out.println("Log-OUT");
	}
	
	@After
	public void afterTestCase()
	{
		System.out.println("Close Browser");
		System.out.println("###################");
		
	}
	
	@Before
	public void beforeTestCase()
	{
		System.out.println("###################");
		System.out.println("Open Browser");
		System.out.println("Open Application");
	}
	

}