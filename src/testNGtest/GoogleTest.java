package testNGtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;

@BeforeMethod
public void setup () {
	System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
}
@Test
public void facebookTitleTest() {
	String title = driver.getTitle();
	System.out.println(title);

}
@Test 
public void facebookLogoTest () {
boolean b= driver.findElement(By.xpath("//*[@alt='Facebook']")).isDisplayed();
	
}
@Test 
public void login() {
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("feryme@gmail.com");
}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	

}
