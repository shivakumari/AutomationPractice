package com.shopping.yourlogo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass extends TestExecution {
	@BeforeClass
	public void openBrowser() throws InterruptedException {

		driver = openBrowser("Chrome");
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

		System.out.println("Browser launched");
	}

	@AfterClass
	public void closeBrowsers() {
		closeBrowser();
		System.out.println("Closed Browser");

	}
}
