package Pop_Ups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertConformationPop_ups {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
WebDriver driver =new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://demo.actitime.com");
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
WebElement e=driver.findElement(By.xpath("//input[@name='pwd']"));
e.sendKeys("manager");
e.sendKeys(Keys.ENTER);
Duration d=Duration.ofSeconds(10);
WebDriverWait wait=new WebDriverWait(driver,d);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[.='Tasks']")));
driver.findElement(By.xpath("//div[.='Tasks']")).click();
driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Nachiketa");
driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
//Alert alt=driver.switchTo().alert();
//alt.dismiss();
//alt.accept();
driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
	}

}
