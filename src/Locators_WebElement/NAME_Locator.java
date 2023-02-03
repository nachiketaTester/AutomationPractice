package Locators_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NAME_Locator {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","drivers//geckodriver.exe");
WebDriver driver =new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
driver.findElement(By.name("email")).sendKeys("Nachiketa@958374");
	}

}
