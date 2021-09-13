package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	public static WebDriver driver;
	
	 public void browserLaunch(String url) throws Throwable {
		 WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		    
	}
    public void insertValue(WebElement ele,String value) {
    	ele.sendKeys(value);
    }
    public void button(WebElement ele) {
    	ele.click();
    }
   
}
