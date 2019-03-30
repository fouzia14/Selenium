package com.edureka.Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LocatorById {

	public static WebDriver driver = null;

	public static void main(String a[]) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEL\\Edureka_Selenium\\SeleniumProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // upcasting
		driver.get("https://www.facebook.com");
		driver.manage();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sweet_angel14u14@yahoo.com");
		WebElement password =driver.findElement(By.id("pass"));
		password.sendKeys("fouzia");
		WebElement Click =driver.findElement(By.id("u_0_2"));
		Click.click();
		driver.quit();
		
		
		
	}

}

