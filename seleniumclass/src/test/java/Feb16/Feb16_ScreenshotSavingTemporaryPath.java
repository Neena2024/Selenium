package Feb16;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16_ScreenshotSavingTemporaryPath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(2000);
File s1 = driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
String path = s1.getAbsolutePath();
System.out.println(path);         //to find temporary path for images
Thread.sleep(15000);
driver.quit();
	}

}
