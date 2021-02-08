package org.TestNg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Credentials2TestNG {

	 public static WebDriver driver;
		
		@BeforeClass
		public static void launchBrowser() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.leespring.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		
		
		@Test //Valid Username and Valid Password
		@Parameters({"username","password"})
		public void login1(String username,String password) throws InterruptedException { 
			WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement.click();

			WebElement findElement1 = driver.findElement(By.name("name"));
			findElement1.sendKeys(username);
			
			WebElement findElement2 = driver.findElement(By.name("pass"));
			findElement2.sendKeys(password);
			
			WebElement findElement11 = driver.findElement(By.xpath("//input[@value='Log in']"));
			findElement11.click();
			
			WebElement findElement13 = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement13.click();

		}
		
		@Test //Valid Username and Invalid Password
		@Parameters({"username","password"})
		public void login2(String username,String password) {
			
			WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement.click();

			WebElement findElement1 = driver.findElement(By.name("name"));
			findElement1.sendKeys(username);
			
			WebElement findElement2 = driver.findElement(By.name("pass"));
			findElement2.sendKeys(password);
			
			WebElement findElement11 = driver.findElement(By.xpath("//input[@value='Log in']"));
			findElement11.click();
			
			WebElement findElement13 = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement13.click();

		}
		
		@Test //Invalid Username and valid Password
		@Parameters({"username","password"})
		public void login3(String username,String password) {
		
			WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement.click();

			WebElement findElement1 = driver.findElement(By.name("name"));
			findElement1.sendKeys(username);
			
			WebElement findElement2 = driver.findElement(By.name("pass"));
			findElement2.sendKeys(password);
			
			WebElement findElement11 = driver.findElement(By.xpath("//input[@value='Log in']"));
			findElement11.click();
			
			WebElement findElement13 = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement13.click();

		}
		
		@Test //Invalid Username and Invalid Password
		@Parameters({"username","password"})
		public void login4(String username,String password) {
		
			WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement.click();

			WebElement findElement1 = driver.findElement(By.name("name"));
			findElement1.sendKeys(username);
			
			WebElement findElement2 = driver.findElement(By.name("pass"));
			findElement2.sendKeys(password);
			
			WebElement findElement11 = driver.findElement(By.xpath("//input[@value='Log in']"));
			findElement11.click();
			
			WebElement findElement13 = driver.findElement(By.xpath("//a[@class='login-logout']"));
			findElement13.click();
		
		}
		
		@AfterClass
		public static void closeBrowser() {
			driver.quit();

		}
			

}
