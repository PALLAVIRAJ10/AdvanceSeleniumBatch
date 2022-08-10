package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.Digital;

public class DigitalRefresh extends BaseClass
{
  @Test
  
  public void digital()
  {
	  Digital dg=new Digital(driver);
	  dg.getDigital().click();
  }
}
