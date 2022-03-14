package com.qa.SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nello\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	//	driver.findElements(By.xpath("//input[@type='text']")).get(0).sendKeys("vijay");
		
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Namala Vijay");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("admin123");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]").click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("password@123");

	}

}
