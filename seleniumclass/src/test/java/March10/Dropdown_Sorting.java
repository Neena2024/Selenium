package March10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample15.html");
WebElement dropdown = driver.findElement(By.id("A2"));
Select select = new Select(dropdown);
List<WebElement> options = select.getOptions(); //display the element options
List<String> list =new ArrayList<String>();
for (WebElement webElement : options) {
	String text = webElement.getText(); //prints each element text
list.add(text);

}
System.out.println(list);
Collections.sort(list);
System.out.println(list);
	}

}
