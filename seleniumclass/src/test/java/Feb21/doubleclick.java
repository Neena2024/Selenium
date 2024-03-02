package Feb21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo.php");
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.xpath("//input[@value='Double Click']"));
		Actions act = new Actions (driver);
		act.doubleClick(button).perform();
	}

}
