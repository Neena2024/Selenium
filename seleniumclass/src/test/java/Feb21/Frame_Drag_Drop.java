package Feb21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0); //To switch to the frame and then find web elements. Frame index always start form zero.
		WebElement drag = driver.findElement(By.xpath("//div[@id='Frame_Drag_Drop']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		driver.switchTo().defaultContent(); //To switch back from frame.
		}

}
