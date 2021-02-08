package org.leespring;


import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BrowserLaunch1 {
	
	static WebDriver driver;
	
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
	}	
	}
