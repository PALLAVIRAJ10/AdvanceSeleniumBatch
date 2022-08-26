package genericUtilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class DemoForITestListner implements ITestListener 
{
public void onTestStart(ITestResult result)
{
	System.out.println("on test start");
}
public void onTestSucess(ITestResult result)
{
	System.out.println("test passed"+""+result.getName());
}
public void onTestSkipped(ITestResult result)
{
	System.out.println("test failed"+""+result.getName());
}
}

