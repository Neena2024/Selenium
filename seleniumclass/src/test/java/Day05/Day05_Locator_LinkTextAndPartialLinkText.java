package Day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_Locator_LinkTextAndPartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Registrationpage.html");
Thread.sleep(2000);
driver.findElement(By.linkText("I agree to the Terms and Conditions")).click();
Thread.sleep(2000);
driver.findElement(By.linkText("messages123")).click();
Thread.sleep(2000);
driver.findElement(By.partialLinkText("messages")).click();
driver.close();
}
}
