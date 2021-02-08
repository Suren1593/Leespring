package org.leespring;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiveTimes {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.partialLinkText("Sign Up/Log In"));
		findElement.click();
		Thread.sleep(1000);
		
		WebElement findElement1 = driver.findElement(By.name("name"));
		findElement1.sendKeys("testuser");
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys("Suren@123");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File soc= ts.getScreenshotAs(OutputType.FILE);
		File dec = new File("D:\\Leespring Lockertimer\\5Times\\1.png");
		FileUtils.copyFile(soc, dec);
		
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Suren@111");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.name("pass")).sendKeys("Suren@222");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
