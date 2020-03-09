package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
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
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.wait(5000);
	driver.get("https://www.google.com/");
	WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
	searchbox.sendKeys("what is selenium");		
	}

	/*
	@AfterTest
	public void tearDown(WebDriver driver) {
		driver.close();
		driver.quit();		
	}*/
}
