package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.computers;
import objectRepositry.electronics;

public class TC_DWS_05_Test extends BaseClass {
	@Test
	public void desk()
	{
		computers com=new computers();
		String ExpectedTitle="Demo web shop computer1";
		UtilityClass utility=new UtilityClass();
		com.getComputer().click();
		Reporter.log("clicked on computer in button", true);
		
		com.getDesktops().click();
		Reporter.log("clicked on desktop ", true);
		
	}
}
