package appServices;

import org.openqa.selenium.WebDriver;

import Config.BrowserDriver;

public class InitilizeViews {
	
	public static WebDriver driver = null;
	
	public static void init() {
		
		driver = BrowserDriver.getCurrentDriver();
		
		
	}

}
