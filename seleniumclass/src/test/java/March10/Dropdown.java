package March10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample15.html");
WebElement dropdown = driver.findElement(By.id("A1"));
Select select = new Select(dropdown);
List<WebElement> elements = select.getOptions(); //display the element options

System.out.println(elements); //prints all elements address
for (WebElement webElement : elements) {
	System.out.println(webElement.getText()); //prints each element text
}
	}

}
