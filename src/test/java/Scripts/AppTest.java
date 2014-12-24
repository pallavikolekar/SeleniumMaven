package Scripts;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
	@Test
	public void FirstDemo() throws MalformedURLException{
		//driver = new FirefoxDriver();
		/*DesiredCapabilities capability = DesiredCapabilities.firefox();
        capability.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4444/wd/hub"), capability);
		driver.get("http://www.google.com");*/
		
		URL url = new URL( "http", "localhost", 5555, "/wd/hub" );
		DesiredCapabilities capabilities =DesiredCapabilities.firefox();
		System.out.println("1");
		capabilities.setJavascriptEnabled(true);
		System.out.println("2");
		WebDriver driver = new RemoteWebDriver(url,capabilities);
		driver.get("http://www.google.com");
		Assert.assertEquals("Google",driver.getTitle());
		System.out.println("I m in test");
		driver.quit();
	}
}
