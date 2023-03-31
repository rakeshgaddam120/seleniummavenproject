package day05;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class program03 {
	
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
	
	@BeforeAll
	public static void beforeTestCase()
	{
		System.out.println("@@@@@@@");
		
	}
	
	@BeforeEach
	public void beforeEachTestCase()
	{
		System.out.println("Open Browser");
		
	}

}