package com.CRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.LoginPage;

public class BaseClass  {
	
public WebDriver driver;
public HomePage hp;
public LoginPage lp;
@BeforeTest

public void setup() throws InterruptedException {

driver=new ChromeDriver();
driver.get("https://automationplayground.com/crm/");
Thread.sleep(5000);

hp= new HomePage(driver);
lp= new LoginPage (driver);

}

}
	