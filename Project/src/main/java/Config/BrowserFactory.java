package Config;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory 
{
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browsertype) {
		
	 	if(browsertype.equals("chrome")) {
			   WebDriverManager.chromedriver().setup();
			  //start driver directly as maximized
			   ChromeOptions option = new ChromeOptions();
			   option.addArguments("--start-maximized");
			   driver = new ChromeDriver(option);
			   
		}else if(browsertype.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browsertype.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
	 	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		return driver;
	}

	
	
	
	
}
