package Day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_03_Navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://facebook.com");
Thread.sleep(2000);
driver.navigate().to("https:www.google.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();
driver.close();

//difference between driver.get() and driver.navigate().to  - get is not overloaded, navigate is overloaded. Navigate internally uses driver.get
// get can only access url but in navigate we can back, forward and refresh the page
	}

}