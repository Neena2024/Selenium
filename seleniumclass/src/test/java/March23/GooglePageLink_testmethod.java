package March23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageLink_testmethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		GooglePageLinks g= new GooglePageLinks(driver);
		g.getallLinks();
		driver.quit();
		
		
		
	}

}
