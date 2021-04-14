package com.atmecs.FrameworkTask.pages;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.atmecs.FrameworkTask.helpers.CommonUtility;
import com.atmecs.FrameworkTask.constants.FileConstants;
import com.atmecs.FrameworkTask.utils.ReadProperties;

public class Homepage {

		Properties locators;
	CommonUtility commonUtility;
		
		public Homepage(WebDriver driver)
		{
			try {
				locators=ReadProperties.loadProperty(FileConstants.lOCATORS_FILE);
				commonUtility=new CommonUtility(driver);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void validateHeaders(String expectedHeaderName) {
			// TODO Auto-generated method stub
			String actualHeaderName=commonUtility.getText(locators.getProperty("loc_header_name").replace("[xxxx]", expectedHeaderName));
			Assert.assertEquals(actualHeaderName,expectedHeaderName);
			System.out.println("the headers of atmecs site:-"+actualHeaderName);
		}
	}


