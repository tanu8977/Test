package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

public class Loginpagetest extends TestBase {
	
	
	Loginpage login;
	Homepage home;
	
	public Loginpagetest()
	{
		super();
	}
	
	public void setup()
	{
		initialization();
	}
	public void frt()
	{
		Loginpage login = new Loginpage();
		login.ret();
		login.fgt();
	}
	public void rte()
	{
		home = login.rte(prop.getProperty("un"), prop.getProperty("pws"));
	}
	
	
	
	

}
