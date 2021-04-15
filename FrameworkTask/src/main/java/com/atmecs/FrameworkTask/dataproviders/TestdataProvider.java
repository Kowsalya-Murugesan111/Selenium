package com.atmecs.FrameworkTask.dataproviders;
import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.atmecs.FrameworkTask.constants.FileConstants;
import com.atmecs.FrameworkTask.utils.ProvideData;

public class TestdataProvider {
	@DataProvider(name="Testing")
	 public Object[][] userData() throws IOException
	    {
		ProvideData provideData = new ProvideData(FileConstants.TESTDATA_FILE);
		Object[][] getData = provideData.testData(0);
		return getData;
     
        
         
	    }	
	    
}



