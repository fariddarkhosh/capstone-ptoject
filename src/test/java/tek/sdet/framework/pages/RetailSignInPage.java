package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.sdet.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "email")
	public WebElement emailField;
	
	
	@FindBy (id="loginBtn")
	public WebElement loginButton;
	

	@FindBy(id ="newAccountBtn")
	public WebElement newAccountButton;
	
	@FindBy(id="nameInput")
	public WebElement nameInput;
	
	@FindBy(id="emailInput")
	public WebElement emailInput;
	
	@FindBy(id="password")
	public WebElement passwordInput;
	
	@FindBy(xpath ="//input[@id='passwordInput']")
	public WebElement password2;
	
	
	@FindBy(id="confirmPasswordInput")
	public WebElement confirmPasswordInput;
	
	@FindBy(xpath ="//input[@id='confirmPasswordInput']")
	public WebElement confirmPass2;
	
	@FindBy(id="signupBtn")
	public WebElement signUpButton;
	
	@FindBy(id="profileImage")
	public WebElement profileImage;
	
}
