package com.shopping.yourlogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BrowserHelper;

public class TestExecution extends BrowserHelper {
	protected WebDriver driver;
	CreateAnAccount createAnAccount;
	SignIn signIn;
	ItemAddToCart itemAddToCart;
	LogIn logIn;

	// To Create an Account
	@Test(priority = 0)
	public void loginTest() {
		try {
			System.out.println("Login---");
			createAnAccount = new CreateAnAccount(this.driver);
			createAnAccount.fillEmailAddress("automationpracticesT@gmail.com");
			createAnAccount.clickcreateAnAccount();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// SignIn
	@Test(priority = 1)
	public void SignInPage() {
		signIn = PageFactory.initElements(driver, SignIn.class);
		try {
			System.out.println("signinpage");
			Thread.sleep(3000);
			signIn.selectTitle();
			signIn.fillFirstName("shiva");
			signIn.fillLastname("k");
			signIn.fillPassword("newpassword1");
			signIn.selectDay("1");
			signIn.selectMonth("3");
			signIn.selectYear("1992");
			signIn.fillCompanyName("Kensium Solutions");
			signIn.fillAddress("Biston, US");
			signIn.fillCity("Biston");
			signIn.selectstate("21");
			signIn.fillZipCode("02101");
			signIn.selectcountry("United States");
			signIn.fillAdditionalInformation("NA");
			signIn.fillHomePhone("");
			signIn.fillMobilePhone("04059406");
			signIn.fillAliasAddress("Address");
			signIn.clickRegister();
			signIn = PageFactory.initElements(driver, SignIn.class);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	// Item To Addtocart
	@Test(priority = 2)
	public void ItemAddedToCart() throws InternalError {
		itemAddToCart = PageFactory.initElements(driver, ItemAddToCart.class);
		try {
			itemAddToCart.clickWomenLink();
			itemAddToCart.clickTopsLink();
			itemAddToCart.clickOnTShirt();
			// itemAddToCart.clickFirstImg();
			// itemAddToCart.clickInnerImg();
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			WebElement we = driver.findElement(By.xpath("//span[@class='available-now']"));
			action.moveToElement(we)
					.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"))).click()
					.build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]")).click();
			Thread.sleep(2000);
			System.out.println("Item added to cart");
			itemAddToCart.clickSignOut();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	// Verify the login Credentials with Signed in data.
	@Test(priority = 3)
	public void LoginVerification() {
		logIn = PageFactory.initElements(driver, LogIn.class);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		logIn.fillEmailId("automationpracticesT@gmail.com");
		logIn.fillPasswd("newpassword1");
		logIn.clickSignIn();

	}

	@Test(priority = 4)
	public void signInValidations() throws InterruptedException {
		Thread.sleep(2000);
		signIn = PageFactory.initElements(driver, SignIn.class);
		try {
			signIn.clickRegister();
			System.out.println("Clicked on registraction ");
			String phoneNumber = driver
					.findElement(By.xpath("//li[contains(text(),'You must register at least one phone number.')] "))
					.getText();
			System.out.println("Validation is " + phoneNumber);
			Assert.assertEquals("You must register at least one phone number.", phoneNumber);
			String lastName = driver.findElement(By.xpath("//div[@class='columns-container']//li[2] ")).getText();
			Assert.assertEquals("lastname is required.", lastName);
			System.out.println("Lastname validation message" + lastName);
			String paswrd = driver.findElement(By.xpath("//div[@class='columns-container']//li[4] ")).getText();
			Assert.assertEquals("passwd is required.", paswrd);
			System.out.println("password validation message" + paswrd);
			String address = driver.findElement(By.xpath("//div[@class='columns-container']//li[5] ")).getText();
			Assert.assertEquals("address1 is required.", address);
			System.out.println("Address validation message" + address);
			String city = driver.findElement(By.xpath("//div[@class='columns-container']//li[6] ")).getText();
			Assert.assertEquals("city is required.", city);
			System.out.println("City validation message" + city);
			String state = driver
					.findElement(By.xpath("//li[contains(text(),'This country requires you to choose a State.')] "))
					.getText();
			Assert.assertEquals("This country requires you to choose a State.", state);
			System.out.println("state validation message" + state);
			String zipcode = driver
					.findElement(
							By.xpath("//li[contains(text(),\"The Zip/Postal code you've entered is invalid. It\")] "))
					.getText();
			Assert.assertEquals("The Zip/Postal code you've entered is invalid. It must follow this format: 00000",
					zipcode);
			System.out.println("zipcode validation message" + zipcode);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
