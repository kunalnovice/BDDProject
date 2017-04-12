package com.meeting.sample;

/**
 * Created by ashvimehta on 08/04/2017.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features", glue = "com.meeting.sample.StepDefs" , tags = { "@test" }, monochrome= true , plugin = {"pretty", "html:target/cucumber-report/BDDProject","json:target/cucumber.json"})
public class RunnerTest {
}
