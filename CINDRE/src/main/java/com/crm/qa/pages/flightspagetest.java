package com.crm.qa.pages;

import com.crm.qa.base.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flightspagetest extends TestBase {
	
	Loginpage loginpage;
	Homepage homepage;
	flightspage flights;
	
	
	public flightspagetest(){
		super();
		initialization();
	}
	
		
		
		@Given("^Open firefox and Start Application$")
		public void open_firefox_and_Start_Application() throws Throwable {
			
			
			loginpage = new Loginpage();
			homepage = new Homepage();
			flightspage flights = new flightspage();
			
			
		}
		   
		

		@Then("^I click on the <flights> page$")
		public void i_click_on_the_flights_page() throws Throwable {
			
			
			homepage.frt();
			
		  
		}

		@Then("^I check for the \"(.*?)\" and \"(.*?)\"$")
		public void i_check_for_the_and(String fr, String nt) throws Throwable {
			
			flights.jbhcb();
			flights.bvs(fr, nt);
		    
		}

		@Then("^I check for the \"(.*?)\"$")
		public void i_check_for_the(String nt) throws Throwable {
		    flights.frt(nt);
		}

		@When("^I verify the <Search> in step$")
		public void i_verify_the_Search_in_step(String nt) throws Throwable {
			flights.frtv(nt);
		   
		}


}
