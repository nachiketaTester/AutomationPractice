package Pop_Ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class JavaScriptExecutor {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new EdgeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://login.yahoo.com/");
		WebElement checkBox=driver.findElement(By.xpath("//input[@id='persistent']"));
		Thread.sleep(3500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",checkBox);
		//checkBox.click();
	}

}
