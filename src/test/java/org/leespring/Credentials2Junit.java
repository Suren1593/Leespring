package org.leespring;


import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Credentials2Junit {
	
	 public static WebDriver driver;
	
	@BeforeClass
	public static void launchBrowser() throws InterruptedException {
		
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
	
	}
	@Before
	public void launchSighIn() {
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
		findElement.click();

	}
	@After
	public void launchLogout() {
		WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
		findElement.click();

	}
	@Test //Valid Username and Valid Password
	public void login1() throws InterruptedException { 
		
		WebElement findElement1 = driver.findElement(By.name("name"));
		findElement1.sendKeys("testuser");
		String attribute = findElement1.getAttribute("value");
		Assert.assertEquals("Valid Username", "testuser", attribute);
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys("L335pring!");
		String attribute2 = findElement2.getAttribute("value");
		Assert.assertEquals("Valid Password", "L335pring!", attribute2);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@value='Log in']"));
		findElement.click();

	}
	
	@Test //Valid Username and Invalid Password
	public void login2() {
		
		WebElement findElement1 = driver.findElement(By.name("name"));
		findElement1.sendKeys("testuser");
		String attribute = findElement1.getAttribute("value");
		Assert.assertEquals("Valid Username", "testuser", attribute);
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys("L335pring");
		String attribute2 = findElement2.getAttribute("value");
		Assert.assertEquals("Invalid Password", "L335pring!", attribute2);
		
		WebElement findElement = driver.findElement(By.xpath("//input[@value='Log in']"));
		findElement.click();

	}
	
	@Test //Invalid Username and valid Password
	public void login3() {
	
	WebElement findElement1 = driver.findElement(By.name("name"));
	findElement1.sendKeys("testuse");
	String attribute = findElement1.getAttribute("value");
	Assert.assertEquals("Invalid Username", "testuser", attribute);
	
	WebElement findElement2 = driver.findElement(By.name("pass"));
	findElement2.sendKeys("L335pring!");
	String attribute2 = findElement2.getAttribute("value");
	Assert.assertEquals("valid Password", "L335pring!", attribute2);
	
	WebElement findElement = driver.findElement(By.xpath("//input[@value='Log in']"));
	findElement.click();

	}
	
	@Test //Invalid Username and Invalid Password
	public void login4() {
	
	WebElement findElement1 = driver.findElement(By.name("name"));
	findElement1.sendKeys("testuse");
	String attribute = findElement1.getAttribute("value");
	Assert.assertEquals("Invalid Username", "testuser", attribute);
	
	WebElement findElement2 = driver.findElement(By.name("pass"));
	findElement2.sendKeys("L335pring");
	String attribute2 = findElement2.getAttribute("value");
	Assert.assertEquals("Invalid Password", "L335pring!", attribute2);

	WebElement findElement = driver.findElement(By.xpath("//input[@value='Log in']"));
	findElement.click();
	
	}
	
	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}
		

	}


