package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class BookHotel extends LibGlobal {
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cre;
	
	@FindBy(id="cc_type")
	private WebElement card;
	
	@FindBy(id="cc_exp_month")
	private WebElement month;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cv;
	
	@FindBy(id="book_now")
	private WebElement btnClick;

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCre() {
		return cre;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCv() {
		return cv;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}

}
