package com.tcs.certificacion.electricprism.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/feature/electricprism.feature",
glue="com.tcs.certificacion.electricprism.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class electricprism {

	
}
