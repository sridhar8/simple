package com.Sample_Mini_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MavenWorkCheck {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sri\\eclipse-workspace\\Sample_Mini_Project\\Driver\\chromedriver.exe");
	WebDriver driver=	new ChromeDriver();
driver.get("https://twitter.com/i/flow/signup");
driver.manage().window().maximize();
System.out.println(driver.getCurrentUrl());
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sridhar");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("8190983883");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement select1 = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[1]"));
Select a=new Select(select1);
a.selectByValue("2");
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement select2 = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[2]"));
Select b=new Select(select2);
b.selectByValue("2");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement select3 = driver.findElement(By.xpath("(//select[@aria-invalid='false'])[3]"));
Select c=new Select(select3);
c.selectByValue("2009");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[.='Next']")).click();

	
	}

}
