package com.tcs.certificacion.calculadoramobilegradle.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Calculadora.feature",
glue="com.tcs.certificacion.calculadoramobilegradle.stepdefinitions",
snippets = SnippetType.CAMELCASE
)
public class CalculadoraMobileRunner {

}
