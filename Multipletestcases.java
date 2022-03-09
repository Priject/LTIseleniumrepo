package Selenium;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Multipletestcases {
	WebDriver driver;
	
	
  @Test(priority=3)
  
  public void visitBusiness() {
	  driver.findElement(By.linkText("Business")).click();
	 
  }
  
 @Test(priority=1)
  
  public void visitPrivacy() {
	  driver.findElement(By.linkText("Privacy")).click();
	 
  }
 @Test(priority=2)
 
 public void visitTerms() {
	  driver.findElement(By.linkText("Terms")).click();
	 
 }
 @Test(priority=4)
 
 public void visitAbout() {
	  driver.findElement(By.linkText("About")).click();
	 
 }
 @Test(priority=3)
 
 public void visitAdvertising() {
	  driver.findElement(By.linkText("Advertising")).click();
	 
 }
 
  @AfterMethod
  public void afterMethod()throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(3000);
	  
  }
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dharshni\\chromedriver.exe");
	driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com");
}
@AfterTest
public void afterTest() {
	driver.close();
	
	
}
}