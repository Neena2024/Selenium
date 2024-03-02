package Feb16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feb16_IfElse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.name("username")); //to find x axis , y axis of username
		int x1 = ele.getLocation().getX(); //To get x axis
		System.out.println(x1);  //Print x axis
		WebElement ele2 = driver.findElement(By.name("password"));
		int x2= ele2.getLocation().getX();
		System.out.println(x2);
		if(x1==x2)
		{
				System.out.println("X axis matches");
		}
		else
		{
			System.out.println("Match not found");
	}
	}
}


