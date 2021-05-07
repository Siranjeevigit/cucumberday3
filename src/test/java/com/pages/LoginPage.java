package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class LoginPage extends LibGlobal {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "username")
	private WebElement txtUserName;
	
	@FindBy(id = "password")
	private WebElement txtUserPassword;
	
	@FindBy(id = "login")
	private WebElement btnClick ;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtUserPassword() {
		return txtUserPassword;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

	
	
	

}
