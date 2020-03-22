package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvalidPlaceOrderPage {
	WebDriver driver;
	//Locator for cart in homepage 
	By click_cart=By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");
	//Locator for place order in homepage 
	By placeorder=By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
	//Locator for purchase in homepage 
	By purchase=By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");

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
   //To launch the product store homepage 
public void productStore() 
{
	driver.get("https://www.demoblaze.com/");
	System.out.println(driver.getTitle());
	
}
  //To place the order 
public void clickPlaceOrder() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(click_cart).click();
	Thread.sleep(3000);
	driver.findElement(placeorder).click();
	
}
//To purchase the product by giving invalid details 
public void purchase() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(purchase).click();
	Thread.sleep(3000);
	String a= driver.switchTo().alert().getText();
	System.out.println(a);
	Thread.sleep(3000);
	Alert b=driver.switchTo().alert();
	b.accept();
}
//To close the browser
public void close() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}
}
