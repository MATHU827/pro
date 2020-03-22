package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DeleteCartPage {
	WebDriver driver;
	//Locator to select a product
	By product=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
	//Locator to add to cart
	By Add_cart=By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a");
	//Locator for delete in the homepage 
	By Delete_cart=By.linkText("Delete");
	By cart=By.id("cartur");
	
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
//To launch Product Store homepage 	
	public void productStore() 
	{
		driver.get("https://www.demoblaze.com/");
		System.out.println(driver.getTitle());
	}
//To add the product to cart
	public void cart() throws InterruptedException
	{
		driver.findElement(product).click();
		driver.findElement(Add_cart).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		  a.accept();
    }
//To delete the product from cart
	public void delete() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(cart).click();
		  driver.findElement(Delete_cart).click();
	}
//To close the browser
	public void exitBrowser()
	{
		driver.close();
	}
}
