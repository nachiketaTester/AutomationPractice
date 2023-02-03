package WebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
System.setProperty("webdriver.edge.driver","drivers//msedgedriver.exe");
WebDriver driver =new EdgeDriver();
driver.get("https://www.google.com");
String actualTitle=driver.getTitle();
if(actualTitle.equalsIgnoreCase("google"))
{
	System.out.println("Title is matching .");
}else
{
	System.out.println("Title is not matching .");
}
String actualUrl=driver.getCurrentUrl();
if(actualUrl.contains("google"))
{
	System.out.println("Url is matching ");
}else 
{
	System.out.println("Url is not matching ....");
}
	
	}

}
