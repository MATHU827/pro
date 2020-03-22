package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MonitorPricePage {
		WebDriver driver;
		//Locator to click monitor from the categories in the homepage 
		By Monitors=By.xpath("//html//body//div[5]//div//div[1]//div//a[4]");
		//Locator to select specific monitor from the homepage
		By Applemonitors=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
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
//To launch the homepage 
	public void productStore() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		
	}
//To select a specific monitor
	public void clickMonitor() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(Monitors).click();
		Thread.sleep(3000);
	}
//To get the price of monitor 
	public void printPrice() throws InterruptedException
	{
		
		
		driver.findElement(Applemonitors).click();
		Thread.sleep(3000);
		String s1=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
		System.out.println(s1);
		
	}
//To close the browser
	public void close()
	{
		driver.close();
	}
	}
