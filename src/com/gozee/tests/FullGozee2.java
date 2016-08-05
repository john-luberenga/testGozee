package com.gozee.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullGozee2 {

	
	public static void main(String[] args) throws InterruptedException {
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\John BackUp\\PROGRAMMING\\SOFTWARE\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://healthadvs2.cloudapp.net/");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,400)");
		Thread.sleep(2000);
		
		
		//Code to read the place holders in each section
		
		
		driver.findElement(By.id("ember808")).sendKeys("Uganda");
		driver.findElement(By.id("ember815")).click();
		Thread.sleep(2000);
		System.out.println("Number of Facilities in Uganda:" + driver.findElement(By.className("result-text")).getText());	   
		
		//Code to scroll back
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("ember1011")).sendKeys("Kenya");
		driver.findElement(By.id("ember1017")).click();
		Thread.sleep(2000);
		System.out.println("Number of Facilities in Kenya:" + driver.findElement(By.className("result-text")).getText());
		
		//Code to scroll back
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.id("ember1091")).sendKeys("Kampala");
		driver.findElement(By.id("ember1097")).click();
		Thread.sleep(2000);
		System.out.println("Number of Facilities in Kampala:" + driver.findElement(By.className("result-text")).getText());	
		
		jse.executeScript("scroll(0,400)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//h3[@title='Care Clinic - test']")).click();
		jse.executeScript("scroll(0,-400)");
		Thread.sleep(2000);
		driver.findElement(By.id("ember1517")).click();
		
		jse.executeScript("scroll(0,400)");	
		
		//Code to select Calendar
		driver.findElement(By.className("slot can-create")).click();		
		driver.findElement(By.id("ember2029")).sendKeys("John");
		driver.findElement(By.id("ember2031")).sendKeys("Smith");
		driver.findElement(By.id("ember2054")).sendKeys("Medical Checkup");
		driver.findElement(By.id("ember2059")).sendKeys("256779127009");
		
		
		
		driver.navigate().to("http://next.cliniccommunicator.com");

	}

}
