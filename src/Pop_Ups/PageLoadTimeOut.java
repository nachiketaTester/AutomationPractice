package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com");
	}

}
