package March23;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
//ctr+A, ctrl+shift+f
	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		List<WebElement> link = driver.findElements(By.tagName("a"));

		System.out.println("Total number of llinks" + link.size());

		for (int i = 0; i < link.size(); i++) {

			WebElement ele = link.get(i);
			String url = ele.getAttribute("href");
			BrokenLinks d = new BrokenLinks();
			d.activeUrl(url);

		}

	}

	public void activeUrl(String linkurl) throws Exception {

		URL url = new URL(linkurl);
		// connecting to the server
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

		// httpConnection.setConnectTimeout(3000);

		httpConnection.connect();

		if (httpConnection.getResponseCode() == 200) {
			System.out.println(linkurl + "--" + httpConnection.getResponseMessage());

		}
		if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
			System.out.println(
					linkurl + "--" + httpConnection.getResponseMessage() + " --" + HttpURLConnection.HTTP_NOT_FOUND);
		}

	}

}


