package com.testRunner_1;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue={"com.back_1"}
		)

public class Test_runner555 {
	

}
