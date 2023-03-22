package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features", glue = {"com.steps","com.hooks"},dryRun = false, plugin="html:src\\test\\resources\\reports\\fbTitle.html")
public class TestRunner extends AbstractTestNGCucumberTests {

}
