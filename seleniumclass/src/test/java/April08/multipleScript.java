package April08;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class multipleScript {
		@Test(priority = 2)
		public void login()
		{
			Reporter.log("Hi this is from Login", true);
			
		}
		
		@Test(priority = 1)
		public void register()
		{
			Reporter.log("Hi this is to register", true);
			
		}

	}

