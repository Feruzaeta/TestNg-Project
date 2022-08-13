package testNGtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

	private WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a [text()='Shifting Content']")).click();
		driver.findElement(By.linkText("Example 1: Menu Element")).click();
		List<WebElement>menuItems = driver.findElements(By.tagName("li"));
		System.out.println("Number of menu items"+menuItems.size());
		driver.quit();
		
		
	}
	public static void main(String[] args) {
		FindingElements test= new FindingElements();
		test.setUp();
	}
	
}
