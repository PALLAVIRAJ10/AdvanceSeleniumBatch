package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.BooksPage;
import objectRepositry.Digital;

public class TC_DWS_08_Test extends BaseClass
{
 @Test
 
 public void digitdescription()
 {
	 Digital dg=new Digital(driver);   
		String ExpectedTitle="Demo web shop digital2";
		UtilityClass utility=new UtilityClass();
		dg.getDigital().click();
		Reporter.log("clicked on Digital button", true);
 }
}
