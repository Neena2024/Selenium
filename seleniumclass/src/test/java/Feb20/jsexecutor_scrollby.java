package Feb20;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor_scrollby {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(2000);

		for (int i = 0; i < 5; i++) { //to run 5 times
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)"); // scrolling down the page
			Thread.sleep(1000);
		}

		for (int i = 0; i < 5; i++)

		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, -500)"); //scrolling up the page 5 times
			Thread.sleep(1000);
		}
	}

}
