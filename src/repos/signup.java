package repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signup 
{
	private WebDriver dr;
	private By signup=By.xpath("//*[@id=\"ph_pagebody_0_phheader_0__FlyoutLogin_indivSignupURL\"]/a");
	private By error_msg=By.id("ph_pagebody_0_phthreecolumnmaincontent_2_ErrorSummary");
	public signup(WebDriver dr)
	{
		this.dr=dr;
	}
	
	public void create_account()
	{
		WebElement element=dr.findElement(signup);
		if(element.isDisplayed()||element.isEnabled())
			element.click();
		else System.out.println("Item is not present");
	}
	private boolean error_m()
	{
		String errmsg;
		WebElement str_errmsg=dr.findElement(error_msg);
		if(str_errmsg.isDisplayed()||str_errmsg.isEnabled())
			errmsg=str_errmsg.getText();
		return false;
	}
	 

}
