package resources;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import basesetup.setup;
import repos.base;
import repos.signin;

public class signinTest extends setup
{
	private WebDriver dr;
	private signin signint;
	private base baset;
	
  @BeforeClass(groups= "FunctionalTest")
	public void setUp()
	{
		dr=getDriver();
	}
  @Test(groups= {"Regressiontest","FunctionalTest"})
  public void verifysigninPage()
  {
	  baset=new base(dr);
	  signint=baset.signinbutton();
	  Assert.assertTrue(signint.verifylogin(), "Unable to login");
  }
  @AfterClass
  public void close_brow()
  {
	  dr.close();
  }
}

