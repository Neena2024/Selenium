package Day03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_WebElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
// Web Elements- Passing any string value to the active element
// WebElement e = driver.switchTo().activeElement();
// e.sendKeys("Neena");

// To login using username and password
Thread.sleep(2000);
WebElement username = driver.switchTo().activeElement(); 
Thread.sleep(2000);
username.sendKeys("Admin");
username.sendKeys(Keys.TAB);

WebElement password = driver.switchTo().activeElement();
password.sendKeys("admin123");
password.sendKeys(Keys.TAB);

WebElement login = driver.switchTo().activeElement();
login.sendKeys(Keys.ENTER);
	}

}
