package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase4 {
	
	
	
	/*@BeforeTest
	public WebDriver driverinit() {
	WebDriverManager.chromedriver().setup();
	return driver;	
	}*/
	
	@Test
	public void navigatetoGoogle() throws InterruptedException {
	WebDriver driver = null;
	System.setProperty("webdriver.edge.driver", "C:\\Users\\dhire\\Desktop\\New folder (3)\\edgedriver_win64\\msedgedriver.exe");
	/*
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--whitelist-ip *");
	chromeOptions.addArguments("--proxy-server='direct://'");
	chromeOptions.addArguments("--proxy-bypass-list=*");*/
	driver = new EdgeDriver();
	
//	driver.wait(5000);
	driver.get("https://www.google.com/");
	WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
	searchbox.sendKeys("what is selenium is used for");
	}

	/*
	@AfterTest
	public void tearDown(WebDriver driver) {
		driver.close();
		driver.quit();		
	}*/
}
