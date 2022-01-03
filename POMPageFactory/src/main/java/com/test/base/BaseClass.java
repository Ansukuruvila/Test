/**
 * 
 */
package com.test.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * @author ASUS
 *
 */
public class BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\selenium tutorial\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://minc-ecofashion.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	
	}
	
}
	


