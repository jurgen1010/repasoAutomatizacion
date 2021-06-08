package com.tcs.certificacion.CalculadoraWindows.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/CalculadoraWindows.feature",
glue="com.tcs.certificacion.CalculadoraWindows.stepdefinitions",
snippets = SnippetType.CAMELCASE,
tags="@tag5"
)
public class CalculadoraRunner {

}
