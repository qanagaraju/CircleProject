package appElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Service_Elements {

	
	@FindBy(name="user") private  WebElement userName;
	@FindBy(name="pass")private WebElement password;
	@FindBy(name="btnSubmit")private WebElement loginButton;
	
	private WebDriver driver;
	
	public Login_Service_Elements(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	
	 public  Login_Service_Elements insert_UserName(String un) {
			userName.sendKeys(un);
			return this;
		}
		
		public Login_Service_Elements insert_password(String pw) {
			password.sendKeys(pw);
			return this;
		}
		
		public void click_loginButton() {
			loginButton.click();
		}
		
		
		
		
		
		
		
		
}
