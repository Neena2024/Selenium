package Feb21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_and_hold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().window().maximize();
		WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.clickAndHold(block2).moveToElement(block3).pause(Duration.ofSeconds(2)).release().perform();
		}
	}
