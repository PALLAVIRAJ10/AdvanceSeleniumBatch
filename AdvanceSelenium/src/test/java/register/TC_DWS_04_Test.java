package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.REgisterPage;
import objectRepositry.electronics;

public class TC_DWS_04_Test extends BaseClass
{
	@Test
	public void electrionics()
	{
		electronics ele=new electronics(driver);
		String ExpectedTitle="Demo web shop camera1";
		UtilityClass utility=new UtilityClass();
		ele.getElect().click();
		Reporter.log("clicked on electrionics in button", true);
		
		ele.getCamera().click();
		Reporter.log("clicked on camera ", true);
		
	}		
}
