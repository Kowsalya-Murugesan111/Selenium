package it.pkg.basic.dataproviders;
import org.testng.annotations.DataProvider;

import it.pkg.basic.constants.FileConstants;
import it.pkg.basic.utils.ProvideData;

public class TestdataProvider {

	

	public class TestDataProvider {
		@DataProvider(name = "headerData")
		public Object[][] testData() {
			ProvideData provideData = new ProvideData(FileConstants.TESTDATA_FILE);
			Object[][] getData = provideData.testData(0);
			return getData;
		}
	}


}
