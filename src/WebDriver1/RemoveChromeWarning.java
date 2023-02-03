package WebDriver1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RemoveChromeWarning {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.silentOutput","true" );
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);

driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.navigate().to("https://www.facebook.com");
	}

}
