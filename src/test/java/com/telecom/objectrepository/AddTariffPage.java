package com.telecom.objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.telecom.stepdefinition.Commonactions;

public class AddTariffPage extends Commonactions {
	public AddTariffPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Add Tariff Plan'])[1]")
	private WebElement z;
    public WebElement getZ() {
		return z;
	}
	public WebElement getA() {
		return a;
	}
	public WebElement getB() {
		return b;
	}
	public WebElement getC() {
		return c;
	}
	public WebElement getD() {
		return d;
	}
	public WebElement getE() {
		return e;
	}
	public WebElement getF() {
		return f;
	}
	public WebElement getG() {
		return g;
	}
   // By  =By.id("rental1");
	@FindAll({@FindBy(id="rental1"),@FindBy(name="rental")})
	
    private WebElement a ;
    @FindBy(name="local_minutes")
    private WebElement b;
    @FindBy(id="inter_minutes")
    private WebElement c;
    @FindBy(id="sms_pack")
    private WebElement d ;
    @FindBy(id="minutes_charges")
    private WebElement e;
    @FindBy(id="inter_charges")
    private WebElement f;
    @FindBy(id="sms_charges")
    private WebElement g;
    
	
	
	
	
	
}
