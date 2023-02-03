package Locators_WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Locator {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
WebElement un=driver.findElement(By.className("inputtext"));
un.sendKeys("Mohapatra");
Thread.sleep(3000);
driver.quit();
	}

}
