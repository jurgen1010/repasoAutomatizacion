package com.tcs.certificacion.sucursalvirtualpersonas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Login.feature",
glue="com.tcs.certificacion.sucursalvirtualpersonas.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class LoginRunner {

}
