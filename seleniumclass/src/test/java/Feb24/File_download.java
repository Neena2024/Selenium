package Feb24;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("file:///C:/Users/ivane/Downloads/SELENIUM/ChooseFile.html.html");
driver.manage().window().maximize();
driver.findElement(By.xpath("//a[@id='A3']")).click();
driver.findElement(By.cssSelector("a#PageLink_5")).click();
driver.findElement(By.cssSelector("a#DirectLink_20")).click(); //selecting resources pdf to download
String pathname = "C://Users//ivane//Downloads//resources.pdf/"; //storing the path name to a string variable ; path name is given in // to avoid syntax error
File file=new File(pathname);  //creating an instance(object) of file type as new; variable 'file' is pointing to new and creating a duplicate version of it.
boolean exist = file.exists(); //Checking if the file exists using exists() and saving it to boolean type
if (exist) {  //using if else statement
	System.out.println("File exists"); //printing the statement needed
}
else {
	System.out.println("File does not exist");
}
}
}