package register;

import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepositry.BooksPage;
import objectRepositry.electronics;

public class TC_DWS_07_Test extends BaseClass
{
 @Test
 public void booksdescription()
 {
	BooksPage bp=new BooksPage(driver);
		String ExpectedTitle="Demo web shop books2";
		UtilityClass utility=new UtilityClass();
		bp.getBooks().click();
		Reporter.log("clicked on Books button", true);
		
	
 }
}
