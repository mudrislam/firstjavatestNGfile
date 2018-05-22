package firstjavatestNGfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ConfigTest {
	
	@Test
  public void f() {
	System.setProperty("webdriver.gecko.driver", "/user/muhammedrislam/selenium:jars:drivers/drivers/geckodriver");	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.facebook.com");
		
		
		
		
		
		
  }
}
