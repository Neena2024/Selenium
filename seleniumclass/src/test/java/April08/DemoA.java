package April08;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {
	
	@Test(invocationCount = 3)
	public void testA()
	{
		Reporter.log("This is from testA", true);
	}

}

