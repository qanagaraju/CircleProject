package appUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Driver_Utility {
	
	public WebDriver driver;
	
	
	
	public void waitMethod() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
