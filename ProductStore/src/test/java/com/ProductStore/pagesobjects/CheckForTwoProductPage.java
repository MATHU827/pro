package com.ProductStore.pagesobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CheckForTwoProductPage {
	WebDriver driver;
	By click_one=By.xpath("//*[@id=\"tbodyid\"]/div[7]/div/div/h4/a");
	By add=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	By click_two=By.xpath("//*[@id=\"tbodyid\"]/div[6]/div/div/h4/a");
	By addto=By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
	
//To launch browser	
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
//To click a first product to add to cart 
	public void clickOne() throws InterruptedException {
		driver.findElement(click_one).click();
		Thread.sleep(3000);
		driver.findElement(add).click();
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();	
		a.accept();
		}
//To click second product to add to cart 
	public void clickAgain() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.get("https://www.demoblaze.com/");
		driver.findElement(click_two).click();
		driver.findElement(addto).click();
		Thread.sleep(3000);
		Alert b=driver.switchTo().alert();
		b.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		Thread.sleep(3000);
		
		String c=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[2]")).getText();
	}
//To get the name of first product	
	public String firstProduct()
	{
		String a=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[2]")).getText();
		return a;
	}
//To get the name of second product 
	public String secondProduct()
	{
		String c=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[2]/td[2]")).getText();
		return c;
	}
//To close the browser
	public void closeBrowser() {
		driver.close();
	}
	
}
