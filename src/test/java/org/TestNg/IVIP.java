package org.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IVIP {
	
	@Test
	@Parameters({"username","password"})
	public void name(String username,String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
		findElement.click();
		
		WebElement findElement1 = driver.findElement(By.name("name"));
		findElement1.sendKeys(username);
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys(password);
	}

}
