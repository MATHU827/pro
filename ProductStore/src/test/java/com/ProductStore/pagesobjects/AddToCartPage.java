package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AddToCartPage {
	WebDriver driver;
	//Locator to select the specific product 
By product=By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a");
    //Locator for Add Cart in the Product Store homepage
By Add_cart=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

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
public void productStore() 
{
	driver.get("https://www.demoblaze.com/");
	System.out.println(driver.getTitle());
}

//To add a product to cart
public void cart() throws InterruptedException
{
	driver.findElement(product).click();
	Thread.sleep(3000);
	driver.findElement(Add_cart).click();
	Thread.sleep(3000);
	Alert a = driver.switchTo().alert();
	  a.accept();
}

//To close the browser 
public void quit()
{
	driver.close();
}
}
