package com.shopping.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignIn {
	WebDriver driver;
	@FindBy(xpath ="//div[@class='clearfix']//div[2]//label[1] ")
	private WebElement title;

	@FindBy(xpath="//input[@id='customer_firstname']")
	private WebElement Firstname;

	@FindBy(id ="customer_lastname")
	private WebElement Lastname;

	@FindBy(id ="passwd")
	private WebElement Password;
	
	@FindBy(id ="days")
	private WebElement Days;
	
	@FindBy(id ="months")
	private WebElement Months;
	
	@FindBy(id ="years")
	private WebElement Year;
	
	@FindBy(css ="#firstname")
	private WebElement firstNameAdd;

	@FindBy(css ="#lastname")
	private WebElement lastNameAdd;

	@FindBy(id ="company")
	private WebElement company;

	@FindBy(css ="#address1")
	private WebElement address;

	@FindBy(css ="#city")
	private WebElement city;

	@FindBy(css ="#id_state")
	private WebElement state;

	@FindBy(css ="#postcode")
	private WebElement zipCode;

	@FindBy(css ="#id_country")
	private WebElement country;

	@FindBy(css ="#other")
	private WebElement additionlInformation;

	@FindBy(id ="phone")
	private WebElement homePhone;

	@FindBy(id ="phone_mobile")
	private WebElement mobilePhone;

	@FindBy(css ="#alias")
	private WebElement aliasAddress;

	@FindBy(css ="#submitAccount")
	private WebElement register;

	public SignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectTitle() {
		this.title.click();
	
	}

	public void fillFirstName(String Firstname) {
		this.Firstname.sendKeys(Firstname);
	}

	public void fillLastname(String Lastname) {
		this.Lastname.sendKeys(Lastname);
	}

	public void fillPassword(String Password) {
		this.Password.sendKeys(Password);
	}
	public void selectDay(String day) {
		new Select(this.Days).selectByValue(day);
	}
	public void selectMonth(String month) {
		new Select(this.Months).selectByValue(month);
	}
	public void selectYear(String year) {
		new Select(this.Year).selectByValue(year);
	}

//	public void fillFirstNameAdd(String firstNameAdd) {
//		this.firstNameAdd.sendKeys(firstNameAdd);
//	}
//
//	public void fillLastNameAdd(String lastNameAdd) {
//		this.lastNameAdd.sendKeys(lastNameAdd);
//	}

	public void fillCompanyName(String company) {
		this.company.sendKeys(company);
	}

	public void fillAddress(String address) {
		this.address.sendKeys(address);

	}

	public void fillCity(String city) {
		this.city.sendKeys(city);

	}

	public void selectstate(String state) {
		new Select(this.state).selectByValue(state);
	}

	public void fillZipCode(String zipCode) {
		this.zipCode.sendKeys(zipCode);
	}

	public void selectcountry(String country) {
		new Select(this.country).selectByVisibleText(country);
	}

	public void fillAdditionalInformation(String additionlInformation) {
		this.additionlInformation.sendKeys(additionlInformation);

	}

	public void fillHomePhone(String homePhone) {
		this.homePhone.sendKeys(homePhone);

	}

	public void fillMobilePhone(String mobilePhone) {
		this.mobilePhone.sendKeys(mobilePhone);
	}

	public void fillAliasAddress(String aliasAddress) {
		this.aliasAddress.sendKeys(aliasAddress);
	}

	public void clickRegister() {
		this.register.click();
	}

}
