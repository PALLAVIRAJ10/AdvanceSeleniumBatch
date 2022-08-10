package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.computers;

public class desktop extends BaseClass{
   @Test
   public void camera()
   {
	   computers com = new computers();
	  com.getComputer().click();
	  com.getDesktops().click();
	  
   }
}
