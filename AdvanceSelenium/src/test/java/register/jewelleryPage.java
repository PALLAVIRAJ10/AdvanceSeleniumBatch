package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.jewellery;

public class jewelleryPage extends BaseClass
{
  @Test
  public void jewellerypage()
  {
	  jewellery jewel=new jewellery(driver);
	  jewel.getJewel().click();
  }
}
