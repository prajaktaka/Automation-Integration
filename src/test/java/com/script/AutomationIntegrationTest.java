package com.script;


import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

import com.pages.RegisterTest;
import com.pages.LogInTest;
import com.pages.SearchTest;


public class AutomationIntegrationTest
{
	private static WebDriver  driver;
	private RegisterTest register;
    private LogInTest login;
    private SearchTest add;
		
		@BeforeClass
		public static void SetUpTest() 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://demo.nopcommerce.com/");	
			driver.manage().window().maximize();
		
		}
		
		
		@Test
	    public void Test1() 
	    {	
			register=new RegisterTest(driver);
			register.Click_On_Register();
		}
		@Test
		public void Test2() 
		{
			login= new LogInTest(driver);
			login.Click_On_Log_In();
		}
		@Test
		public void Test3() 
		{
			add= new SearchTest(driver);
			add.Click_On_Add();
		}
		
		@AfterClass
		public static void Test()
		{
			driver.quit();
		}
}
