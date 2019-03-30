package com.edureka.Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/** Driver is launched using webdriver class by setting the executable jar file of respective driver 
 * close method of driver is called to close the opened browser*/

/** WebElements are textboxes,radiobuttons,chcekboxes,dropdowns or anyother elemnst on the webPage*/

/** To identify the web elements we have different locators like id*/
class LaunchChrome {

	public static WebDriver driver = null;

	public static void main(String a[]) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DEEL\\Edureka_Selenium\\SeleniumProject\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // upcasting
		driver.get("https://www.facebook.com");
		//driver.close();
	}
}
