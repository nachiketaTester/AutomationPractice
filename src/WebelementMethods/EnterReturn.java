package WebelementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterReturn {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.navigate().to("https://demo.actitime.com");
WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
un.sendKeys("admin");
WebElement pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
System.out.println(pwd.getTagName());
//System.out.println(pwd.getAttribute("placeholder"));
Thread.sleep(3000);
System.out.println(un.getAttribute("value"));
pwd.sendKeys("manager");
pwd.sendKeys(Keys.RETURN);

	}

}
