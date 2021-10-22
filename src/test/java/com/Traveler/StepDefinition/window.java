package com.Traveler.StepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {
	 public static WebDriver driver;
	 
		public static void main(String[] args) throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
				driver= new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
				driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
				
				WebElement w1 = driver.findElement(By.name("q"));
						w1.sendKeys("redmi note 10");
		          WebElement w2 = driver.findElement(By.xpath("//*[@type='submit']"));
		              w2.click();
		              
		              WebElement w3 = driver.findElement(By.xpath("(//*[@class='_4rR01T'])[1]"));
		              w3.click();
		             String parent = driver.getWindowHandle();
		              Set<String> allchild = driver.getWindowHandles();
		            //  List<String> l=new ArrayList<String>(allchild);
		              
		              for (String x: allchild) {
						if (!parent.equals(x)){
		             driver.switchTo().window(x);

	}}         WebElement w5= driver.findElement(By.xpath("//div[@class='aMaAEs']"));
		       System.out.println(w5.getText());
		      Actions a = new Actions (driver);
		      WebElement w6 = driver.findElement(By.xpath("//*[text()='Women']"));
		      a.moveToElement(w6).perform();

}
}