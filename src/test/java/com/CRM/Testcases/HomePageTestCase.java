package com.CRM.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;

public class HomePageTestCase extends BaseClass  {
	
   //HomePage hp= new HomePage(driver);

  @Test (priority=1)
  public void verifyUrl() {
	  
   // HomePage hp= new HomePage(driver);
	
	String actUrl= hp.getAppUrl();
	
	Assert.assertTrue(actUrl.contains("crm"),"Test Fail:Url not matched");
	System.out.println("Test pass:URL matched");
	
	
  }
  
  @Test (priority=2)
  public void verifyTitle() {
	  
	  String actTitle= hp.getAppTitle();
		Assert.assertTrue(actTitle.contains("Customer"),"Test Fail:Url not matched");
		System.out.println("Test pass:Title matched");

  }
  
  
  @Test (priority=3)
  public void verifyStatusofLink() {
	  
	  String nextPageUrl= hp.getStatusOfLink();
	  Assert.assertTrue(nextPageUrl.contains("login"),"Test Fail:Url not matched");
		System.out.println("Test pass:Application navigation to Login Page");
	  
  }
}
