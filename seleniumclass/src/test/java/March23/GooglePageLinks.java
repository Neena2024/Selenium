package March23;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageLinks {
@FindBy(xpath="//a")
private List<WebElement>allLinks;

public GooglePageLinks(WebDriver driver) {
	PageFactory.initElements(driver, this);

}

public void getallLinks() {

	System.out.println(allLinks.size());

	for (WebElement ele : allLinks) {

		System.out.println(ele.getAttribute("href"));
	}

}

}


