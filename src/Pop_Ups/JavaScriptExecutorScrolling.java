package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutorScrolling {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
ChromeOptions option =new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
driver.navigate().to("https://www.myntra.com");
JavascriptExecutor js=(JavascriptExecutor)driver;
for(int i=0;i<=5;i++)
{
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1000)");
}
for(int o=0;o<=5;o++)
{
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-1000)");
}
	}

}
