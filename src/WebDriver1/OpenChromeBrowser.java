package WebDriver1;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
System.out.println(driver.manage().window().getPosition().getX());
System.out.println(driver.manage().window().getPosition().getY());
Point p=new Point(30,150);
driver.manage().window().setPosition(p);
System.out.println(driver.manage().window().getPosition().getX());
System.out.print(driver.manage().window().getPosition().getY());

	}

}
