package testNGtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgBasic {

	@BeforeSuite
	public void setUp() {
		System.out.println("Setup system property for chrome");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser");
		
	}
	@BeforeMethod 
	public void enterUrl () {
		System.out.println("enter URL");
	}
	
	@Test 
	public void googleLogoTest() {
		System.out.println("Logo Test");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("LogOut");
	}
	@AfterTest
	public void clearCookies() {
		System.out.println("clear Cookies");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	@AfterSuite
	public void generateReport() {
		System.out.println("Generate Report");
	}
}
