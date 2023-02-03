package Pop_Ups;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
ChromeOptions option=new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
List<WebElement> checkBox=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
System.out.println(checkBox.size());
for(int i=0;i<checkBox.size();i++)
{
	//Thread.sleep(1000);
	System.out.println(checkBox.get(i).getText());
	
		checkBox.get(i).click();
	if(checkBox.get(i).getText().contains("HTML"))
	{
		System.out.println(checkBox.get(i).isSelected());
		break;
	}
	
}
Thread.sleep(2500);
driver.quit();
	}

}
