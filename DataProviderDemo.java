package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	    WebDriver driver;
     
	 @BeforeTest
     
     public void beforeTest(){
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium Software\\chromedriver.exe");
 		driver = new ChromeDriver();
 		driver.get("http://www.echotrak.com"); 
 		driver.manage().window().maximize();
     }
	 
	 @Test(dataProvider = "dp")
	 public void validatelogin(String un,String pwd) { 
		 driver.findElement(By.id("txtCustomerID")).sendKeys();
		 driver.findElement(By.id("txtPassword")).sendKeys();
		 driver.findElement(By.id("Butsub")).click();
		// String actMsg=driver.findElement(By.id("lblMsg")).getText();
	      //  Assert.assertEquals(actMsg,"Invalid Username/Password");
	 }
	 
	 @AfterMethod
	 public void afterMethod() {
		 driver.findElement(By.id("txtCustomerID")).clear();
	 }
	 
	 @DataProvider
	 public Object[][] dp(){
		 Object [][] data = new Object[3][2];
		 data[0][0] = "user1";
		 data[0][1] = "pass1";
		 data[1][0] = "user2";
		 data[1][1] = "pass2";
		 data[2][0] = "user3";
		 data[2][1] = "pass1";
		return data;
				 
	 }
	 
	 @AfterTest
	 public void afterTest() {
		 driver.close();
	 }
}





