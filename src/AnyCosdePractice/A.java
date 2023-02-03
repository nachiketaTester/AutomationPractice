package AnyCosdePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
Thread.sleep(3000);
driver.quit();
	}

}
