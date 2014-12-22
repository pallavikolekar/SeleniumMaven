package Scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	WebDriver driver;
	@Test
	public void FirstDemo(){
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Assert.assertEquals("Google",driver.getTitle());
		System.out.println("I m in test");
		driver.close();
	}
}
