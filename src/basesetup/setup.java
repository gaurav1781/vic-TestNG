package basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

public class setup
{
	private WebDriver dr;
	static String driverpath="D:\\Selenium\\Drivers\\chromedriver.exe";
    public WebDriver getDriver() 
  {
	  return dr;
  }

    public WebDriver initchromedriver(String appURL) {
	  System.out.println("Launching chrome browser");
	  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.navigate().to(appURL);
		return dr;
  }

   public WebDriver initfirefoxdriver(String appURL) {
	  System.out.println("Launching Firefox browser");
	  System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.navigate().to(appURL);
		return dr;
  }

    public void setDriver(String browsertype,String appURL) 
  {
	  switch(browsertype)
		{
		case "chrome":
			dr=initchromedriver(appURL);
			break;
		case "firefox":
			dr=initfirefoxdriver(appURL);
			break;
		default:
			System.out.println("browser :" + browsertype + "is invalid: Launching firefox as default");
			dr=initfirefoxdriver(appURL);
		}
  }
   
  @Parameters({"browsertype","appURL"})
  @BeforeClass(groups= "FunctionalTest")
  public void initializebasesetup(String browsertype,String appURL)
  
  {
	  try
	  {
		  setDriver(browsertype, appURL);
	  } catch(Exception e)
	  {
		  System.out.println("Error..."+e.getStackTrace());
	  }
  }
  
}
