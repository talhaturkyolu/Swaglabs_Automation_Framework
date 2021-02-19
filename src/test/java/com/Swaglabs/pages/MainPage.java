package com.Swaglabs.pages;

import java.util.List;

import com.Swaglabs.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MainPage {

	@FindBy(xpath = "//div[@class='app_logo']")
	public WebElement appLogo;
	
	@FindBy(xpath = "//div[@class = 'inventory_item_name']")
	public List<WebElement> itemList;
	

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
