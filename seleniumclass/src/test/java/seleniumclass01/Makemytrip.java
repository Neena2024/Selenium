package seleniumclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/?gclid=Cj0KCQiAoKeuBhCoARIsAB4WxtcnRR5xM_PtK6OLr5baDXn3ehkcC3LLPGwxZKH4me8zj7k-DA19choaAjCkEALw_wcB&ccde=US&lang=eng&cmp=SEM|D|IF|G|Brand|IF_Brand_Exact-Canada|Brand_Exact|RSA|Regular|NewFunnel|680033548042&s_kwcid=AL!1631!3!680033548042!e!!g!!make%20my%20trip&ef_id=Cj0KCQiAoKeuBhCoARIsAB4WxtcnRR5xM_PtK6OLr5baDXn3ehkcC3LLPGwxZKH4me8zj7k-DA19choaAjCkEALw_wcB:G:s&gad_source=1" );
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[3]/label/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='April 2024']/../..//p[text()='15']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
	}

}