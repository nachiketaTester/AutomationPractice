package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HandlingToolTip {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
EdgeOptions option=new EdgeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new EdgeDriver(option);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.navigate().to("https://www.facebook.com");
driver.findElement(By.xpath("//a[.='Create New Account']")).click();
WebElement tooltip=driver.findElement(By.xpath("//a[@id='birthday-help']"));
System.out.println(tooltip.getDomAttribute("title"));
String toolTipText=tooltip.getDomAttribute("title");
if(toolTipText.contentEquals("Click for more information"))
{
	System.out.println("tooltip text is matching with expected result ");
}else
{
	System.out.println("tooltip text is not matching with expected result ");
}
	}

}
