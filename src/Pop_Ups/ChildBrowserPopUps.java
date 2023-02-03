package Pop_Ups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowserPopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.logfile", "D://Logm//log.txt");
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
 ChromeOptions option=new ChromeOptions();
 option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.navigate().to("https://www.naukri.com");
System.out.println(driver.getWindowHandle());
Set<String> w=driver.getWindowHandles();
System.out.println(w.size());
	}

}
