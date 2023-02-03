package WebelementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
driver.get("https://www.facebook.com");
WebElement un=driver.findElement(By.xpath("//input[@id='email']"));
WebElement pwd=driver.findElement(By.xpath("//input[@id='pass']"));
un.sendKeys("Nachiketa");
Thread.sleep(3004);
un.sendKeys(Keys.CONTROL,"a");
//un.sendKeys(Keys.BACK_SPACE);
//un.sendKeys(Keys.DELETE);
un.sendKeys(Keys.CONTROL,"x");
pwd.sendKeys(Keys.CONTROL,"v");


	}

}
