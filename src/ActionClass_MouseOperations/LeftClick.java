package ActionClass_MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(39,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
WebElement fgp=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
Actions act=new Actions(driver);
act.doubleClick(fgp).perform();
Thread.sleep(2000);
driver.quit();
	}

}
