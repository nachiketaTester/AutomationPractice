package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingInsecureWebSite {

	public static void main(String[] args) {
ChromeOptions option=new ChromeOptions();
option.setAcceptInsecureCerts(true);
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver(option);
driver.get("https://");
	}

}
