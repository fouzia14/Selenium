package com.edureka.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName {
	public static WebDriver driver = null;

	public static void main(String a[]) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEL\\Edureka_Selenium\\SeleniumProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // upcasting
		driver.get("https://www.facebook.com");
		org.openqa.selenium.WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Fouzia");
	}
}
