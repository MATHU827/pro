package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AboutUsPage {
	WebDriver driver;
	//Locator for About us in the Product Store homepage 
	By Aboutus=By.xpath("//*[@id=\"navbarExample\"]//ul//li[3]/a");
	//Locator for play in the Product Store homepage 
	By play=By.xpath("//*[@id=\"example-video\"]/button");
   
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

//To open Product Store homepage
public void productStore() 
{
	driver.get("https://www.demoblaze.com/");
	System.out.println(driver.getTitle());
}

//To click About Us the Product Store homepage
public void clickAboutUs() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(Aboutus).click();
}

//To play the video
public void playVideo() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(play).click();
	Thread.sleep(5000);
}

//To close the browser
public void close()
{
	driver.close();
}
}

