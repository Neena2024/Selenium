package Feb20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_ScrollTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Laptops and netbooks']"));
		Actions act = new Actions(driver);
		act.scrollToElement(ele).perform();
	}

}