package appServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.BrowserDriver;
import appElements.Add_Mails;

public class AddMailTest {
	
	static WebDriver driver;
	static Add_Mails mails ;
	
	
	@BeforeTest
	public void init() {
		InitilizeViews.init();
	}
	
	
	
		@Test(priority=1)
		public void user_verify_add_mail_id() {
			
			mails = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Add_Mails.class);
			
			mails.click_user_Information().user_click_add_Emails().user_insert_email().user_click_mail_submit_button();
			
}
		
		@Test
		public void closetest() {
			driver.close();
		}

}