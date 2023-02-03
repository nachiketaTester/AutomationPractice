package ActionClass_MouseOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	}

}
