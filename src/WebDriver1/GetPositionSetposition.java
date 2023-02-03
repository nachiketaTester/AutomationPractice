package WebDriver1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionSetposition {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com");
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
Point p=new Point(30,150);
driver.manage().window().setPosition(p);
System.out.println("After setPostition ");
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
driver.quit();
	}

}
