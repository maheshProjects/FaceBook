
package com.step;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HooksClass extends BaseClass {

	@BeforeMethod
	public void beforeScenario() {
		System.out.println("----------------------------------------------------------------------------");
	System.out.println(" Started");
	}

	@AfterMethod
	public void afterScenario(ITestResult result) throws IOException, InterruptedException {

		Thread.sleep(1500);

		if (ITestResult.FAILURE == result.getStatus()) {

			System.out.println("Test Failed: " + result.getName());
			
			screenShot();

			quiteWindow();

			System.out.println(" Scenario Complete");
		} else {
			
			quiteWindow();

			System.out.println(" Scenario Complete");
		}
	}
}
