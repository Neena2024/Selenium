package March04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver(); //parent browser
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/Sample12.html");
List<WebElement> elements = driver.findElements(By.xpath("//input"));  //to find multiple elements  //List will allow duplicate values
for (WebElement ele : elements) 
{
ele.sendKeys("text");
System.out.println(ele.getAttribute("type"));
}
}
}
