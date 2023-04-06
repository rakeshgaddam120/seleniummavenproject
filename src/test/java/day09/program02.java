package day09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(listener.class)
public class program02  extends framework{
	
	
	
	
	@Test
	public void testCase()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("ChromeUsr1");
		driver.findElement(By.name("password22")).sendKeys("password");
	}
	


}