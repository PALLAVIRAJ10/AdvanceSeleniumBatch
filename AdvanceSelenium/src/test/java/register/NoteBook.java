package register;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepositry.Computer1;

public class NoteBook extends BaseClass
{
 @Test
 public void notebook()
 {
	 Computer1 comp=new Computer1(driver);
	 comp.getComp().click();
	 comp.getNotbook().click();
 }
}
