package com.tcs.certificacion.CalendarioSP.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Calendario.feature",
glue="com.tcs.certificacion.CalendarioSP.stepdefinitions",
snippets=SnippetType.CAMELCASE
)
public class CalendarioRunner {

}
