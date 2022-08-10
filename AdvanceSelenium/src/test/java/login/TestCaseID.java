package login;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.LoginPage;

public class TestCaseID extends BaseClass {
@Test
public void testCaseDescription()
{
	LoginPage page=new LoginPage(driver);
	page.getLogin().click();
	page.getEmail().sendKeys("pallavi@gmail.com");
	page.getPassword().sendKeys("pallavi12");
	page.getLoged().click();
}
}
