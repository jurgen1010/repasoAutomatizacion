package com.tcs.certificacion.AdvantageShoppingMobile.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/registrousuario.feature",
glue="com.tcs.certificacion.AdvantageShoppingMobile.stepdefinitions",
snippets=SnippetType.CAMELCASE)
public class AdvantangeMobileRunner {

}
