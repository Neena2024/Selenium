package Feb20;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotwithtimestamp {

	private static final String TakescreenShot = null;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com");
Thread.sleep(4000);
Date currentDate = new Date();
System.out.println(currentDate);
String timestamp = currentDate.toString().replace(" ","_").replace(".","_");
TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File dst = new File("./Images/LoginPage2"+timestamp+".png");
FileUtils.copyFile(src, dst);
	}

}