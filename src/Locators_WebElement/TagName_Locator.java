package Locators_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TagName_Locator {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
//driver.findElement(By.tagName(null))
	}

}
