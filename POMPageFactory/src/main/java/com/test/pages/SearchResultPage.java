package com.test.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.base.BaseClass;
public class SearchResultPage extends BaseClass {
	@FindBy(xpath ="//img[@alt='MINC eco friendly couture Classic Embroidered Khadi Cotton Top in Lilac']")
    WebElement product;
public SearchResultPage(){
		PageFactory.initElements(driver, this);
	}
public ProductPage result() {
	product.click();
	return new ProductPage();
}
}
