package Scripts;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
	
	@BeforeMethod
	public void InitilizeDriver() throws MalformedURLException {
		System.out.println("I m in before method");
		System.out.println("I m in Apptest");
		URL url = new URL( "http", "localhost", 5555, "/wd/hub" );
		DesiredCapabilities capabilities =DesiredCapabilities.firefox();
		capabilities.setJavascriptEnabled(true);
		driver = new RemoteWebDriver(url,capabilities);
	}
	
	
	
	@Test
	public void AppTestDemo()  {
		//driver = new FirefoxDriver();
		/*DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capability);
		driver.get("http://www.google.com");*/
		
		driver.get("http://www.google.com");
		Assert.assertEquals("Google1",driver.getTitle());		
	}
	
	@AfterMethod
	public void ClosedDriver() {
		System.out.println("I m in After Method");
		driver.quit();
	}
}
