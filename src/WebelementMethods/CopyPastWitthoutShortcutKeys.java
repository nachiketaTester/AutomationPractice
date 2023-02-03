package WebelementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPastWitthoutShortcutKeys {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.navigate().to("https://demo.actitime.com");
driver.manage().window().maximize();
WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
un.sendKeys("admin");
String value=un.getAttribute("value");
pwd.sendKeys(value);
	}

}
