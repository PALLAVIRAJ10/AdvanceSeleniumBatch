package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.REgisterPage;

public class TestcaseID extends BaseClass
{
@Test
public void description()
{

	REgisterPage page=new REgisterPage(driver);
	page.getReg().click();
	page.getFirstname().sendKeys("pallavi");
	page.getLastname().sendKeys("M");
	page.getEmail().sendKeys("pallavim@gmail.com");
	page.getPwd().sendKeys("pallavi12");
	page.getCfmpwd().sendKeys("pallavi12");
	page.getRegbutton().click();
	
}
}
