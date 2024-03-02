package Feb20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass_MoveTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?ref_=nav_signin");
		Thread.sleep(2000);
		WebElement element =driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	}

