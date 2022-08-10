package login;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.LoginPage;

public class TC_DWS_01_Test extends BaseClass {
@Test
public void validate_whether_user_login_with_valid_credentials() throws IOException
{
	LoginPage page=new LoginPage(driver);
	String ExpectedTitle="Demo web Shop1";
	UtilityClass utility=new UtilityClass();
	page.getLogin().click();
	Reporter.log("clicked on logged in button", true);
	
	page.getEmail().sendKeys(utility.propertyFileReader("USER"));
	assertEquals(utility.propertyFileReader("username"), page.getEmail().getAttribute("value"), "Email Adderss is not proper");
	Reporter.log("Succesfully entered email adderss",true);
	
	page.getPassword().sendKeys(utility.propertyFileReader("password"));
	assertEquals(utility.propertyFileReader("password"), page.getPassword().getAttribute("value"), "password is not proper");
	Reporter.log("Succesfully entered email adderss",true);
	
	page.getLogin().click();
	Reporter.log("Succesfully Logged in to the application",true);
	assertNotEquals(ExpectedTitle, driver.getTitle(),"Test case failed");
	
}

}
