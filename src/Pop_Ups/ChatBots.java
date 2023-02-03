package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBots {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver =new ChromeDriver(option);
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/nget/train-search");
Duration d=Duration.ofSeconds(15);
WebDriverWait wait=new WebDriverWait(driver,d);
wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='disha-image']")));
driver.findElement(By.xpath("//div[@id='disha-image']")).click();
Thread.sleep(5000);
driver.switchTo().frame("Disha-Bot");
driver.findElement(By.xpath("//input[@id='text']")).sendKeys("Train Ticket");

	}

}
