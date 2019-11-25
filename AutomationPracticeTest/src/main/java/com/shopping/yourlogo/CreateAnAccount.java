package com.shopping.yourlogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAnAccount {
	WebDriver driver;
	//EmailAddress
	public WebElement emailAddress() {
		return this.driver.findElement(By.cssSelector("#email_create"));
	}

	//Create An Account
	public WebElement createAnAccountButton() {
		return this.driver.findElement(By.xpath("//*[@id='SubmitCreate']"));
	}

	public CreateAnAccount(WebDriver driver) {
		this.driver = driver;
	}

	// fill email address text field
	public void fillEmailAddress(String emailAddress) {
		this.emailAddress().sendKeys(emailAddress);
	}

	
	//click on Create An Account button
	public void clickcreateAnAccount() {
		this.createAnAccountButton().click();
	}
}
	

	

