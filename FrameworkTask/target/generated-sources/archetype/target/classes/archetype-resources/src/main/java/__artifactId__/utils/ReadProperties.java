#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class ReadProperties {
	static Properties property;
	static File file;
	static FileReader reader;
	
	/**
	 * methods takes parameter as
	 * @param filePath
	 * @return the properties of the property file
	 * @throws IOException
	 */
	public static Properties loadProperty(String pathName) throws IOException {
		property= new Properties();
		file = new File(pathName);
		reader = new FileReader(file);
		property.load(reader);

		return property;
	}
}
