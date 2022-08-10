package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.electronics;

public class camera extends BaseClass
{
  @Test
  public void camera()
  {
	  electronics ele=new electronics(driver);
	  ele.getElect().click();
	  ele.getCamera().click();
	  
  }
}
