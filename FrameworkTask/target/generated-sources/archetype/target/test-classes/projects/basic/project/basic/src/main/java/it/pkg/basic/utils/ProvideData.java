package it.pkg.basic.utils;

import it.pkg.basic.utils.ReadExcel;



public class ProvideData {
	Object[][] object;
    ReadExcel provider;
    
    /**
     * Constructor used for loading of the file
     * @param filepath
     */
    public ProvideData(String filepath ) {
		provider = new ReadExcel(filepath);
	}
    
    /**
	 * methods takes parameter as
	 * @param excelSheetIndex
	 * @return the object array containing the cell data
	 */
    public Object[][] testData(int excelSheetIndex) {
		int sheetIndex=excelSheetIndex;
		int rowNo= 1;
		int rowCount = provider.totalRowsinSheet(sheetIndex);
		int colCount = provider.totalColsinSheet(sheetIndex,rowNo);

		Object[][] data = new Object[rowCount][colCount];

		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
			for (int colIndex = 0; colIndex < colCount; colIndex++) {

				data[rowIndex][colIndex] = ReadExcel.getData(sheetIndex, rowIndex + 1, colIndex);
			}
		}
		return data;
	}
}
