package WebelementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
driver.findElement(By.xpath("//a[@id='loginButton']")).click();
Duration d=Duration.ofSeconds(10);
WebDriverWait wait=new WebDriverWait(driver, d);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container_users']")));
driver.findElement(By.xpath("//div[@id='container_users']")).click();
	}

}
