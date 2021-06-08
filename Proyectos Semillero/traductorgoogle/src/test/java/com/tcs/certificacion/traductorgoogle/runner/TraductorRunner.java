package com.tcs.certificacion.traductorgoogle.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/traductor.feature"
,glue="com.tcs.certificacion.traductorgoogle.stepdefinitions"
,snippets=SnippetType.CAMELCASE)
public class TraductorRunner {

}
