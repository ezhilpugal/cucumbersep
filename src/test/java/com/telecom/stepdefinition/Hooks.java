package com.telecom.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Commonactions {
	
	   Commonactions c = new Commonactions();
	
	
	
 @Before
 public void before() throws Throwable {
	 c.browserLaunch("http://www.demo.guru99.com/telecom/");
	
 }
@After
 public void after(Scenario scenario) {
	
	 if (scenario.isFailed()) {
		final byte[] ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(ss,"image/png");
	}else {
		//Scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
		final byte[] ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(ss,"image/png");
	}}

}
