package appServices;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.BrowserDriver;
import appBase.AppBaseClass;
import appElements.Control_Panel;

public class ControPanel extends AppBaseClass {
	
	static Control_Panel controlPanel;
	
	@BeforeTest
	public void init() {
		InitilizeViews.init();
	}
	
	@Test(priority=0)
	public void verify_controlPanel() {
		
		controlPanel = PageFactory.initElements(BrowserDriver.getCurrentDriver(), Control_Panel.class);
		
		controlPanel.user_click_contact_info().user_click_membership();
	}
	

}
