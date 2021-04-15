package com.atmecs.FrameworkTask.testscript;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.FrameworkTask.dataproviders.TestdataProvider;
import com.atmecs.FrameworkTask.pages.Homepage;
import com.atmecs.FramworkTask.testbase.Testbase;

public class Automation extends Testbase {

	Properties locators;
	Homepage HomepageObject;

	@BeforeClass
	public void invokeBrowser() throws IOException {

		driver.get("https://www.konakart.com/konakart/Welcome.action");
		driver.manage().window().maximize();

	}

	@Test(priority = 1, dataProvider = "Testing", dataProviderClass = TestdataProvider.class)
	public void testing1(String categories, String UserValues) {
		HomepageObject = new Homepage(driver);
		HomepageObject.validateSearch(categories, UserValues);
	}

}
