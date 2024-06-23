package com.run;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(dryRun = false, tags = "@Run", features = { "src/test/resources/Features" }, glue = { "com.step" },

		plugin = { "pretty", "html:target/htmlreport.html" })

public class ExcutionClass extends AbstractTestNGCucumberTests {

}
