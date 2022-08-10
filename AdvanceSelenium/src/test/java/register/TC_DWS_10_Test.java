package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.Computer1;
import objectRepositry.ElectronicMobile;

public class TC_DWS_10_Test extends BaseClass
{
@Test
public void description()
{
	Computer1 com=new Computer1(driver);
	String ExpectedTitle="Demo web shop notebook1";
	UtilityClass utility=new UtilityClass();
	com.getComp().click();
	Reporter.log("clicked on computers in button", true);
	
	com.getNotbook().click();
	Reporter.log("clicked on notebook ", true);
}
}
