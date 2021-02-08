package org.leespring;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class LeespringCompare {
	
	 public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Browser Name to Launch");
		String nextLine = sc.nextLine();		
		if (nextLine.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.leespring.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		} else if (nextLine.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\A\\Leespring\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.leespring.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
		} else if (nextLine.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\A\\Leespring\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get("https://www.leespring.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
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
		
		
		
//		Screenshot screen = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(50)).takeScreenshot(driver);
//		ImageIO.write(screen.getImage(),"png", new File("D:\\Leespring Lockertimer\\Compare11.png"));
		
		driver.quit();
	}
	
}
