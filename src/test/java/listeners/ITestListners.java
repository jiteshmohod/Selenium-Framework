package listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import resources.ExtentReportNG;
public class ITestListners implements ITestListener {

	@Override
	 public  void onTestFailure(ITestResult result) {
		 System.out.println("Test Failed: " + result.getName());
		 ExtentReportNG.getTest().log(Status.FAIL, "Test Failed: " + result.getThrowable());
		  }
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed: " + result.getName()+ "&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		ExtentReportNG.getTest().log(Status.PASS, "Test Passed");
	  }
}
