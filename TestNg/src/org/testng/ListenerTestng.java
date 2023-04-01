package org.testng;
import org.testng.ITestListener;

public class ListenerTestng  implements ITestListener{
	//ITestListener is a interface override unimplemented methods
	//Listener are activated before and after test cases
	//we have to write the implemented methods in file
	//we can use other xml file use
	// <class name="org.testng.LearnGroups"/> i used
	//<listeners>
	//<listener class-name="org.testng.ListenerTestng"></listener></listeners>
	public void onStart() {

		System.out.println("Start test cases");
	}
	public void onTestStart()
	{
		System.out.println("now Test Started");
	}

	public void onTestSuccess() {
		System.out.println("Test Success");
	}

	public void onTestFailure() {
		System.out.println("Test Failure");
	}

	public void onTestSkipped() {
		System.out.println("Test Skipped");
	}

	public void onFinish() {
		System.out.println("Test Finished");   
	}


}
