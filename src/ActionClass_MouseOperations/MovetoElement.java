package ActionClass_MouseOperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(39,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ca=driver.findElement(By.xpath("//a[.='Create New Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(ca).perform();
		//act.moveToElement(ca).click(ca).perform();
	}

}
