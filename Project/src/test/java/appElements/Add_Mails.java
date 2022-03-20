package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_Mails {
	
	public WebDriver driver;
	

	
	@FindBy(xpath="//a[contains(text(),'My User Information')]") private WebElement userInfo;
	public  Add_Mails click_user_Information() {
		userInfo.click();
		return this;
	}
	
	@FindBy(xpath="//a[contains(text(),'Add E-mail Address')]") private WebElement addEmails;
	public Add_Mails user_click_add_Emails() {
		
		addEmails.click();
		return this;
		
	}
	
	
	@FindBy(name="newemail") private WebElement insert_mail;
	public Add_Mails user_insert_email() {
		insert_mail.sendKeys("tester1@gmail.com");
		return this;
	}
	
	@FindBy(name = "submit") private WebElement mail_Submit;
	public Add_Mails user_click_mail_submit_button() {
		mail_Submit.click();
		return this;
	}
	
	
	
	

}
