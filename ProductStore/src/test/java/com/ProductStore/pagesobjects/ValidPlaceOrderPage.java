package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ValidPlaceOrderPage {
	WebDriver driver;
	//Locators to place a orders by entering valid details 
	By samsung=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");	
	By addtocart=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");		
	By Cart=By.linkText("Cart");
	By Placeorder=By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
	By Name=By.id("name");
	By Country=By.id("country");
	By City=By.id("city");
	By Creditcard=By.id("card");
	By Month=By.id("month");
	By Year=By.id("year");
	By Purchase=By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
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
//Launch the product store homepage 
	public void productStore() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
		}
//To add  the product to the cart to place  the order 
	public void clickPlaceOrder() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(samsung).click();
		Thread.sleep(3000);
		driver.findElement(addtocart).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();		
		a.accept();
		Thread.sleep(3000);
		driver.findElement(Cart).click();
		Thread.sleep(3000);
		driver.findElement(Placeorder).click();
	}
//To enter all the valid details to purchase
	public void fillDetails() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(Name).sendKeys("Bharath");
		driver.findElement(Country).sendKeys("India");
		driver.findElement(City).sendKeys("Puducherry");
		driver.findElement(Creditcard).sendKeys("4321-7654-3456-8765");
		driver.findElement(Month).sendKeys("March");
		driver.findElement(Year).sendKeys("2020");
		Thread.sleep(3000);
		driver.findElement(Purchase).click();
		Thread.sleep(3000);
		String s=driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
		System.out.println(s);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[10]/div[7]/div/button")).click();
		}
//To close thr browser
	public void quit()
	{
		driver.close();
	}
}

