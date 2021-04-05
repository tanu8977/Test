package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Loginpage extends TestBase {
	
	@FindBy(xpath = "//div[contains(text(),'Sign in')]")
	WebElement sign;
	@FindBy(xpath = " //a[contains(text(),'Sign in')]")
	WebElement sn;
	@FindBy(xpath = "//input[@id='signin-loginid']")
	WebElement login;
	@FindBy(xpath = "//input[@id='signin-password']")
	WebElement pwd;
	@FindBy(xpath = "//button[@id='submitButton']")
	WebElement submit;
	
	
	public Loginpage()
	{
		PageFactory.initElements(driver,this );
	}
	
	public void ret()
	{
		sign.click();
	}
	public void fgt()
	{
		sn.click();
		
	}
	public Homepage rte(String un,String pws)
	{
		login.sendKeys(un);
		pwd.sendKeys(pws);
		return new Homepage();
	}
	

}
