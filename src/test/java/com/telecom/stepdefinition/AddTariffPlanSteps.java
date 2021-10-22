package com.telecom.stepdefinition;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.telecom.objectrepository.AddTariffPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddTariffPlanSteps extends Commonactions {
	
 Commonactions c=new Commonactions();
 AddTariffPage a = new AddTariffPage();
	
	@Given("user click on add tariff button")
	public void user_click_on_add_tariff_button() {
		c.button(a.getZ());
		
			}

	@When("user need to fill the field {int}dlist")
	public void user_need_to_fill_the_field_dlist (Integer int1,DataTable data) {
	  List<String> as = data.asList(String.class);
	 // c.insertValue(a.getA(), as.get(0));
	  c.insertValue(a.getA(), as.get(0));
	  c.insertValue(a.getB(), as.get(1));
	  c.insertValue(a.getC(), as.get(2));
	  c.insertValue(a.getD(), as.get(3));
	  c.insertValue(a.getE(), as.get(4));
	  c.insertValue(a.getF(), as.get(5));
	  c.insertValue(a.getG(), as.get(6));
	  
	  
	}
	@When("user click the submit button")
	public void user_click_the_submit_button() {
		Hooks.driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@Then("user verify congratulations is generated")
	public void user_verify_customer_plan_is_generated() {
		String text = Hooks.driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
	       Assert.assertEquals(text,"Congratulation you add Tariff Plan");
	           System.out.println(text);
	}



}
