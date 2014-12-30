package Scripts;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void SampleOne() {
		System.out.println("SampleOne");
	}
	@Test
	public void SampleTest() {
		System.out.println("I m in sample test");
		throw new SkipException("Using HSQL will fail this test. aborting...");
	}
}
