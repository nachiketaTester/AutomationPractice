package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeDriver {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
System.out.println("All cookies are delated .");
System.out.println(driver.getCurrentUrl());
	}

}
