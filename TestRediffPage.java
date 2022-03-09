package Selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRediffPage {
 static WebDriver driver;
 
	@BeforeClass
	public static void beforeclass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	@Test
	public void checkTitle(){
	String actTitle=driver.getTitle();
	Assert.assertEquals("Redifmail",actTitle);
	}

@Test
public void checkErrorMessage() {
	driver.findElement(By.id("Login1")).sendKeys("abc");
	driver.findElement(By.id("password")).sendKeys("abc");
	driver.findElement(By.name("proceed")).click();
	String actErrMsg=driver.findElement(By.id("div_login_error")).getText();
	Assert.assertTrue(actErrMsg. contains("Wrong username and password combination."));
}
@AfterClass
public static void afterClass() {
	driver.quit();
}
}
