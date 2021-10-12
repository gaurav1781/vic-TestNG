package resources;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import repos.base;
import basesetup.setup;
import basesetup.customise_report;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class baseTest  extends setup implements customise_report
{
	private WebDriver dr;
  @Test(groups= "FunctionalTest")
  public void setup()
  {
	  dr=getDriver();
  }
 /* @BeforeClass
  public void verifyhomePage() 
  {
	  System.out.println("Home page test...");
	base basePage = new base(dr);
	
	String headertext = null;
	Assert.assertTrue(basePage.checkheader(headertext), "Home page header-footer dont match");
  }*/
  
public void convertreport(String formattype) 
{
	switch (formattype)
	{
	case "html":
	generatehtmlreport();
	break;
		
	case "excel":
		generateexcelreport();
		break;
		default:
			break;
	}
	
}
private void generateexcelreport()
{
}
@Test
private void generatehtmlreport()
{
	String report=resultmap.get("title");
	System.out.println("<html> <title>"+ report + "</title></html>");
	
}
@AfterClass
public void afterclass()
{
	  dr.close();
}

}
