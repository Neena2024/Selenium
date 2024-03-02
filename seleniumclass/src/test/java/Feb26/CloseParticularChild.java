package Feb26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParticularChild {
public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver= new ChromeDriver();
			driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/ChooseFile.html.html");
			driver.findElement(By.cssSelector("a#A5")).click();
			Set<String> whs = driver.getWindowHandles();//getting window address for all windows(parent and child windows)
			System.out.println(whs.size());
		for (String allwindows : whs) 
		{
			driver.switchTo().window(allwindows); //Switching to all windows in for each loop and getting the title of it
			String title = driver.getTitle();
			if (title.equals("Google"))
			{
			driver.close();	//To close only Google window close
			} 
				
			}
		
			
		}
		}
