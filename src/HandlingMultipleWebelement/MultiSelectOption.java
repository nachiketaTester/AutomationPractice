package HandlingMultipleWebelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectOption {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/NACHIKETA/OneDrive/Desktop/HTML%20Folder/Multipleelement.html");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.xpath("//select[@id='car']"));
		Select sel=new Select(dd);
		//sel.selectByIndex(1);
		//sel.selectByValue("audi");
		//sel.selectByVisibleText("Opeu");
		
		//sel.deselectAll();
		//sel.deselectByIndex(1);
		//sel.deselectByValue("opel");
		//sel.deselectByVisibleText("Audi");
		System.out.println(sel.isMultiple());
		List<WebElement> opt=sel.getOptions();
		System.out.println(opt.size());
		for(int i=0;i<opt.size();i++)
		{
			System.out.println(opt.get(i).getText());
		}
		Thread.sleep(3000);
		driver.quit();
	}

}
