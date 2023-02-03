package HandlingMultipleWebelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElements {
	 public static  WebDriver driver;
	// public int i=0;
	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
driver=new EdgeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.google.com");
WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf']"));
search.sendKeys("selenium");
List<WebElement> list=driver.findElements(By.xpath("(//ul[@role='listbox'])[1]//li//span[contains(text(),'selenium')]"));
System.out.println(list.size());
System.out.println(list.get(3).getText());
//list.get(0).click();
for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i).getText());
}


	}

}
