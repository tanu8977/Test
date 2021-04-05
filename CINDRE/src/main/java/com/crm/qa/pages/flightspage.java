package com.crm.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class flightspage extends TestBase {
	
	
	@FindBy(xpath = "//span[contains(text(),'One-way')]")
	WebElement one;
	
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement two;
	
	@FindBy(xpath = "//body/div[@id='app']/div[@id='app-layer-manager']/div[@id='app-layer-base']/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
	WebElement going;
	
	@FindBy(xpath = "//button[@id='d1-btn']")
	WebElement depart;
	
	@FindBy(xpath = "//button[@id='d2-btn']")
	WebElement returnn;
	

	public flightspage()
	{
		PageFactory.initElements(driver, this);
	}
	
public void jbhcb()
{
	one.click();
}

public void bvs(String fr,String nt)
{
	Select re = new Select(two);
	re.selectByVisibleText(fr);
	Select ree = new Select(two);
	ree  .selectByVisibleText(nt);
}
public void frt(String nt)
{
List<WebElement> r =driver.findElements(By.xpath("//button[@id='d1-btn']"));
	
	int n = r.size();
	for(int i=0;i<n;i++)
	{
	String g = r.get(i).getText();
	}
  if(r.equals(31))
  {
	  r.get(n).click();
  }
}
  public void frtv(String nt)
  {
  List<WebElement> r =driver.findElements(By.xpath("//button[@id='d1-btn']"));
  	
  	int n = r.size();
  	for(int i=0;i<n;i++)
  	{
  	String g = r.get(i).getText();
  	}
    if(r.equals(31))
    {
  	  r.get(n).click();
    }

}

}

	
	
	
