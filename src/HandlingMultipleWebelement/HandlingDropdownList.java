package HandlingMultipleWebelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/Multipleelement.html");
driver.manage().window().maximize();
WebElement dd=driver.findElement(By.xpath("//select[@id='car']"));
Select sel=new Select(dd);
//sel.selectByIndex(1);
//sel.selectByVisibleText("Opel");
sel.selectByValue("audi");
Thread.sleep(3000);
driver.quit();
	}

}
