package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LoginPage {
	WebDriver driver;
	//Locators for login details 
	By login_username=By.id("loginusername");
	By login_password=By.id("loginpassword");
	By login=By.id("login2");
	By login_btn=By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
//Launch the browser
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
//Launch the homepage 
	public void productStore() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());	
	}
//To enter the login details and click login
	public void loginUsernamePassword(String user,String pass) throws InterruptedException 
	{
		driver.findElement(login).click();
		Thread.sleep(3000);
		driver.findElement(login_username).sendKeys(user);
		Thread.sleep(3000);
		driver.findElement(login_password).sendKeys(pass); 
		Thread.sleep(3000);
		driver.findElement(login_btn).click();	  	
		}
//To handle alert for invalid login
	public void alertHandling()
	{
		Alert a = driver.switchTo().alert();		
		a.accept();
	}
//To click logout
	public void logout () throws Throwable 
	{
	 driver.findElement(By.id("logout2")).click();
	}
//To close the browser
	public void quitt()
	{
		driver.close();
	}
	}
