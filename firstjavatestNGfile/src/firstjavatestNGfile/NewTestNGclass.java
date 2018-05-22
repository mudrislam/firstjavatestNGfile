package firstjavatestNGfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTestNGclass {
	
  @Test
  public void verifyinghomepagetitle() {
	  System.setProperty("webdriver.gecko.driver", "/uers/muhammedrislam/desktop/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("http:www.facebook.com");
		// path of the chrome browser 

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
