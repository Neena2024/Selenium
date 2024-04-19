package April08;
import org.testng.Reporter;
import org.testng.annotations.Test;
public class ClassA {

		@Test
		public void testA()
		{
			Reporter.log("This is from testA", true);
		}

	}
