package WebelementMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElementsMethods {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/Multiplelink_anchor.html");
driver.manage().window().maximize();
List<WebElement> link=driver.findElements(By.xpath("//a"));
System.out.println(link.size());
System.out.println(link.get(2).getText());
for(int i=0;i<link.size();i++)
{
	System.out.println(link.get(i).getText());


	}
driver.quit();
	}
}
