package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","drivers//geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com");
driver.navigate().to("https://www.myntra.com");
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(3000);
//String title=driver.getTitle();
//System.out.println(title);
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.quit();

//driver.get("https://www.facebook.com");
//driver.close();
	}

}
