package com.atmecs.FrameworkTask.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kanokart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.konakart.com/konakart/Welcome.action");
		for (int i = 0; i < 6; i++) {
			Select ele = new Select(driver.findElement(By.xpath("//*[@id=\"top-cat-list\"]")));
			ele.selectByIndex(i);
		}
		WebElement txt = driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
		txt.sendKeys("Printer");

		driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
	}
}
