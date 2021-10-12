package repos;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basesetup.I_want_To;

public class register_user implements I_want_To
{
	private By i_want_btn=By.id("main-nav-item-0");
	private WebDriver dr;
	private By register_acc_btn=By.xpath("//*[@id=\"ph_pagebody_0_phthreecolumnmaincontent_0_SectionLinks_ulsectionlink\"]/li[1]/h2/a");
	private By click_yes_btn=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_question1_YesNoList_0");
	private By fill_license_no=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_LicenceNumber_SingleLine");
	private By fill_address=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_LicenceAddress_SingleLine_CtrlHolderDivShown");
	private By check_registration_no=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_question2_YesNoList_0");
	private By fill_registration_no=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_registrationnumber_RegistrationNumber_CtrlHolderDivShown");
	private By fill_last_name=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_RoadSmartSignUpLicence_Lastname_Licence_SingleLine_CtrlHolderDivShown");
	private By fill_DOB=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_RoadSmartSignUpLicence_DateOfBirth_Licence_CustomSingleLine");
	private By click_cont=By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_btnNext");
	
	public register_user(WebDriver dr)
	{
		this.dr=dr;
	}
	public void click_i_want_to() 
	{
		WebElement element=dr.findElement(i_want_btn);
		if(element.isDisplayed())
			element.click();
	}
public void register_accnt() throws Exception
{
	WebElement element=dr.findElement(register_acc_btn);
	System.out.println("User is on page" +" " + dr.getTitle());
	if(element.isDisplayed()||element.isEnabled())
		TimeUnit.SECONDS.sleep(5);
	
		element.click();
}
/*public boolean select_yes() throws Exception
{
	List<WebElement> radiobutton =dr.findElements(By.id("ph_pagebody_0_phthreecolumnmaincontent_0_panel_question1_YesNoList"));
	System.out.println("We are on page" +" " + dr.getTitle());
	TimeUnit.SECONDS.sleep(5);
	int size=radiobutton.size();
	for (int i=0;i < size;i++)
	{
		String val=((WebElement) radiobutton.get(i)).getAttribute("value");
		if(val.equalsIgnoreCase("yes"))
			((WebElement) radiobutton).click();
	}
	return false;
}*/
public void sel_yes() throws Exception
{
	WebElement element=dr.findElement(click_yes_btn);
	System.out.println("We are on page" +" " + dr.getTitle());
	TimeUnit.SECONDS.sleep(5);
	if(element.isDisplayed())
		element.click();
}
public void fill_license()
{
	WebElement element =dr.findElement(fill_license_no);
	if(element.isDisplayed())
		element.sendKeys("036787097");
}
public void address()
{
	WebElement element =dr.findElement(fill_address);
	if(element.isDisplayed())
		element.sendKeys("85 Loch Road");
}
public void chk_regis_no()
{
	WebElement element =dr.findElement(check_registration_no);
	if(element.isDisplayed())
		element.click();
}
public void fill_regis_no()
{
	WebElement element =dr.findElement(fill_registration_no);
	if(element.isDisplayed())
		element.sendKeys("RZF818");
}
public void fill_last_name()
{
	WebElement element =dr.findElement(fill_last_name);
	if(element.isDisplayed())
		element.sendKeys("Pal");
}
public void fill_DOB()
{
	WebElement element =dr.findElement(fill_DOB);
	if(element.isDisplayed())
		element.sendKeys("17/10/1981");
}
public void submit()
{
	WebElement element =dr.findElement(click_cont);
	if(element.isDisplayed())
		element.click();
}
}
