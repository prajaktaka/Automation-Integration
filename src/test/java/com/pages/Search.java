package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search 
{
		WebDriver driver;
		
		@FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]")
		WebElement e1;
		
		@FindBy(id="product_enteredQuantity_4")
		WebElement e2;
			
		public Search (WebDriver driver)
		{
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}

		public void Click_On_Add() 
		{
			
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			e1.click();
			
			e2.clear();
			e2.sendKeys("3");
			
			driver.findElement(By.id("add-to-cart-button-4")).click();;
			driver.findElement(By.partialLinkText("Shopping cart")).click();;
			
			

		}



}
