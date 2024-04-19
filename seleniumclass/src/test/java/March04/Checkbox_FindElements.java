package March04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();   // parent browser
		driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample13.html");

		Thread.sleep(2000);

		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i <= elements.size() - 1; i++) {
			Thread.sleep(2000);
			elements.get(i).click();
		}

	}
	}

