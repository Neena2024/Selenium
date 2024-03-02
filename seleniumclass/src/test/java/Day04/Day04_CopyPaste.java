package Day04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_CopyPaste {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(3000);
	WebElement username = driver.switchTo().activeElement();
	username.sendKeys("trainee");
	Thread.sleep(2000);
	username.sendKeys(Keys.CONTROL+ "a"); //Selecting password
	Thread.sleep(2000);
	username.sendKeys(Keys.CONTROL+ "c"); //Copying password
	Thread.sleep(2000);
	username.sendKeys(Keys.TAB);  //TAB to next 
	WebElement password = driver.switchTo().activeElement();
	Thread.sleep(2000);
    password.sendKeys(Keys.CONTROL+"v");  //Pasting the password

	}

}
