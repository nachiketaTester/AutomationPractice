package Locators_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText_Locator {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
//driver.findElement(By.linkText("Forgotten password?")).click();
//WebElement link=driver.findElement(By.partialLinkText("Forgotten"));
//link.click();
//String lnk=link.getText();
//System.out.println(lnk);
driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Nachiketa");

	}

}
