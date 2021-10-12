package resources;

import org.testng.annotations.Test;
import basesetup.setup;
import repos.base;
import repos.signup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class signupTest extends setup
{
	private WebDriver dr;
	private base baset;
	private signup signupt;
	
	@Test(groups= {"Regressiontest"})
	  public void home_login()
	  {
		  baset=new base(dr);
		  baset.signinbutton();
		  signupt.create_account();
	 }
	
  @BeforeClass
  public void beforeClass() 
  {
	  dr=getDriver();
  }
 @AfterClass
  public void aftertest()
  {
	  dr.close();
  }
}
