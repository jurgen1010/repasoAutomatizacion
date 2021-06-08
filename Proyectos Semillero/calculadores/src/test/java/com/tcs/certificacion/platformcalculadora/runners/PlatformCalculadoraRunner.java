package com.tcs.certificacion.platformcalculadora.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/calculadora.feature",
glue="com.tcs.certificacion.platformcalculadora.stepsdefinitions",
snippets=SnippetType.CAMELCASE)
public class PlatformCalculadoraRunner {

}
