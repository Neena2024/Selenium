package Day03;


import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
String ABC = driver.getTitle();
System.out.println("title");


	}

}
