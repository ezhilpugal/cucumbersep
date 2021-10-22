package com.Traveler.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Traveler {
	public static void main (String[]args) {
		 WebDriverManager.chromedriver().setup();
			WebDriver driver= new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			
			WebElement w1 = driver.findElement(By.name("email"));
			 w1.sendKeys("ezhil@gmail");
			driver.findElement(By.name("pass")).sendKeys("12345");
		
		
		Actions a = new Actions(driver);
		  a.doubleClick(w1).perform();
		  a.contextClick(w1).perform();
		
	}
}
