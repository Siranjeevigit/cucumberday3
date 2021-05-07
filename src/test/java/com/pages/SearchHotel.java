package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SearchHotel extends LibGlobal {
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "location")
	private WebElement loc;
	
	@FindBy(id= "hotels")
	private WebElement hot;
	
	@FindBy(id= "room_type")
	private WebElement room;
	
	@FindBy(id= "room_nos")
	private WebElement noRoom;
	
	@FindBy(id= "adult_room")
	private WebElement adu;
	
	@FindBy(id= "child_room")
	private WebElement chi;
	
	@FindBy(id= "Submit")
	private WebElement btnClick;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHot() {
		return hot;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getNoRoom() {
		return noRoom;
	}

	public WebElement getAdu() {
		return adu;
	}

	public WebElement getChi() {
		return chi;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
	
	
	

	
	

	

	
	
	

}

