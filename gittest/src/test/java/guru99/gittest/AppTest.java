package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.google.common.*;

public class AppTest {

	@Test
public void testJ(){
		WebDriver driver;
	System.out.println("Hello world!!!");
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://www.our-africa.org/ethiopia/");
}
 
}
