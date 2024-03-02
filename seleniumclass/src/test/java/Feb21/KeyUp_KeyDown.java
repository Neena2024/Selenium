package Feb21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUp_KeyDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
      WebElement ele = driver.findElement(By.name("q"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("hello selenium").perform();
		driver.close()	;
	}
	}

