
package com.step;

import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

;

public class HooksClass extends BaseClass {

	@BeforeStep
	public void beforeScenario() {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------");

	}

	@AfterStep
	public void afterScenario() throws InterruptedException, IOException {

		screenShot();
		quiteWindow();

	}
}
