package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.ElectronicMobile;

public class cellphone extends BaseClass
{
  @Test
  public void phone()
  {
	  ElectronicMobile em=new ElectronicMobile(driver);
	  em.getElect().click();
	  em.getCellphone().click();
	  
  }
}
