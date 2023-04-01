package org.pomframework;

import org.mainbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFrameWork extends BaseClass{

	//constructor
	public PomFrameWork() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private  WebElement email;
	
	@FindBy(id="pass")
	private  WebElement password;
	
	@FindBy(name="login")
	private  WebElement login;

	//Encapsulation
	public WebElement getEmail() {
		return email;
	}

	public  WebElement getPassword() {
		return password;
	}

	public  WebElement getLogin() {
		return login;
	}
	
	
}
