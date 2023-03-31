package day02;

import java.io.File;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class framework {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void browser(String browserValue)
	{
		switch (browserValue) {
		case "chrome":
			driver = new ChromeDriver();
			test.log(LogStatus.INFO, "Open Chrome Browser");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			test.log(LogStatus.INFO, "Open Firefox Browser");
			break;
		case "edge":
			driver = new EdgeDriver();
			test.log(LogStatus.INFO, "Open Edge Browser");
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			test.log(LogStatus.INFO, "Open IE Browser");
			break;
		}
	}

	public static void appUrl(String url)
	{
		driver.get(url);
		test.log(LogStatus.INFO, "Open application url: "+url);
	}

	public static void typeIn(String xpathValue,String dataValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
		test.log(LogStatus.INFO, "User Enter Value in "+fieldName+" as "+dataValue);
	}

	public static void clickIn(String xpathValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).click();
		test.log(LogStatus.INFO, "User clicked in "+fieldName);
	}

	public static void clearAll(String xpathValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).clear();
		test.log(LogStatus.INFO, "User cleared data in "+fieldName);
	}

	public static void selDropdownByIndex(String xpathValue,int dataValue,String fieldName)
	{
		Select dropDown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByIndex(dataValue);
		test.log(LogStatus.INFO, "User Selected dropdown in "+fieldName+ " as "+dataValue);
		
	}

	public static void selDropdownByValue(String xpathValue,String dataValue,String fieldName)
	{
		Select dropDown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByValue(dataValue);
		test.log(LogStatus.INFO, "User Selected dropdown in "+fieldName+ " as "+dataValue);
		
	}
	public static void selDropdownByText(String xpathValue,String dataValue,String fieldName)
	{
		Select dropDown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByVisibleText(dataValue);
		test.log(LogStatus.INFO, "User Selected dropdown in "+fieldName+ " as "+dataValue);
		
	}

	public static void windowMax()
	{
		driver.manage().window().maximize();
	}

	public static void windowMin()
	{
		driver.manage().window().minimize();
	}
	public static void windowFullScreen()
	{
		driver.manage().window().fullscreen();
	}

	public static void browserBack()
	{
		driver.navigate().back();
	}

	public static void browserForward()
	{
		driver.navigate().forward();
	}
	
	
	public static void browserRefresh()
	{
		driver.navigate().refresh();
	}

	public static void close()
	{
		driver.close();
	}

	public static void quit()
	{
		driver.quit();
	}

	public static String getPageTitle()
	{
		return driver.getTitle();
	}

	public static String getPageURL()
	{
		return driver.getCurrentUrl();
	}

	public static void alertOk()
	{
		driver.switchTo().alert().accept();
	}

	public static void alertCancel()
	{
		driver.switchTo().alert().dismiss();
	}

	public static void alertTypeIn(String dataValue)
	{
		driver.switchTo().alert().sendKeys(dataValue);
	}

	public static String getAlertText()
	{
		return driver.switchTo().alert().getText();
	}

	public static Set<String> getWindowIds()
	{
		return driver.getWindowHandles();
	}

	public static String getWindowId()
	{
		return driver.getWindowHandle();
	}

	public static void switchToFrame(String frameNameId)
	{
		driver.switchTo().frame(frameNameId);
	}

	public static void switchToFrameByXpath(String xpathValue)
	{
		driver.switchTo().frame(driver.findElement(By.xpath(xpathValue)));
	}

	public static void switchToMainFrame()
	{
		driver.switchTo().defaultContent();
	}


	public static void actionDragAndDrop(String src,String des)
	{
		Actions action = new Actions(driver);
		WebElement srcxpath = driver.findElement(By.xpath(src));
		WebElement desxpath = driver.findElement(By.xpath(des));
		action.dragAndDrop(srcxpath, desxpath).build().perform();

	}


	public static void actionDoubleClick(String xpathValue)
	{
		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.xpath(xpathValue));
		action.doubleClick(src).build().perform();

	}


	public static void actionClick(String xpathValue)
	{
		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.xpath(xpathValue));
		action.click(src).build().perform();

	}

	public static void actionRightClick(String xpathValue)
	{
		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.xpath(xpathValue));
		action.contextClick(src).build().perform();

	}

	public static void actionMouseHover(String xpathValue)
	{
		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.xpath(xpathValue));
		action.moveToElement(src).build().perform();

	}

	public static void takeScreenShot(String fileName) throws Exception
	{
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./ScreenShot/"+fileName+".png");
		FileUtils.copyFile(scr, des);		
	}

	public static void startReport(String fileName)
	{
		report = new ExtentReports(".\\src\\test\\resources\\"+fileName+".html");	
	}

	public static void endReport()
	{
		report.flush();
	}


	public static void startTest(String testName,String description)
	{
		test = report.startTest(testName,description);

	}

	public static void endTest()
	{
		report.endTest(test);
	}
}