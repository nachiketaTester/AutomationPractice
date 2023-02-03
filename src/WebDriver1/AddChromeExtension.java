package WebDriver1;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddChromeExtension {

	public static void main(String[] args) {
ChromeOptions option=new ChromeOptions();

option.addExtensions(new File("C://Users//NACHIKETA//Downloads//extension_2_7_11_0.crx"));

System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);

	}

}
