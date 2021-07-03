package com.pageautomation.tests.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/secureLogin.feature",
glue = "com.pageautomation.tests.stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags = "@smokeTest")
public class SecureLoginRunner {
}
