package resources;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import basesetup.setup;
import repos.register_user;
	public class registerTest extends setup
{
			private WebDriver dr;
			private register_user rgs_usr;
 @BeforeClass(groups= "FunctionalTest")
	public void setUp()
	{
	dr=getDriver();
	}

   @Test(groups= {"Regressiontest","FunctionalTest"})
   public void register_user() throws Exception
   {
	rgs_usr=new register_user(dr);
	rgs_usr.click_i_want_to();
	rgs_usr.register_accnt();
	rgs_usr.sel_yes();
	rgs_usr.fill_license();
	rgs_usr.address();
	rgs_usr.chk_regis_no();
	rgs_usr.fill_regis_no();
	rgs_usr.fill_last_name();
	rgs_usr.fill_DOB();
	rgs_usr.submit();
   }
}
