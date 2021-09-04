package com.telecom.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.telecom.objectrepository.AddCustomerPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddCustomerPlanSteps extends Commonactions {
	
   Commonactions c = new Commonactions();
   AddCustomerPage a = new AddCustomerPage();
	@Given("user click on add customer button")
	public void user_click_on_add_customer_button() {
		c.button(a.getAddcustomerbtn());
	}

	@When("user need to fill up the fields")
	public void user_need_to_fill_up_the_fields() {
		c.button(a.getDonebtn());
		c.insertValue(a.getFname(),"ezhil");
		c.insertValue(a.getLname(),"pugal");
		c.insertValue(a.getEmail(), "eazkil@gmail.com");
		c.insertValue(a.getAddr(),"chennai");
		c.insertValue(a.getPhon(), "1234");
		
	}
	@When("user click on submit button")
	public void user_click_on_submit_button() {

c.button(a.getCustomerbtn());
	}
    @Then("user verify customer id is generated")
	public void user_verify_customer_id_is_generated() {
		String text = driver.findElement(By.xpath("(//td[@align='center'])[3]")).getText();
       Assert.assertEquals(text,"Please Note Down Your CustomerID");
           System.out.println(text);
	}
   
	}


