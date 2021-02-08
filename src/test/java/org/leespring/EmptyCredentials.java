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
import org.openqa.selenium.interactions.Actions;

public class EmptyCredentials {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement findElement = driver.findElement(By.partialLinkText("Sign Up/Log In"));
		findElement.click();
		Thread.sleep(1000);
		Robot r = new Robot();
		driver.findElement(By.xpath("//a[@class='login-logout']"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		TakesScreenshot tk = (TakesScreenshot) driver;
		File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
		File f = new File("D:\\Leespring Lockertimer\\Error.png");
		FileUtils.copyFile(screenshotAs, f);
		
		driver.close();
		
		
	
	}
	

}
