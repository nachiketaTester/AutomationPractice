package WebelementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteBackSpace {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
WebElement pwd= driver.findElement(By.xpath("//input[@id='pass']")); 
un.sendKeys("Nachiketa");
Thread.sleep(2000);
un.sendKeys(Keys.CONTROL,"a");
Thread.sleep(2000);
un.sendKeys(Keys.CONTROL,"c");
pwd.sendKeys(Keys.CONTROL,"v");
//un.sendKeys(Keys.BACK_SPACE);
//un.sendKeys(Keys.DELETE);
	}

}
