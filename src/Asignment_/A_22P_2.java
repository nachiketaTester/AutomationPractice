package Asignment_;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_22P_2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
driver.get("https://demo.actitime.com");
String actualtitle=driver.getTitle();
System.out.println(actualtitle);
String url=driver.getCurrentUrl();
System.out.println(url);
if(actualtitle.contains("Login"))
{
	System.out.println("Title is matching .");
}
else
{
	System.out.println("Title is not matching .");
}
if(url.contains("actitime"))
{
	System.out.println("Url is matching .");
}else
{
	System.out.println("Url is not matching .");
}
driver.findElement(By.id("username")).sendKeys("admin");
WebElement pwd=driver.findElement(By.name("pwd"));
pwd.sendKeys("manager");
pwd.sendKeys(Keys.ENTER);
String HomeTitle=driver.getTitle();
System.out.println(HomeTitle);
String hUrl=driver.getCurrentUrl();
System.out.println(hUrl);
	}

}
