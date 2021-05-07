package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SelectHotel  extends LibGlobal{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement btnClick;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}
