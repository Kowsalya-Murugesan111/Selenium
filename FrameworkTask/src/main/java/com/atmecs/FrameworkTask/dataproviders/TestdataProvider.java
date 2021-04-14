package com.atmecs.FrameworkTask.dataproviders;
import org.testng.annotations.DataProvider;

import com.atmecs.FrameworkTask.constants.FileConstants;
import com.atmecs.FrameworkTask.utils.ProvideData;

public class TestdataProvider {
	@DataProvider(name="Testing")
	 public Object[][] userFormData() throws Exception
	    {
		System.out.println("data provider strated");
		ProvideData provideData = new ProvideData(FileConstants.TESTDATA_FILE);
		Object[][] getData = provideData.testData(0);
        System.out.println("data provider ended"); 
		return getData;
     
        
         
	    }	
	    
}



