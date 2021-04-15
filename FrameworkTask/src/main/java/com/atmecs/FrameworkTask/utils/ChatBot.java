package com.atmecs.FrameworkTask.utils;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChatBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.konakart.com/konakart/Welcome.action");
		
		driver.manage().window().maximize();

	//	iframe  //*[@id="fb-root"]/div[2]/span/iframe
//close //*[@id="u_0_0_Fg"]/div/div/div/div/div/div/div[1]/div[3]/div[2]/div
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class,'anchor_right')]")));
		System.out.println("frame found");
		
		
	driver.findElement(By.xpath("//*[@id=\"u_0_0_Fg\"]/div/div/div/div/div/div/div[1]/div[3]/div[2]/div[@aria-label]")).click();
	System.out.println("Chat close");
	}

}
