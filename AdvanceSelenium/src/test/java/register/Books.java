package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.BooksPage;

public class Books extends BaseClass
{
  @Test
  public void Books()
  {
	  BooksPage bp=new BooksPage(driver);
	  bp.getBooks().click();
  }
}
