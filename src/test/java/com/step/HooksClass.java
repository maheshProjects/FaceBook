
package com.step;

import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

;

public class HooksClass extends BaseClass {

	@BeforeStep
	public void beforeScenario() {
		System.out.println("----------------------------------------------------------------------------");

	}

	@AfterStep
	public void afterScenario() throws InterruptedException, IOException {

		screenShot();

		System.out.println("Screenshot compleated");

	}

	@After
	public void quiteMethod() {

		quiteWindow();

	}

}
