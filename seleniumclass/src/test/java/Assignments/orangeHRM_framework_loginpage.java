package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class orangeHRM_framework_loginpage {
private WebElement uname; //Declaration
private WebElement pswd;
private WebElement login;

public orangeHRM_framework_loginpage(WebDriver driver) //Initialization
{
	this.uname=driver.findElement(By.name("username"));
	this.pswd= driver.findElement(By.name("password"));
	this.login=driver.findElement(By.xpath("//button[@type='submit']"));

	}
public void senduname (String username)  	//actions and method creation
	{
	uname.sendKeys(username);
	}
public void sendpswd (String password)
{
pswd.sendKeys(password);
}
public void login()
{
login.click();
}
}
