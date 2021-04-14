#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.dataproviders;
import org.testng.annotations.DataProvider;

import ${package}.${artifactId}.constants.FileConstants;
import ${package}.${artifactId}.utils.ProvideData;

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
