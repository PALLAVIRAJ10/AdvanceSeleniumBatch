package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {
 public String propertyFileReader(String key) throws IOException  {
	 FileInputStream fis = new FileInputStream("PROPERTYFILEPATH");
	 FileInputStream fis1=new FileInputStream("PROPERTYFILEPATH1");
	 FileInputStream fis2=new FileInputStream("PROPERTFILEPATH2");
	 Properties property = new Properties();
	 Properties property1=new Properties();
	 Properties property2=new Properties();
	 property1.load(fis1);
	 property2.load(fis2);
	 property.load(fis);
	 
	 String value = property.getProperty(key);
	String value1 = property1.getProperty(key);
	String value3 = property2.getProperty(key);
	 
	return value;

 }
}
