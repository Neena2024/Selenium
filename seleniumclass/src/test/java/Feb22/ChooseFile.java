package Feb22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseFile {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/ChooseFile.html.html");
Thread.sleep(2000);

//File doc= new File("./MyDoc/Neena Varghese_SQA.pdf");
//String path = doc.getAbsolutePath();
//System.out.println(path);
//driver.findElement(By.xpath("//input[@id='A2']")).sendKeys("C:\\Users\\ivane\\eclipse-workspace\\seleniumclass\\MyDoc\\Neena Varghese_SQA.pdf");  This is from project folder
driver.findElement(By.xpath("//input[@id='A2']")).sendKeys("C:\\Users\\ivane\\OneDrive\\Documents\\Nonimmigrant Visa - Confirmation Page.pdf"); //This is from my computer
	}
}