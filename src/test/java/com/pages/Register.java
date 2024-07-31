package com.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Register 
{
	WebDriver driver;
	/*@FindBy(xpath ="//*[@id=\"demo-page\"]/body/div[7]/header/nav/ul/li[3]/span")
	WebElement e1;*/
	
	@FindBy(partialLinkText ="Register")
	WebElement e2;
	
	@FindBy(id ="register-button")
	WebElement e3;
		
	public Register(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Register() 
	{
		
		/*driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e1.click();*/
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e2.click();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Prajakta");
		driver.findElement(By.id("LastName")).sendKeys("Katore");
		driver.findElement(By.id("Email")).sendKeys("studymailid12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("abc@123");
		e3.click();
		
	}
}

