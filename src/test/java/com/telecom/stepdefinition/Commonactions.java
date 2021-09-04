package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	public static WebDriver driver;
	
	 public void browserLaunch(String url) throws Throwable {
		 WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		

	}
    public void insertValue(WebElement ele,String value) {
    	ele.sendKeys(value);
    }
    public void button(WebElement ele) {
    	ele.click();
    }
   
}
