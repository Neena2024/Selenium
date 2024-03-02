package Feb16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16_XYaxis_Width_Height {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("username")); //to find x axis , y axis of username
		int x = ele.getLocation().getX(); //To get x axis
		System.out.println(x);  //Print x axis
		Thread.sleep(2000);
		int y = ele.getLocation().getY();
		System.out.println(y); //print Y axis
		
		int h = ele.getSize().getHeight();  //get Height
		System.out.println(h);
		
		int w = ele.getSize().getWidth();
		System.out.println(w); //get width
		
		driver.close();
		
		
	}

}