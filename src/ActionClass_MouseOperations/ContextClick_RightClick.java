package ActionClass_MouseOperations;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_RightClick {

	public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(39,TimeUnit.SECONDS);
driver.navigate().to("https://www.facebook.com");
driver.manage().window().maximize();
WebElement fgp=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
Actions act=new Actions(driver);
act.contextClick(fgp).perform();
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1500);
r.keyPress(KeyEvent.VK_DOWN);
Thread.sleep(1000);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(4000);
driver.quit();

	}

}
