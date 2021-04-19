package com.atmecs.AutomationAspire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class AppTest 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://14.98.116.9/aspire_qa/login");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("employee@atmecs.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("atmecs@123");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();


		driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/aside/div/nav/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"employeeTimesheet\"]/div[2]/table/tbody/tr/td[3]/a/span")).click();
    
		 Select activity = new Select(driver.findElement(By.xpath("//table[@id='table_0']/tbody/tr/td/select")));
		 activity.selectByValue("21");
		 
		 for(int i=2;i<7;i++) {
		 driver.findElement(By.xpath("//tbody/tr[@id='tr_8']/td["+i+"]/input[1]")).sendKeys("9:00");
		 }

    }
}

