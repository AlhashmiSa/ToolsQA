package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utilities.BasePro;


public class FormPage extends BasePro {
	
	WebDriver driver;
	

	
	
	
	@FindBy(xpath="//span[contains(.,'DEMO SITES')]") WebElement DemoHover;
	@FindBy(xpath="//span[contains(.,'Automation Practice Form')]") WebElement Form;
	
	public FormPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Hover() {
		Actions act = new Actions (driver);
		act.moveToElement(DemoHover).build().perform();
	}
	
	public void Form() {
		
		Form.click();
	}

}
