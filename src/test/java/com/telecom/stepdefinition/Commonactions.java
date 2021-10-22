package com.telecom.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
    public void insertTextjs(WebElement element, String value) {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '" + value+ "')", element);
   }
    public void buttonjs(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click()", element);
    }
    public void scrolldown(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView('true')", element);
    }
    public void scrollup(WebElement element) {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].scrollIntoView('flase')", element);
    }
    public void selectByIndex(WebElement element,int index) {
    	Select s= new Select(element);
    	s.selectByIndex(index);
    }
    public void selectByValue(WebElement element,String value) {
    	Select s= new Select(element);
    	s.selectByValue(value);
    	
    }
    public void selectByVisibleText(WebElement element,String value) {
    	Select s= new Select(element);
    	s.selectByVisibleText(value);
    	
    } public void deselectByindex(WebElement element,int index) {
    	Select s= new Select(element);
    	s.deselectByIndex(index);
    	
    } public void deselectByValue(WebElement element,String value) {
    	Select s= new Select(element);
    	s.deselectByValue(value);
    	
    } public void deselectByVisibleText(WebElement element,String value) {
    	Select s= new Select(element);
    	s.deselectByVisibleText(value);
    	
    } public void deselectAll(WebElement element) {
    	Select s= new Select(element);
    	s.deselectAll();
    	
    }

}



















