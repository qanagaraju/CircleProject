package appBase;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Config.BrowserDriver;
import Config.BrowserFactory;
import appElements.Login_Service_Elements;
import appServices.InitilizeViews;
import appUtilities.PropertyLoader;

public class AppBaseClass {
	
	static String datename = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
	
	public BrowserFactory browser;
	public WebDriver driver;
	public Login_Service_Elements loginpage;
	public PropertyLoader reader;

	@BeforeSuite
	public void setupSuite() {
		browser = new BrowserFactory();
		reader = new PropertyLoader();
		InitilizeViews.init();
		
	}
	
	@BeforeTest
	public void startLogin() {
		
		
		
		BrowserDriver.getCurrentDriver("chrome").get("http://www.mycontactform.com");
	//	BrowserDriver.getCurrentDriver().get("http://www.mycontactform.com");
		
		loginpage = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Login_Service_Elements.class);
		loginpage.insert_UserName(reader.get_username()).insert_password(reader.get_password()).click_loginButton();
	}
	
	
	

	
	
	
	@AfterMethod
	public void onTestSuccess(ITestResult itr) {
		System.out.println("Test" +itr.getName() + "Passed");
		System.out.println(itr.getTestClass());
		System.out.println("Prority of the method is " + itr.getMethod().getPriority());
	}
	
	@AfterMethod
	public void onTestFailure(ITestResult itr) {
		
		if(ITestResult.FAILURE==itr.getStatus()) {
			System.out.println("Test" +itr.getName() +" Failed");
			System.out.println("Priority of the method is " +datename+ itr.getMethod().getPriority());
		}
		
		
	
		
		//System.out.println(datename);
		//BrowserDriver.takeScreenShot();
	}
	
	
	
	

}
