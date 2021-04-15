package com.atmecs.FrameworkTask.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.FrameworkTask.helpers.waitelement;

public class Kanokart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.konakart.com/konakart/Welcome.action");
		driver.findElement(By.xpath("//*[@id=\"cookie-warn-button\"]")).click();
		for (int i = 1; i < 6; i++) {
			Select ele = new Select(driver.findElement(By.xpath("//*[@id=\"top-cat-list\"]")));
			ele.selectByIndex(i);
		WebElement txt = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
		txt.sendKeys("Printer");
		waitelement waitObject = new waitelement();
		waitObject.waitForPageLoadTime(driver);
		waitObject.waitForImplicit(driver);
		//driver.switchTo().window(subWindowHandler);
		
		driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
	}
}
}
