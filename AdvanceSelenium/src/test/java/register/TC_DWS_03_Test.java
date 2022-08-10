package register;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.LoginPage;
import objectRepositry.REgisterPage;

public class TC_DWS_03_Test extends BaseClass
{
  @Test
  public void Validate_that_Firstname_with_valid_credentails() throws IOException
  {
	 REgisterPage page=new REgisterPage(driver);
		String ExpectedTitle="Demo web Shop1";
		UtilityClass utility=new UtilityClass();
		page.getReg().click();
		Reporter.log("clicked on regesiter in button", true);
		
		page.getFirstname().sendKeys(utility.propertyFileReader("Firstname"));
		assertEquals(utility.propertyFileReader("Firstname"), page.getFirstname().getAttribute("value"), "Firstname is proper");
		Reporter.log("Succesfully entered FirstName",true);
		
		page.getLastname().sendKeys(utility.propertyFileReader("Lastname"));
		assertEquals(utility.propertyFileReader("Lastname"), page.getLastname().getAttribute("value"), "lastname is proper");
		Reporter.log("Succesfully entered Lastname",true);
		
		page.getLastname().sendKeys(utility.propertyFileReader("Email"));
		assertEquals(utility.propertyFileReader("Email"), page.getEmail().getAttribute("value"), "email is proper");
		Reporter.log("Succesfully entered Email",true);
		

		page.getPwd().sendKeys(utility.propertyFileReader("password"));
		assertEquals(utility.propertyFileReader("password"), page.getPwd().getAttribute("value"), "password is proper");
		Reporter.log("Succesfully entered password",true);
		
		page.getCfmpwd().sendKeys(utility.propertyFileReader("confrim pwd"));
		assertEquals(utility.propertyFileReader("confirm pwd"), page.getCfmpwd().getAttribute("value"), "confrim password is proper");
		Reporter.log("Succesfully entered confrim pwd",true);
		
		page.getRegbutton().click();
		Reporter.log("Succesfully register to the application",true);
		assertNotEquals(ExpectedTitle, driver.getTitle(),"Test case passed");
  }

}
