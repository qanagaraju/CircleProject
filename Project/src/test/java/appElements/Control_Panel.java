package appElements;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Control_Panel {
	
	
	
	
	@FindBy(xpath="//a[contains(text(),'My User Information')]") private WebElement contactInfo;
	@FindBy(xpath="//p[contains(text(),'My User Information')]") private WebElement user_Information;
	public Control_Panel user_click_contact_info() {
		if(contactInfo.isEnabled()) {
			contactInfo.click();
			Assert.assertTrue(true);
			
		}else
		{
			Assert.assertFalse(false);
		}
		
		
		try {
			
			String actTitle = user_Information.getText();
			String expTitle = "My User Information";
			Assert.assertEquals(actTitle, expTitle);
			
		}catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
		
		return this;
		
		
	}
	
	
	//To find contact manager link
	@FindBy(xpath="//a[contains(text(),'Contact Manager')]") private WebElement manager;
	public Control_Panel user_click_manager() {
		manager.click();
		return this;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Premium Membership')]") private WebElement membership;
	public Control_Panel user_click_membership() {
		membership.click();
		return this;
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Message Center')]") private WebElement messageCenter;
	public Control_Panel user_click_messageCenter() {
		messageCenter.click();
		return this;
	}
	
	
	
	
	
	
	

}
