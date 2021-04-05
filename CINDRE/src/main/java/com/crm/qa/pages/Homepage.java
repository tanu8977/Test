package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage  extends TestBase{
	
	
	@FindBy(xpath = "//p[contains(text(),'Accommodation')]")
	WebElement accom;
	
	@FindBy(xpath = "//p[contains(text(),'Cars')]")
	WebElement cars;
	
	@FindBy(xpath = "//p[contains(text(),'Flights')]")
	WebElement flight;
	
	@FindBy(xpath = "//p[contains(text(),'Packages')]")
	WebElement pkg;
	
	@FindBy(xpath = "//p[contains(text(),'Activities')]")
	WebElement act;
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	public void fr()
	{
		accom.click();
	}
	public void gt()
	{
		cars.click();
	}
	public void frt()
	{
		flight.click();
	}
	public void gtg()
	{
		pkg.click();
	}
	public void hyu()
	{
		act.click();
	}
}
