package com.gozee.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GozeeSiteTabs {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.className("gsfi")).sendKeys("gozee app");
		driver.findElement(By.className("lsb")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gozee")).click();
		Thread.sleep(5000);
		System.out.println("Page Title is: " + driver.getTitle());
		System.out.println("\nURL: " + driver.getCurrentUrl());
		
		
		if(driver.getTitle().equals("Gozee"))
		{
			System.out.println("\nGoogle App Search Works");
		}
		else
		{
			System.out.println("\nGoogle App Search doesnt work");
		}
		//driver.close();
	
	
	
	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
	 driver.navigate().to("http://healthadvs2.cloudapp.net/");
	
		//driver.get("http://healthadvs2.cloudapp.net/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@href='/terms-of-service']")).click();	
		if(driver.getPageSource().contains("Gozee Terms of Service"))
		{
			System.out.println("Terms of Service Page loads successfully");
		}
		else
		{
			System.out.println("Terms of Service Page has failed to load");
		}
		driver.findElement(By.xpath("//a[@href='/privacy-policy']")).click();	
		if(driver.getPageSource().contains("Gozee Privacy Policy"))
		{
			System.out.println("Policy Page loads successfully");
		}
		else
		{
			System.out.println("Policy Page has failed to load");
		}
		//driver.findElement(By.linkText("About Us"));*/
		}
}

		
		//Add text to allow pop-up of the accessmobile page
		
	
	


