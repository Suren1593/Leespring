package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 {
	
	@Test
	public void name2() throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "D:\\A\\Leespring\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.leespring.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='login-logout']"));
		findElement.click();
		
		driver.close();

	}
		
	}


