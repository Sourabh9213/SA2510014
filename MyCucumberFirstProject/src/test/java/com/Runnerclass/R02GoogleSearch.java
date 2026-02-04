package com.Runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberFirstProject/MyCucumberFirstProject/GoogleSearch.feature",
				glue = "com.StepDefinition")

public class R02GoogleSearch {

}
