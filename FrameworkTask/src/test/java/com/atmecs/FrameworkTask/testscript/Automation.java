package com.atmecs.FrameworkTask.testscript;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.FrameworkTask.dataproviders.TestdataProvider;


public class Automation 
{	
WebDriver driver;


@BeforeClass
public static void invokeBrowser() throws IOException   {

	System.out.println("Before method started");
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.konakart.com/konakart/Welcome.action");

	}

@Test
public void testCase1() {
	System.out.println("TEstCase1");
}
@Test(dataProvider="Testing",dataProviderClass = TestdataProvider.class)
public void testing1(String values){
    System.out.println("test has started"); 
	for(int i=0;i<6;i++) {
		Select ele=new Select(driver.findElement(By.xpath("//*[@id=\"top-cat-list\"]")));
		ele.selectByIndex(i);
	    }
		WebElement txt=driver.findElement(By.xpath("//*[@id=\"search-input\"]"));
        txt.sendKeys(values);

	    driver.findElement(By.xpath("//*[@id=\"search-button\"]")).click();
}





@AfterMethod
public void done() {
	driver.quit();
}
}
	







