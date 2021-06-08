package com.tcs.certificacion.calculadoramultiplataforma.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/calculadorasmultiplataforma.feature",
glue="com.tcs.certificacion.calculadoramultiplataforma.stepdefinitions",
snippets=SnippetType.CAMELCASE
)
public class CalculadorasRunners {

}
