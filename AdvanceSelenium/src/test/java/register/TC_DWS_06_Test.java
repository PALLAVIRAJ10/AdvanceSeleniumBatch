package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.electronics;
import objectRepositry.jewellery;

public class TC_DWS_06_Test extends BaseClass
{
 @Test
 public void jewellery()
 {
	 jewellery jewel=new jewellery(driver);
		String ExpectedTitle="Demo web shop jewellery1";
		UtilityClass utility=new UtilityClass();
		jewel.getJewel().click();
		Reporter.log("clicked on jewwellery in button", true);
		
		
 }
	
}
