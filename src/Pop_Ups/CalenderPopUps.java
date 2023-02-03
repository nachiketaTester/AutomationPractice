package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class CalenderPopUps {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
EdgeOptions option=new EdgeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new EdgeDriver(option);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
driver.manage().window().maximize();
driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
Thread.sleep(2500);
driver.findElement(By.xpath("(//a[@class='ui-state-default'])[4]")).click();
Thread.sleep(2500);
driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
for(int i=1;i<4;i++)
{
	driver.findElement(By.xpath("//a[@title='Next']")).click();
}
driver.findElement(By.xpath("(//a[@class='ui-state-default'])[47]")).click();
	}

}
