package Pop_Ups;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class c1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")).click();
driver.findElement(By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']")).click();
driver.findElement(By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']")).click();
driver.findElement(By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']")).click();
Set<String> w=driver.getWindowHandles();
List<String> l=new ArrayList<>(w);
System.out.println(l.size());
driver.switchTo().window(l.get(3));
System.out.println(driver.getTitle());
for(int i=0;i<l.size();i++)
{
	driver.switchTo().window(l.get(i));
	String actualtitle=driver.getTitle();
	if(actualtitle.contains("You"))
	{
		driver.switchTo().window(l.get(i));
		System.out.println(driver.getTitle());
	}
}
driver.quit();

	}

}
