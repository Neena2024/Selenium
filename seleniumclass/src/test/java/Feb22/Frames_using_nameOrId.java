package Feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_using_nameOrId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.switchTo().frame("callout"); //frame using name; same can be used it id as well
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
	}

}