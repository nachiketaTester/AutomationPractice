package ActionClass_MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndrelease {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(39,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement fgp=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		Actions act=new Actions(driver);
		//act.clickAndHold(fgp).perform();
		Thread.sleep(3000);
		//act.release(fgp).perform();
		act.sendKeys(Keys.CONTROL).click(fgp).perform();
	}

}
