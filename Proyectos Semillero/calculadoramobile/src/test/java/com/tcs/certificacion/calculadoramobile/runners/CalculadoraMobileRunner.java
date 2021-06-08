package com.tcs.certificacion.calculadoramobile.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/CalculadoraMobile.feature",
glue="com.tcs.certificacion.calculadoramobile.stepdefinitions",
snippets = SnippetType.CAMELCASE
)
public class CalculadoraMobileRunner {

}
