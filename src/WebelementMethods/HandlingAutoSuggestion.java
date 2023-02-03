package WebelementMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.navigate().to("https://www.google.com");
WebElement sr=driver.findElement(By.xpath("//input[@title='Search']"));
sr.sendKeys("selenium");
Thread.sleep(2000);
List<WebElement> link=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

System.out.println(link.size());
Thread.sleep(2000);
System.out.println(link.get(3).getText());
//link.get(2).click();
for(int l=0;l<link.size();l++)
{
for(int i=0;i<link.size();i++)
{
	Thread.sleep(2000);
	sr.sendKeys(Keys.ARROW_DOWN);
	sr.sendKeys(Keys.ENTER);
	
}
sr.sendKeys(Keys.ENTER);
}


	}

}
