package repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class base
{
	protected WebDriver dr;
	private By home_login=By.id("ph_pagebody_0_phheader_0_userprofile");
	private By signup_btn=By.id("ph_pagebody_0_phheader_0__FlyoutLogin_indivSignupURL");
	public base(WebDriver dr)
	{
		this.dr=dr;
	}
	public void checkalert()
	{
		WebElement alert=dr.findElement(By.id("ph_pagebody_0_Notification_divAlerts"));
		if(alert.isDisplayed()||alert.isEnabled())
				dr.switchTo().alert().dismiss();
	}
	public void ispageavailable(String header, String footer)
	{
		Assert.assertTrue(checkheader(header));
		Assert.assertTrue(checkfooter(footer));
	}
	private boolean checkfooter(String footer) {
		String actualfooter=dr.findElement(By.id("footer")).getText();
		return actualfooter.equalsIgnoreCase(actualfooter);
	}
	public boolean checkheader(String headertext)
	{
	String actualheader=dr.findElement(By.id("top")).getText();
	System.out.println(actualheader);
	return actualheader.equalsIgnoreCase(actualheader);
	//return actualheader;
	}
	public signin signinbutton()
	{
		System.out.println("Verify signin button");
		WebElement signbtnelement=dr.findElement(home_login);
		if(signbtnelement.isDisplayed()||signbtnelement.isEnabled())
			signbtnelement.click();
			else System.out.println("signin button not found");
			return new signin(dr);
		
	}
	public signup signupbtn()
	{
		System.out.println("Verify signup function");
	WebElement signup_btn_element=dr.findElement(signup_btn);
	if(signup_btn_element.isDisplayed()||signup_btn_element.isEnabled())
	
		signup_btn_element.click();
		else System.out.println("signup button not found");
		return new signup(dr);
		
	}
}