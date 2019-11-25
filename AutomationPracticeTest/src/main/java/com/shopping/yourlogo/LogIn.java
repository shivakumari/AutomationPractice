package com.shopping.yourlogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogIn {
	WebDriver driver;

	// EmailAddress
	public WebElement emailId() {
		return this.driver.findElement(By.xpath("//input[@id='email']"));
	}

	// Create An Account
	public WebElement Passwd() {
		return this.driver.findElement(By.xpath("//input[@id='passwd']"));
	}

	public WebElement signIn() {
		return this.driver.findElement(By.xpath("//p[@class='submit']//span[1] "));
	}

	public LogIn(WebDriver driver) {
		this.driver = driver;
	}

	// fill email address text field
	public void fillEmailId(String emailId) {
		this.emailId().sendKeys(emailId);
	}

	// click on Create An Account button
	public void fillPasswd(String Passwd) {
		this.Passwd().sendKeys(Passwd);
	}

	public void clickSignIn() {
		this.signIn().click();

	}
}
