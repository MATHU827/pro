package com.ProductStore.pagesobjects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class SignUpPage {
	WebDriver driver;
	//Locators to click sign up and to enter the sign up details
	By username=By.id("sign-username");
	By password=By.id("sign-password");
	By sign_up=By.id("signin2");
	By signup_btn=By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
	
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
	//To launch the product store  homepage 
	public void homePage() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}
	//To enter the username and password 
	public void usernamePassword() throws InterruptedException 
	{
		driver.findElement(sign_up).click();
		Thread.sleep(3000);
		driver.findElement(username).sendKeys("mathumitha");
		Thread.sleep(4000);
		driver.findElement(password).sendKeys("12345678"); 
		}
	//To click signup
	public void signUp () throws Throwable 
	{
		driver.findElement(signup_btn).click(); 
	}
	//To exit from browser
	public void quit()
	{
		driver.close(); 
	}
	}

