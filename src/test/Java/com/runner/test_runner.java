package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(features="src/test/resources/features" ,
					glue="com.steps" , tags="@loginValidation" ,plugin= {"pretty","html:target/cucmber-reports.html","json:target/cucumber.json"},monochrome=true)
public class test_runner extends AbstractTestNGCucumberTests {
	TestNGCucumberRunner testngcucumber = new TestNGCucumberRunner(this.getClass());

}
