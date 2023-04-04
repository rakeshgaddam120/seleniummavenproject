package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class program03 {
	
	WebDriver driver;
	
	
	@Test(dataProvider = "demoTest")
	public void testCase(String userName,String password)
	{
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@DataProvider(name="demoTest")
	public Object[][] testData1()
	{
		
		return new Object[][] {{"user1","pwd1"},
			{"user2","pwd2"},
			{"user3","pwd3"}};
	}
	

}