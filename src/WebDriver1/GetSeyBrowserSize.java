package WebDriver1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSeyBrowserSize {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com");
System.out.println(driver.manage().window().getSize());
Dimension d=new Dimension(300, 600);
driver.manage().window().setSize(d);
System.out.println(driver.manage().window().getSize());
driver.close();

	}

}
