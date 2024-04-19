package March04;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingValues_Simple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //parent browser
		driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample12.html");
List<WebElement> elements = driver.findElements(By.xpath("//input"));
		WebElement ele1 = elements.get(0);
		ele1.sendKeys("selenium");
		Thread.sleep(2000);
		WebElement ele2 = elements.get(1);
		ele2.sendKeys("java");
	}
	}

