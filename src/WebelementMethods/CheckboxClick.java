package WebelementMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/check.html");
		List<WebElement> cb=driver.findElements(By.xpath("//input"));
System.out.println(cb.size());
for(int i=0;i<cb.size();i++)
{
	Thread.sleep(2500);
	cb.get(i).click();
	System.out.println(cb.get(i).getTagName());
}
	}

}
