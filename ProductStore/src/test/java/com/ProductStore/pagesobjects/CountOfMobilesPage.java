package com.ProductStore.pagesobjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CountOfMobilesPage {
	WebDriver driver;
//To launch the browser 	
	public void launchBrowser(String browser) { 
		try {
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
				driver = new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("internetexplorer"))
			{
				System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
				driver=new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		catch(WebDriverException e) 
		{
			System.out.println("Browser cannot be launched");
		}
	}
//To launch product store homepage	
	public void ProductStore() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		
	}
//To count the number of mobiles in the homepage
	public void mobileCount() throws InterruptedException
	{
		Thread.sleep(3000);
		List<WebElement> allElements = driver.findElements(By.xpath("//*"));
		int elementscount = allElements.size();
		System.out.println("Total number of elements in webpage =" + elementscount);
	}
//To close the browser 	
	public void Close()
	{
		driver.close();
	}

	}
