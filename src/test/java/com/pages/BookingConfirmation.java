package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookingConfirmation extends LibGlobal {
	
	public BookingConfirmation() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="order_no")
	private WebElement orderno;
	public WebElement getOrderno() {
		return orderno;
	}

	
		
	}


