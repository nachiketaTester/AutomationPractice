package WebDriver1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		//option.addExtensions(new File("C://Users//NACHIKETA//Downloads//extension_2_7_11_0.crx"));
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
	}

}
