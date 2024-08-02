package com.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LogInTest
{
	
	WebDriver driver;
	
	@FindBy(partialLinkText ="Log in")
	WebElement e1;
	
	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")
	WebElement e2;
		
	public LogInTest(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Log_In() 
	{
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		e1.click();
		
		
		
		driver.findElement(By.name("Email")).sendKeys("studymailid12@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("abc@123");
		e2.click();
	}
}

