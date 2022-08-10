package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.ElectronicMobile;
import objectRepositry.electronics;

public class TC_09_DWS_Test extends BaseClass
{
 @Test
 public void description()
 {

		ElectronicMobile em=new ElectronicMobile(driver);
		String ExpectedTitle="Demo web shop mobile1";
		UtilityClass utility=new UtilityClass();
		em.getElect().click();
		Reporter.log("clicked on electrionics in button", true);
		
		em.getCellphone().click();
		Reporter.log("clicked on cellphone ", true);
 }
}
