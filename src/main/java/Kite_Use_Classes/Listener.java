package Kite_Use_Classes;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends Base implements ITestListener {
	
	Base B = new Base();
	
	
	public void onTestSuccess(ITestResult result) {
		
		Reporter.log("Congratulataion TC is passed = "+result.getName(),true);
	}
    
	
	public void onTestFailure(ITestResult result) {
		
		Reporter.log("Sorry TC is failed =  "+result.getName(),true);
		String name = result.getName();
		
		try {
			B.CaptureScreenshot(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
