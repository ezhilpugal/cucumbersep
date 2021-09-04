package com.telecom.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.telecom.stepdefinition.Commonactions;

public class AddCustomerPage extends Commonactions {
	 public AddCustomerPage() {
	
	
      	PageFactory.initElements(driver, this);
	}
      @FindBy(xpath="(//a[text()='Add Customer'])[1]")
      private WebElement addcustomerbtn;
      @FindBy(xpath="(//label[@for='done'])[1]")
      private WebElement donebtn;
      @FindBy(id="fname")
      private WebElement fname ;
      @FindBy(id="lname")
      private WebElement lname ;
      @FindBy(id="email")
      private WebElement email ;
      @FindBy(name="addr")
      private WebElement addr ;
      @FindBy(id="telephoneno")
      private WebElement phon  ;
      @FindBy(xpath="//input[@type='submit']")
      private WebElement customerbtn;
	public WebElement getAddcustomerbtn() {
		return addcustomerbtn;
	}
	 public WebElement getDonebtn() {
			return donebtn;
		}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getAddr() {
		return addr;
	}
	public WebElement getPhon() {
		return phon;
	}
	public WebElement getCustomerbtn() {
		return customerbtn;
	}

}
