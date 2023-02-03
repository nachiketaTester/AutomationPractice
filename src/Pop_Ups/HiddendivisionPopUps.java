package Pop_Ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddendivisionPopUps {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.skillrary.com");
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='close_cookies']")).click();
	}

}
