
package TestNG_Ex.example;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	//test case is pass without any assert-by checking the flow 
  @Test
public void test1() {
	  WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nello\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver wd=new ChromeDriver();
      wd.manage().window().maximize();
      wd.get("https://www.google.com/");
      wd.close();
  }
  @Test
public void test2() {
	  WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nello\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver wd=new ChromeDriver();
      wd.manage().window().maximize();
      wd.get("https://www.amazon.in/");
      wd.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles"); 
      wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
      wd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
 
      System.out.println("product added succesfully");
      wd.close();
  }
    
 public void test3() {
      
      WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\nello\\Downloads\\chromedriver_win32\\chromedriver.exe");
      WebDriver wd=new ChromeDriver();
      wd.manage().window().maximize();
      wd.get("https://www.amazon.in/");
      wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
      wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
      System.out.println("login page");
      wd.close();
 }
}





