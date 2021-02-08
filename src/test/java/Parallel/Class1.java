package Parallel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	public void Test1() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.className("has-submenu"));
		Actions a = new  Actions(driver);
		a.moveToElement(findElement).perform();
		
		WebElement findElement2 = driver.findElement(By.partialLinkText("Extension Springs"));
		findElement2.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("(//input[@name='compare'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='compare'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='compare'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='butn1']")).click();
		Thread.sleep(2000);
		
		WebElement findElement3 = driver.findElement(By.partialLinkText("Extension Springs"));
		js.executeScript("arguments[0].click();", findElement3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dec = new File("D:\\Leespring Lockertimer\\SS2.png");
		FileUtils.copyFile(screenshotAs, dec);
		

	}
	@Test
	public void Test2() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.className("has-submenu"));
		Actions a = new  Actions(driver);
		a.moveToElement(findElement).perform();
		
		WebElement findElement2 = driver.findElement(By.partialLinkText("Extension Springs"));
		findElement2.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("(//input[@name='compare'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='compare'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='compare'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='butn1']")).click();
		Thread.sleep(2000);
		
		WebElement findElement3 = driver.findElement(By.partialLinkText("Extension Springs"));
		js.executeScript("arguments[0].click();", findElement3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dec = new File("D:\\Leespring Lockertimer\\SS2.png");
		FileUtils.copyFile(screenshotAs, dec);
		
		
	}
	@Test
	public void Test3() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.className("has-submenu"));
		Actions a = new  Actions(driver);
		a.moveToElement(findElement).perform();
		
		WebElement findElement2 = driver.findElement(By.partialLinkText("Extension Springs"));
		findElement2.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("(//input[@name='compare'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='compare'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='compare'])[3]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='butn1']")).click();
		Thread.sleep(2000);
		
		WebElement findElement3 = driver.findElement(By.partialLinkText("Extension Springs"));
		js.executeScript("arguments[0].click();", findElement3);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File dec = new File("D:\\Leespring Lockertimer\\SS2.png");
		FileUtils.copyFile(screenshotAs, dec);

	}
}
