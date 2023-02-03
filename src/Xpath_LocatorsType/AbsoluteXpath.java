package Xpath_LocatorsType;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/css.html");
driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Nachiketa");
driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Pupun@94");

	}

}
