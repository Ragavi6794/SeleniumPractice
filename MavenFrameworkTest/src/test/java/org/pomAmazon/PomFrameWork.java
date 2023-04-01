package org.pomAmazon;

import org.mainbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFrameWork extends BaseClass {
	public PomFrameWork() {  //constructor
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="twotabsearchtextbox")  //product name search
	private WebElement search;

	@FindBy(id="nav-search-submit-button") //click enter
	private WebElement icon;

	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div/div[1]/div/span/a/div/img") //one that particular element click
	private WebElement dress;

	@FindBy(id="add-to-cart-button")  //click add to cart
	private WebElement addToCart;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getIcon() {
		return icon;
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}




}
