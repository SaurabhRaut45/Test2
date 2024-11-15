package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.CRM.Testcases.BaseClass;
import com.CRM.Utility.Utility;

public class HomePage extends BaseClass {

	// encapsulation

	private WebDriver driver;

	// initialize driver

	public HomePage(WebDriver driver)//base class

	{
		this.driver=driver;
	}

	private By link = By.linkText("Sign In");
	// WebElement signin= driver.findElement(By.linkText("Sign In"));

	// method

	public String getAppUrl()

	{

		return driver.getCurrentUrl();

	}

	public String getAppTitle() {
		return driver.getTitle();

	}

	public String getStatusOfLink() {
		
		Utility.getScreenshot(driver);
		driver.findElement(link).click();

		return driver.getCurrentUrl();
	}

}
