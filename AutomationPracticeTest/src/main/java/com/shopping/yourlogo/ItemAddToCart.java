package com.shopping.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemAddToCart {
	WebDriver driver;
	// Women Hyperlink
	@FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
	private WebElement Women;

	@FindBy(xpath = "//div[@class='block_content']//ul[@class='tree dynamized']//a[contains(text(),'Tops')]")
	private WebElement Tops;
	
	@FindBy(xpath = "//div[@id='subcategories']//li[1]//div[1]//a[1]//img[1]")
	private WebElement TShirt;

	@FindBy(xpath = "//a[@class='product_img_link']//img[@class='replace-2x img-responsive']")
	private WebElement FirstImage;
	
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement AddToCart;
	
	@FindBy(xpath= "//a[@class='logout']")
	private WebElement SignOut;
	
	@FindBy(xpath ="//body[@id='category']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@class='col-sm-4 clearfix']/div[@class='shopping_cart']/a[1]")
    private WebElement Cart;
	
	public ItemAddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickWomenLink() {
		this.Women.click();
	}

	public void clickTopsLink() {
		this.Tops.click();
	}
	public void clickOnTShirt() {
		this.TShirt.click();
	}

	public void clickFirstImg() {
		this.FirstImage.click();

	}
	public void clickAddToCart() {
		this.AddToCart.click();
	}
	public void clickSignOut() {
		this.SignOut.click();
	}
    public void clickOnCart() {
    	this.clickOnCart();
    }
}
