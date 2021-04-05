package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

public class homepagetest extends TestBase{
	
	Loginpage login;
	Homepage home;
	
	public homepagetest()
	{
		super();
	}
	public void ejf()
	{
		initialization();
		Loginpage login = new Loginpage();
		Homepage home;
		home = login.rte(prop.getProperty("un"), prop.getProperty("pws                                "));
	}
	public void accom()
	{
		home.fr();
	}
	public void cars()
	{
		home.gt();
	}
	public void flight()
	{
		home.frt();
	}
	public void pkg()
	{
		home.gtg();
	}
	public void act()
	{
		home.hyu();
	}
	

}
