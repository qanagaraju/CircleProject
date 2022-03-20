package appServices;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import appBase.AppBaseClass;
import appElements.Control_Panel;

public class AppTestCases extends AppBaseClass {

	
	
	static Control_Panel ctpanel;
	
	
	

    @Test(priority=0,description="verify control panel")
    public void user_verify_control_panel() {
    	
    	
    	
		
		ctpanel = PageFactory.initElements(driver, Control_Panel.class);
		ctpanel.user_click_contact_info().user_click_manager();
      
		
    	
    }
    
   
    
    
    
    
}
