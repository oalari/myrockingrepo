package EthioTest1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
@Test
public void ET1(){
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
driver.get("http://www.our-africa.org/ethiopia/");
String Pagetitle = driver.getTitle();
System.out.print("The Title of this Website is:");
System.out.print(Pagetitle);
driver.quit();
}
}
