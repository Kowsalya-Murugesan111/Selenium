package com.atmecs.FrameworkTask.pages;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import com.atmecs.FrameworkTask.helpers.CommonUtility;
import com.atmecs.FrameworkTask.constants.FileConstants;
import com.atmecs.FrameworkTask.utils.ReadProperties;

public class Homepage {

	Properties locators;
	CommonUtility commonUtility;
	WebDriver driver;

	public Homepage(WebDriver driver) {
		try {
			locators = ReadProperties.loadProperty(FileConstants.lOCATORS_FILE);
			commonUtility = new CommonUtility(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void validateSearch(String categories, String UserValues) {
		// TODO Auto-generated method stub
		commonUtility.clickOnElement(locators.getProperty("loc_cookies"));

		commonUtility.selectDropdown(categories, locators.getProperty("loc_select"));

		commonUtility.clickAndSendText(UserValues, locators.getProperty("loc_search"));
		commonUtility.clickOnElement(locators.getProperty("loc_button"));

		if (locators.getProperty("loc_find") != null) {
			System.out.println("Product found");
		} else {
			System.out.println("Product not found");
		}

	}
}
