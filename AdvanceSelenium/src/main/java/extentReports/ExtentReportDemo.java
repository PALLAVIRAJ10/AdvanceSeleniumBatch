package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
@Test
public void demo()
{
	ExtentHtmlReporter repoter= new ExtentHtmlReporter("./extentReports/samplereport1.html");
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(repoter);
	ExtentTest logger= reports.createTest("demo");
			logger.log(Status.PASS, "the test is passed");
			
			logger.log(Status.INFO, "this is information");
			//logger.addScreenCaptureFromPath("./Screenshot/readingData 2022-08-08T15-51-20.356010.png");
			logger.log(Status.FAIL, "the test is failed");
			reports.flush();
	
}
}
