package com.google.certificacion.googletraductor.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/GoogleTraductor.feature"
,glue="com.google.certificacion.googletraductor.definitions"
,snippets=SnippetType.CAMELCASE
		)

public class TraductorRunner {

}
