package repos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin
{
		private WebDriver dr;
		private By emailtextbox=By.id("ph_pagebody_0_phheader_0__FlyoutLogin_PersonalEmail_EmailAddress");
		private By passtextbox=By.id("ph_pagebody_0_phheader_0__FlyoutLogin_PersonalPassword_SingleLine_CtrlHolderDivShown");
		private By loginbtn=By.id("ph_pagebody_0_phheader_0__FlyoutLogin_btnFlyoutLogin");
		private By errormsg=By.id("ph_pagebody_0_phthreecolumnmaincontent_2_ErrorSummary");
		public signin(WebDriver dr)
		{
			this.dr=dr;
		}
	public String getSignIPageTitle()
	{
		String pagetitle=dr.getTitle();
		System.out.println(pagetitle);
		return pagetitle;
	}
		
	public boolean verifylogin()
	{
		enterEmail("gaurav145@gmail.com");
		enterPwd("Momgod17@");
		clickOnSign();
		return getErrorMessage();
	}
	private boolean getErrorMessage()
	{
		String strerrmsg;
		WebElement errmsg=dr.findElement(errormsg);
		if(errmsg.isDisplayed()||errmsg.isEnabled())
			strerrmsg=errmsg.getText();
		return false;
	}
	private void clickOnSign() 
	{
		WebElement SignInBtn=dr.findElement(loginbtn);
		if(SignInBtn.isDisplayed())
			SignInBtn.click();
	}
	private void enterPwd(String passwd) 
	{
		WebElement pwdTextBox=dr.findElement(passtextbox);
		if(pwdTextBox.isDisplayed())
			pwdTextBox.sendKeys(passwd);
	}
	private void enterEmail(String email)
	{
		WebElement emailTextBox=dr.findElement(emailtextbox);
		if(emailTextBox.isDisplayed())
			emailTextBox.sendKeys(email);
	}
}
