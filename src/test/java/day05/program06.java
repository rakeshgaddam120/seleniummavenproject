package day05;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class program06 {
	
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
		System.out.println("Before All---@@@@@@@");
		
	}
	
	
	@AfterAll
	public static void afterTestCase()
	{
		System.out.println("After ALL---@@@@@@@");
		
	}
	@BeforeEach
	public void beforeEachTestCase()
	{
		System.out.println("Open Browser");
		
	}
	
	@AfterEach
	public void afterEachTestCase()
	{
		System.out.println("Close Browser");
		
	}

}