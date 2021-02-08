package org.DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenLogin {
	
		String [][] data={
		
		{"testuser","L335pring!"},
		{"testuser","L335"},
		{"testuser","L335pr"},
		{"testuser","pring!"},
		};
	
	@DataProvider(name="logindata")
	public String [][] datapo() {
		return data;
	}
	
	@Test(dataProvider = "logindata")
	public static void loginDate(String S1, String S2) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\A\\Leespring\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
		findElement.click();

		WebElement findElement1 = driver.findElement(By.name("name"));
		findElement1.sendKeys(S1);
		
		WebElement findElement2 = driver.findElement(By.name("pass"));
		findElement2.sendKeys(S2);
		
		WebElement findElement11 = driver.findElement(By.xpath("//input[@value='Log in']"));
		findElement11.click();
		
		driver.close();


	}

}
