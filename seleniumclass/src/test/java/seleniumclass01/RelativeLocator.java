package seleniumclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample8.html");
WebElement java = driver.findElement(By.xpath("//td[text()='Java']"));
//String Relative = driver.findElement(RelativeLocator.with(By.tagName("td")).toRightOf(java)).getText();
	}


}
