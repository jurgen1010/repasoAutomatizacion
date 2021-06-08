package com.tcs.certificacion.simularcredito.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/SimularCredito.feature"
,glue="com.tcs.certificacion.simularcredito.stepdefinitions"
,snippets=SnippetType.CAMELCASE)
public class SimularRunner {

}
