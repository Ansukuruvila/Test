package com.test.pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.test.base.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(id="woocommerce-product-search-field-0") 
	WebElement Search;
	
public HomePage(){
	PageFactory.initElements(driver, this);
}
	 
public SearchResultPage search() {
	Search.sendKeys("Top");
	Search.sendKeys(Keys.ENTER);
	
	return new SearchResultPage();
}
}

