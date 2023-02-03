package WebelementMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableIsDisplay {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com");
driver.manage().window().maximize();
WebElement cb=driver.findElement(By.xpath("//label[@id='keepLoggedInLabel']"));
System.out.println(cb.isDisplayed());
System.out.println(cb.isEnabled());
cb.click();
Thread.sleep(3050);
System.out.println(cb.getLocation());
	}

}
